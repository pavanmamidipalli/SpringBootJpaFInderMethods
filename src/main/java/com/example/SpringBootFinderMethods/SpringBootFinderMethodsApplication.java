package com.example.SpringBootFinderMethods;

import com.example.SpringBootFinderMethods.Service.IVaccineService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringBootFinderMethodsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =SpringApplication.run(SpringBootFinderMethodsApplication.class, args);
		IVaccineService service = context.getBean(IVaccineService.class);
        service.searchVaccineName("covishield").forEach(i-> System.out.println(i));
		service.searchPricingLessThan(5000).forEach(i-> System.out.println(i));
		List<String> list = new ArrayList<>();
		list.add("covishield");
		list.add("sputnik");
		list.add("covaxine");
		service.searchVaccineNameInPricingBetween(list,0,5000).forEach(i-> System.out.println(i));
	}

}
