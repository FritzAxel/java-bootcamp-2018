package com.github.axelfritz.entity;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Category {

	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	private String description;
	
	@ManyToMany
	private Collection<Product> products;
	
	public Category(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
}
