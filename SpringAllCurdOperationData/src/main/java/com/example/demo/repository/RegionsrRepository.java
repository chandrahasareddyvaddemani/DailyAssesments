package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CurdAssaignments.Regions;

@Repository
public interface RegionsrRepository extends JpaRepository<Regions, Long>{

}
