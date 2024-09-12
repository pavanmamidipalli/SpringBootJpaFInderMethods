package com.example.SpringBootFinderMethods.Service;

import com.example.SpringBootFinderMethods.Entity.VaccineDetails;
import com.example.SpringBootFinderMethods.Repo.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
@Service
public class VaccineService implements IVaccineService{


    @Autowired
    private VaccineRepository vaccineRepository;
    @Override
    public List<VaccineDetails> searchVaccineName(String vaccinename) {
//       List<VaccineDetails> vaccineDetails= vaccineRepository.findByVaccineName(vaccinename);
        //  List<VaccineDetails> vaccineDetails= vaccineRepository.findByVaccineNameIs(vaccinename);
        List<VaccineDetails> vaccineDetails = vaccineRepository.findByVaccineNameEquals(vaccinename);
        return vaccineDetails;

    }

    @Override
    public List<VaccineDetails> searchPricingLessThan(int pricing) {
        return vaccineRepository.findByPricingLessThan(pricing);
    }

    @Override
    public List<VaccineDetails> searchVaccineNameInPricingBetween(Collection<String> name, int start, int end) {
       List<VaccineDetails> vaccineDetails=vaccineRepository.findByVaccineNameInAndPricingBetween(name,start,end);
        return vaccineDetails;
    }


}
