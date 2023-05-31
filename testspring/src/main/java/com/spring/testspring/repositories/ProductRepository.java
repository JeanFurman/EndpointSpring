package com.spring.testspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.testspring.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
	
}
