package service;

import java.util.Collection;
import java.util.Optional;

import entity.ShoppingCart;

/**
 * This interface represents the shoppingcart's service.
 * @author Axel
 *
 */
public interface ShoppingCartService {
	
	/**
	 * This method add a new Shopping Cart to the ShoppingCart repository.
	 * @param shoppingCart
	 * @return ShoppingCart id.
	 */
	public Long add(ShoppingCart shoppingCart);
	/**
	 * This method delete an existing shoppingcart in the repository.
	 * @param shopCartId
	 */
	public void delete(Long shopCartId);
	/**
	 * This method update an existing shoppingcart.
	 * @param shopCart
	 */
	public void update(ShoppingCart shopCart);
	/**
	 * This method return an existing shoppingcart in the repository.
	 * @param shopCartId
	 * @return ShoppingCart
	 */
	public Optional<ShoppingCart> get(Long id);
	/**
	 * This method return a Collection of all the existing shoppingcarts in the repository.
	 * @return Collection<ShoppingCart>
	 */
	public Collection<ShoppingCart> getAll();
	
}
