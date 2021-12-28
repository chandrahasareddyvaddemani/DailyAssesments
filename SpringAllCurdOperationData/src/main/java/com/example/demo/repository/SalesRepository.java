package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CurdAssaignments.Sales;

@Repository
public interface SalesRepository extends JpaRepository<Sales, Long> {

}
