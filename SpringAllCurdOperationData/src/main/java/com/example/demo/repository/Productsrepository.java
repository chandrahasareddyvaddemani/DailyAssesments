package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.CurdAssaignments.Products;

@Repository
public interface Productsrepository  extends JpaRepository<Products, Long>{

}
