package com.github.axelfritz.service;

import java.util.Collection;
import java.util.Optional;

import com.github.axelfritz.entity.Cart;

/**
 * This interface represents the cart's service.
 * @author Axel
 *
 */
public interface CartService {

	/**
	 * This method saves a new cart.
	 * @param cart
	 * @return
	 */
	public void add(Cart cart);
	/**
	 * This method delete a saved cart.
	 * @param id
	 */
	public void delete(Long id);
	/**
	 * This method get a saved Cart.
	 * @param id
	 * @return
	 */
	public Optional<Cart> getById(Long id);
	
	/**
	 * This method get all the saved carts.
	 * @return
	 */
	public Collection<Cart> getAll();
	
	
}
