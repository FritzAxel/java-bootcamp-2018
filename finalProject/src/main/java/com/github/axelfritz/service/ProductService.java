package com.github.axelfritz.service;

import java.util.Collection;
import java.util.Optional;

import com.github.axelfritz.entity.Product;
/**
 * This interface represents the product's service. 
 * @author Axel Fritz
 *
 */
public interface ProductService {
	/**
	 * This method add a new product.
	 * @param product
	 * @return
	 */
	public boolean add(Product product);
	/**
	 * This method delete an existing product.
	 * @param id
	 */
	public void delete(Long id);
	/**
	 * This method update an existing product.
	 * @param product
	 */
	public void update(Product product);
	/**
	 * This method get an existing product.
	 * @param id
	 * @return Product
	 */
	public Optional<Product> getById(Long id);
	/**
	 * This method get an existing product
	 * @param name
	 * @return Product
	 */
	public Product getByName(String name);
	/**
	 * This method get all the existing products.
	 * @return
	 */
	public Collection<Product> getAll();
	/**
	 * This method get all the products that belong to a category.
	 * @param category
	 * @return Collection<Product>
	 */
	public Collection<Product> filterByCategory(String category);
}
