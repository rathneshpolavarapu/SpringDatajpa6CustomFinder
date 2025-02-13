package com.example.demo.repo;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Vaccine;

public interface Vaccinerepo extends JpaRepository<Vaccine, Integer> {

//	List<Vaccine> findByCost(Double cost);
//
//	List<Vaccine> findByCostIs(Double cost);
//	List<Vaccine> findByCostGreaterThan(Double cost);
	
//	List<Vaccine> findByVaccineEquals(String vaccineName);
//	
//    List<Vaccine>findByVaccineEqualsAndCostEquals(String vaccine,Double cost);
    List<Vaccine>findByVaccineInAndCostBetween(Collection<String> vaccines,Double min,Double max );
}