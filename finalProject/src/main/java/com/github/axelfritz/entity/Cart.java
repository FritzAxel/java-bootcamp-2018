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
	
	
	
}
