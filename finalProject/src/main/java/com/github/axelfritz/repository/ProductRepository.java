package com.github.axelfritz.repository;

import java.util.Collection;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.axelfritz.entity.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

	Optional<Product> findById(Long id);
	Product findByName(String name);
	Collection<Product> findByCategory(String category);
	
}
