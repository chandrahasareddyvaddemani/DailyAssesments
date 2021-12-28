package com.example.demo.Controller;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CurdAssaignments.Countries;
import com.example.demo.CurdAssaignments.CountriesCurrencies;
import com.example.demo.repository.CountriesCurenciesRepository;
@RestController
@RequestMapping("/CouountriesCurencies")

public class CountriesCurrenciesCon {
	@Autowired
	

	private CountriesCurenciesRepository countriesCurenciesRepository;

	@PostMapping
	public CountriesCurrencies addCountries(@RequestBody CountriesCurrencies countriesCurrencies) {
		return countriesCurenciesRepository.save(countriesCurrencies);
	}

	@GetMapping
	public List<CountriesCurrencies> listEmployee() {
		return countriesCurenciesRepository.findAll();
	}

	@PutMapping
	public CountriesCurrencies updateEmployee(@RequestBody CountriesCurrencies countriesCurrencies) {
		return countriesCurenciesRepository.save(countriesCurrencies);

	}

	@DeleteMapping
	public String deleteCountries(@RequestBody CountriesCurrencies countriesCurrencies) {
		countriesCurenciesRepository.delete(countriesCurrencies);
		return "deleteddata";
	}
}
