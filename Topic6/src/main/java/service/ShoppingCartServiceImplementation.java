package service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.ShoppingCart;
import repository.ShoppingCartRepository;

@Service
public class ShoppingCartServiceImplementation implements ShoppingCartService{

	@Autowired
	ShoppingCartRepository shopCartRepo;
	
	
	public Long add(ShoppingCart shoppingCart) {
		return this.shopCartRepo.save(shoppingCart).getId();
	}
	
	
	public void delete(Long shopCartId) {
		this.shopCartRepo.deleteById(shopCartId);
	}
	

	public void update(ShoppingCart shopCart) {
		this.shopCartRepo.save(shopCart);
	}
	

	public Optional<ShoppingCart> get(Long shopCartId){
		return this.shopCartRepo.findById(shopCartId);
	}
	

	public Collection<ShoppingCart> getAll(){
		return (Collection<ShoppingCart>) this.shopCartRepo.findAll();
	}
	
	
}
