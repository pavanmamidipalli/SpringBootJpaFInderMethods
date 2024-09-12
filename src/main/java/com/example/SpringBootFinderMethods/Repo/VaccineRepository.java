package com.example.SpringBootFinderMethods.Repo;


import com.example.SpringBootFinderMethods.Entity.VaccineDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface VaccineRepository extends JpaRepository<VaccineDetails,Integer> {
    public List<VaccineDetails> findByVaccineName(String name);
    public List<VaccineDetails> findByVaccineNameIs(String name);
    public List<VaccineDetails> findByVaccineNameEquals(String name);
    public List<VaccineDetails> findByPricingLessThan(int pricing);
    public List<VaccineDetails> findByVaccineNameInAndPricingBetween(Collection<String> name, int start, int end);

}
