package com.github.axelfritz.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Cart {

	@Id @GeneratedValue
	private Long id;
	
	@OneToOne
	private User user;
	
	@OneToMany(mappedBy = "Cart")
	private Collection<ProductInCart> products;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the products
	 */
	public Collection<ProductInCart> getProducts() {
		return products;
	}

	/**
	 * @param products the products to set
	 */
	public void setProducts(Collection<ProductInCart> products) {
		this.products = products;
	}
	
	
	
}
