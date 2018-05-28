package com.github.axelfritz.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.github.axelfritz.entity.Cart;
import com.github.axelfritz.repository.CartRepository;

public class CartServiceImplementation implements CartService{

	@Autowired
	private CartRepository cartRepo;
	
	@Override
	public void add(Cart cart) {
		this.cartRepo.save(cart);
	}

	@Override
	public void delete(Long id) {
		this.cartRepo.deleteById(id);
	}

	@Override
	public Optional<Cart> getById(Long id) {
		return this.cartRepo.findById(id);
	}

	@Override
	public Collection<Cart> getAll() {
		return (Collection<Cart>) this.cartRepo.findAll();
	}

	
	
}
