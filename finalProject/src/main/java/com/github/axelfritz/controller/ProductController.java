package com.github.axelfritz.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.axelfritz.entity.Product;
import com.github.axelfritz.service.ProductServiceImplementation;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/products")
public class ProductController {
	
	@Autowired
	private ProductServiceImplementation productService;
	
	@ApiOperation(value = "Add a product")
	@PostMapping(value = "/add")
	public ResponseEntity saveProduct(@RequestBody Product product) {
		if(productService.add(product))
			return new ResponseEntity("Product saved succesfully", HttpStatus.OK);
		else
			return new ResponseEntity("The product already exist", HttpStatus.OK);
	}
	
	@ApiOperation(value = "update an existing product")
	@PutMapping(value ="/update")
	public ResponseEntity updateProduct(@RequestBody Product product) {
		Product storedProduct = productService.getByName(product.getName());
		if(storedProduct != null) {
			storedProduct.setDescription(product.getDescription());
			storedProduct.setPrice(product.getPrice());
			productService.update(storedProduct);
			return new ResponseEntity("Product updated succesfully", HttpStatus.OK);
		}else
			return new ResponseEntity("The product couldn't be found and update", HttpStatus.OK);
	}
	
	@ApiOperation(value = "delete an existing product")
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity deleteProduct(Long id) {
		productService.delete(id);
		return new ResponseEntity("Product deleted succesfully", HttpStatus.OK);
	}
	
	@ApiOperation(value = "Search and show a product by Id")
	@GetMapping(value = "/show/{id}")
	public Optional<Product> showProduct(@PathVariable Long id) {
		return productService.getById(id);
	}
	
}
