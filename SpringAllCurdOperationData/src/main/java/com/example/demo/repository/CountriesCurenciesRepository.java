package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CurdAssaignments.CountriesCurrencies;
@Repository
public interface CountriesCurenciesRepository extends JpaRepository<CountriesCurrencies, Long> {
	
	

}
