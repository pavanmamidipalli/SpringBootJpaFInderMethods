package com.example.SpringBootFinderMethods.Service;

import com.example.SpringBootFinderMethods.Entity.VaccineDetails;

import java.util.Collection;
import java.util.List;

public interface IVaccineService {
    public List<VaccineDetails> searchVaccineName(String vaccinename);
    public List<VaccineDetails> searchPricingLessThan(int pricing);
    public List<VaccineDetails> searchVaccineNameInPricingBetween(Collection<String> name,int start, int end);
}
