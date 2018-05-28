package com.github.axelfritz.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Buy {
	
	@Id @GeneratedValue
	private Long id;
	
	@OneToOne
	private Cart cart;
	
	private PayMethod payMethod;
	
	private enum PayMethod{ CASH, DEBIT, CREDIT}

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
	 * @return the cart
	 */
	public Cart getCart() {
		return cart;
	}

	/**
	 * @param cart the cart to set
	 */
	public void setCart(Cart cart) {
		this.cart = cart;
	}

	/**
	 * @return the payMethod
	 */
	public PayMethod getPayMethod() {
		return payMethod;
	}

	/**
	 * @param payMethod the payMethod to set
	 */
	public void setPayMethod(PayMethod payMethod) {
		this.payMethod = payMethod;
	}
	
	
}
