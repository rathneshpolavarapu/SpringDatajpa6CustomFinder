package com.example.demo;


import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Vaccine;
import com.example.demo.service.Vaccineservice;

@SpringBootApplication
public class SpringDataJpa3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpa3Application.class, args);
		
		Vaccineservice service=container.getBean(Vaccineservice.class);
		
//           service.fetchByCost(13.4).forEach(v->System.out.print(v));
//           service.fetchByCostIs(13.4).forEach(v->System.out.print(v));
//		service.fetchByCostGreaterThan(13.4).forEach(v->System.out.print(v));
//		service.fetchByVaccineEquals("Sputnick").forEach(v->System.out.print(v));
//		service.fetchByVaccineEqualsAndCostEquals("avacadovaccine", 13.4).forEach(v->System.out.print(v));
		
	Collection<String> vaccines=new HashSet<>();
	vaccines.add("Sputnick");
	vaccines.add("avacadovaccine");
		
		service.fetchByVaccineInAndCostBetween(vaccines, 1.8,15.9).forEach(v->System.out.print(v));;

}

}