package controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.ShoppingCart;
import service.ShoppingCartServiceImplementation;

@RestController
@RequestMapping("/shoppingCarts")
public class ShoppingCartController {
	
	@Autowired
	private ShoppingCartServiceImplementation shopCartService;
	
	@PostMapping(value = "/add")
	public Long addShoppingCart(@RequestBody ShoppingCart shoppingCart) {
		return this.shopCartService.add(shoppingCart);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteShoppingCart(Long shopCartId) {
		this.shopCartService.delete(shopCartId);
	}
	
	@PutMapping(value = "/update/{id}")
	public void update(@RequestBody ShoppingCart shoppingCart) {
		this.shopCartService.update(shoppingCart);
	}
	
	@GetMapping(value = "/show/{id}")
	public Optional<ShoppingCart> get(Long shopCartId) {
		return this.shopCartService.get(shopCartId);
	}
	
	@GetMapping(value = "/show")
	public Collection<ShoppingCart> getAll(){
		return this.shopCartService.getAll();
	}
	
}
