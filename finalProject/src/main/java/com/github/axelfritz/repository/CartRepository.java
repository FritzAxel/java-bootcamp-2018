package com.github.axelfritz.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.github.axelfritz.entity.Cart;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long>{
	Optional<Cart> findById(Long id);
}
