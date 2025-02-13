package com.example.demo.service;


import java.util.Collection;
import java.util.List;

import com.example.demo.model.Vaccine;

public interface Vaccineservice {
	
//	public List<Vaccine> fetchByCost(Double cost);
//	public List<Vaccine>fetchByCostIs(Double cost);
//	
//	public List<Vaccine> fetchByCostGreaterThan(double cost);
	
//	public List<Vaccine>fetchByVaccineEquals(String vaccineName);
//	
//public     List<Vaccine>fetchByVaccineEqualsAndCostEquals(String vaccine,Double cost);

public List<Vaccine>fetchByVaccineInAndCostBetween(Collection<String> vaccines,Double min,Double max );


}
