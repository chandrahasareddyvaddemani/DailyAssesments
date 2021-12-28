package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CurdAssaignments.Countries;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Long>{

}
