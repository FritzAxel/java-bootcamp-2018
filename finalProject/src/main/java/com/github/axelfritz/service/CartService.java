package com.github.axelfritz.service;

import java.util.Collection;
import java.util.Optional;

import com.github.axelfritz.entity.Cart;
import com.github.axelfritz.entity.ProductInCart;

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
	public boolean add(Cart cart);
	/**
	 * This method delete a saved cart.
	 * @param id
	 */
	public boolean delete(Long id);
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
	
	public void addProductToCart(Cart cart, ProductInCart product);
	
}
