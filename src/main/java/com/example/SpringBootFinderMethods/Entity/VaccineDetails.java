package com.example.SpringBootFinderMethods.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class VaccineDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String vaccineName;
    private String vaccineCompany;
    private int pricing;

    public VaccineDetails(String vaccineName,String vaccineCompany,int pricing) {
        this.vaccineName = vaccineName;
        this.vaccineCompany = vaccineCompany;
        this.pricing=pricing;
    }

    @Override
    public String toString() {
        return "VaccineDetails{" +
                "id=" + id +
                ", vaccineName='" + vaccineName + '\'' +
                ", vaccineCompany='" + vaccineCompany + '\'' +
                ", pricing='" + pricing + '\'' +
                '}';
    }
}

