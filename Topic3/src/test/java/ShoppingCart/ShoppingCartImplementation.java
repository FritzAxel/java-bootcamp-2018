package ShoppingCart;

import java.awt.List;
import java.util.ArrayList;
/**
 * This class is the implementation of the {@link ShoppingCart} service.
 * @author Axel Fritz
 *
 */
public class ShoppingCartImplementation implements ShoppingCart{

	private ArrayList<Item> items;
	
	public ShoppingCartImplementation() {
		items = new ArrayList<Item>();
	}
	
	
	public void addItemToCart(Item item, int quantity) {
		if(items.contains(item)) {
			item.setQuantity(quantity+item.getQuantity());
		}else {
			item.setQuantity(quantity);
			items.add(item);
		}
	}

	public boolean removeItemOfCart(Item item) {
		return this.items.remove(item);
	}

	public void updateQuantityOfItemAtTheCart(Item item, int quantity) {
		for(Item i : items) {
			if (i.equals(item)){
				i.setQuantity(quantity);
			}
		}
	}

	
	public String getInfoOfItemAtTheCart(String nameOfItem) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Item> getListOfItems() {
		return items;
	}

	public double getTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
