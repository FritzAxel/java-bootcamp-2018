package service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.ShoppingCart;
import repository.ShoppingCartRepository;

@Service
public class ShoppingCartService {

	@Autowired
	ShoppingCartRepository shopCartRepo;
	
	/**
	 * This method add a new Shopping Cart to the ShoppingCart repository.
	 * @param shoppingCart
	 * @return ShoppingCart id.
	 */
	public Long add(ShoppingCart shoppingCart) {
		return this.shopCartRepo.save(shoppingCart).getId();
	}
	
	/**
	 * This method delete an existing shoppingcart in the repository.
	 * @param shopCartId
	 */
	public void delete(Long shopCartId) {
		this.shopCartRepo.deleteById(shopCartId);
	}
	
	/**
	 * This method update an existing shoppingcart.
	 * @param shopCart
	 */
	public void update(ShoppingCart shopCart) {
		this.shopCartRepo.save(shopCart);
	}
	
	/**
	 * This method return an existing shoppingcart in the repository.
	 * @param shopCartId
	 * @return ShoppingCart
	 */
	public Optional<ShoppingCart> get(Long shopCartId){
		return this.shopCartRepo.findById(shopCartId);
	}
	
	/**
	 * This method return a Collection of all the existing shoppingcarts in the repository.
	 * @return Collection<ShoppingCart>
	 */
	public Collection<ShoppingCart> getAll(){
		return (Collection<ShoppingCart>) this.shopCartRepo.findAll();
	}
	
	
}
