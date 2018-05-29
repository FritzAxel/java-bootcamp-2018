package com.github.axelfritz.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.axelfritz.entity.Product;
import com.github.axelfritz.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService{

	@Autowired
	private ProductRepository productRepo;
	
	@Override
	public boolean add(Product product) {
		if(this.productRepo.findByName(product.getName()) != null) {
			return false;
		}else {
			productRepo.save(product);
			return true;
		}
	}

	@Override
	public void delete(Long id) {
		this.productRepo.deleteById(id);
	}

	@Override
	public void update(Product product) {
		this.productRepo.save(product);
	}
	
	@Override
	public Optional<Product> getById(Long id) {
		return this.productRepo.findById(id);
	}

	@Override
	public Product getByName(String name) {
		return this.productRepo.findByName(name);
	}
	
	@Override
	public Collection<Product> getAll() {
		return (Collection<Product>) this.productRepo.findAll();
	}

	@Override
	public Collection<Product> filterByCategory(String category) {
		return this.productRepo.findByCategory(category);
	}

}
