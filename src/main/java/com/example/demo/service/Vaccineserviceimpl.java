package com.example.demo.service;


import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.example.demo.model.Vaccine;
import com.example.demo.repo.Vaccinerepo;

@Service
public class Vaccineserviceimpl implements Vaccineservice {

	@Autowired
	private Vaccinerepo repo;

	@Override
	public List<Vaccine> fetchByVaccineInAndCostBetween(Collection<String> vaccines, Double min, Double max) {
		// TODO Auto-generated method stub
		return repo.findByVaccineInAndCostBetween(vaccines, min, max);
		
	}

//	@Override
//	public List<Vaccine> fetchByVaccineEquals(String vaccineName) {
//		// TODO Auto-generated method stub
//		return repo.findByVaccineEquals(vaccineName);
//	}
//
//
//	@Override
//	public List<Vaccine> fetchByVaccineEqualsAndCostEquals(String vaccine, Double cost) {
//		// TODO Auto-generated method stub
//		return repo.findByVaccineEqualsAndCostEquals(vaccine, cost);
//	}


	

	

	

	

//	@Override
//	public List<Vaccine> fetchByCost(Double cost) {
//		// TODO Auto-generated method stub
//		return repo.findByCost(cost);
//	}
//
//	@Override
//	public List<Vaccine> fetchByCostIs(Double cost) {
//		// TODO Auto-generated method stub
//		return repo.findByCostIs(cost);
//	}
//
//	@Override
//	public List<Vaccine> fetchByCostGreaterThan(double cost) {
//		// TODO Auto-generated method stub
//		return repo.findByCostGreaterThan(cost);
//	}

	

	

	

	
		
	}
	

	


