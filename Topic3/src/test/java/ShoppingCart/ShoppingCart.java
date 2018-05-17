package ShoppingCart;

import java.awt.List;

/**
 * This interface represents a ShoppingCart service.
 * 
 * @author Axel Fritz
 *
 */
public interface ShoppingCart {

	/**
	 * This method add an item to the Cart. If the item was already at the Cart the quantity will be added.
	 */
	public void addItemToCart(Item item, int quantity);
	
	/**
	 * This method remove an item of the cart.
	 * @param item
	 * @return true if the item was removed. false if the item was not removed.
	 */
	public boolean removeItemOfCart(String idItem);
	
	/**
	 * This method update the quantity of items at the cart.
	 */
	public void updateQuantityOfItemAtTheCart(Item item, int quantity);
	
	/**
	 * This method search the item by name and return the information of it.
	 * @param nameOfItem
	 * @return toString of the Item.
	 */
	public String getInfoOfItemAtTheCart(String nameOfItem);
	
	/**
	 * This method calculate the total price adding up the (price*quantity) of each item
	 * @return the total price.
	 */
	public double getTotalPrice();
	
	
}
