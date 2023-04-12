package com.example.demo;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CountryService {
	@Autowired
	private CountryRepository countryRepository;
	@Transactional
	public List<Country> getAllCountry() {
		return countryRepository.findAll();
	}
	@Transactional 
	public Country findCountryByCode(String countryCode) {
		Optional<Country> result = countryRepository.findById(countryCode);
		Country country=result.get();
		return country;
	}
	
	}
