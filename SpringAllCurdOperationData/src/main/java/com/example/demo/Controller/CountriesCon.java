package com.example.demo.Controller;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.CurdAssaignments.Countries;
import com.example.demo.repository.CountriesRepository;
@RestController
@RequestMapping("/Countries")

public class CountriesCon {
	@Autowired
	private CountriesRepository countriesRepository;
	
	@PostMapping
	public Countries addCountries(@RequestBody Countries countries) {
		return countriesRepository.save(countries);
	}

	@GetMapping
	public List<Countries> listEmployee() {
	return countriesRepository.findAll();
	}
	@PutMapping
	public Countries updateEmployee(@RequestBody Countries countries) {
	return countriesRepository.save(countries);

	}
	@DeleteMapping
	public String deleteCountries(@RequestBody Countries countries) {
		countriesRepository.delete(countries);
	return "deleteddata";
}
}
