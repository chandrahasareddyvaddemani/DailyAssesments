package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CurdAssaignments.Customers;

@Repository

public interface CoustomersRepository extends JpaRepository<Customers, Long>{

}
