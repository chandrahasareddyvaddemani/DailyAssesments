package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CurdAssaignments.Currencies;

@Repository
public interface CurenciesRepository extends JpaRepository<Currencies, Long> {

}
