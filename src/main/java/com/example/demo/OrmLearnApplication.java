package com.example.demo;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class OrmLearnApplication {
	
	public static CountryService countryService;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
		countryService = context.getBean(CountryService.class); 
		testGetAllCountries();
		getCountryByCodeTest();
	}
	public static void testGetAllCountries() {
		List<Country> countries = countryService.getAllCountry();
		System.out.println("Inside application class after calling service"+countries);
		for(Country con:countries) {
			System.out.println(con);
		}
	}
	private static void getCountryByCodeTest(){ 
		Scanner sc=new Scanner(System.in);
		Country country = countryService.findCountryByCode(sc.nextLine());
		System.out.println(country);
	}

}

