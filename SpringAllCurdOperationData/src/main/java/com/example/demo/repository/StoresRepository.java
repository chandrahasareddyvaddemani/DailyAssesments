package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CurdAssaignments.Stores;

@Repository
public interface StoresRepository extends JpaRepository<Stores, Long> {

}
