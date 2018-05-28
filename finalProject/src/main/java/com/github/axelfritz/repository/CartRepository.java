package com.github.axelfritz.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.github.axelfritz.entity.Cart;

public interface CartRepository extends CrudRepository<Cart, Long>{
	Optional<Cart> findById(Long id);
}
