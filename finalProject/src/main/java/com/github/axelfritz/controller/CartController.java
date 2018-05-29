package com.github.axelfritz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.axelfritz.entity.Cart;
import com.github.axelfritz.service.CartServiceImplementation;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/carts")
public class CartController {

	@Autowired
	private CartServiceImplementation cartService;
	
	@ApiOperation(value = "save a cart")
	@PostMapping(value = "/save")
	public ResponseEntity saveCart(@RequestBody Cart cart) { 
		if(this.cartService.add(cart))
			return new ResponseEntity("Cart saved succesfully", HttpStatus.CREATED);
		else
			return new ResponseEntity("The Cart already exist.", HttpStatus.FORBIDDEN);
	}
	
	@ApiOperation(value = "delete a cart")
	@DeleteMapping(value = "/delete/{id}")
	public ResponseEntity deleteCart(@PathVariable Long id) {
		if(cartService.delete(id))
			return new ResponseEntity("Cart deleted succesfully", HttpStatus.OK);
		else
			return new ResponseEntity("The Cart doesn't exist.", HttpStatus.FORBIDDEN);
	}
}
