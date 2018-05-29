package com.github.axelfritz.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.axelfritz.entity.Cart;
import com.github.axelfritz.entity.ProductInCart;
import com.github.axelfritz.repository.CartRepository;

@Service
public class CartServiceImplementation implements CartService{

	@Autowired
	private CartRepository cartRepo;
	
	@Override
	public boolean add(Cart cart) {
		if(! this.cartRepo.existsById(cart.getId()))
			return false;
		else {
			this.cartRepo.save(cart);
			return true;
		}
	}

	@Override
	public boolean delete(Long id) {
		if(this.cartRepo.existsById(id)) {
			this.cartRepo.deleteById(id);
			return true;
		}else
			return false;
	}

	@Override
	public Optional<Cart> getById(Long id) {
		return this.cartRepo.findById(id);
	}

	@Override
	public Collection<Cart> getAll() {
		return (Collection<Cart>) this.cartRepo.findAll();
	}

	@Override
	public void addProductToCart(Cart cart, ProductInCart product) {
		Cart act = this.cartRepo.findById(cart.getId()).get();
		if(act != null) {
			Collection<ProductInCart> productsInCart = act.getProducts();
			if(productsInCart.contains(product)) {
				for(ProductInCart p : productsInCart)
					if(p.getId().equals(product.getId()))
						p.setQuantity(p.getQuantity() + product.getQuantity());
			}else
				productsInCart.add(product);
		}
	}

	
	
}
