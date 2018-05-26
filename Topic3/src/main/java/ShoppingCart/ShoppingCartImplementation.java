package ShoppingCart;

import java.util.List;

import Item.Item;

import java.util.ArrayList;
/**
 * This class is the implementation of the {@link ShoppingCart} service.
 * @author Axel Fritz
 *
 */
public class ShoppingCartImplementation implements ShoppingCart{

	private List<Item> items;
	
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

	public boolean removeItemOfCart(String idItem) {
		boolean removed = false;
		for(Item i: items) {
			if(i.getId().equals(idItem))
				removed = items.remove(i);
		}
		return removed;
	}

	public void updateQuantityOfItemAtTheCart(Item item, int quantity) {
		for(Item i : items) {
			if (i.equals(item)){
				i.setQuantity(quantity);
			}
		}
	}

	
	public String getInfoOfItemAtTheCart(String nameOfItem) {
		String info = null;
		for(Item i : items) {
			if(i.getName().equals(nameOfItem))
				info = i.toString();
		}
		return info;
	}

	public List<Item> getListOfItems() {
		return items;
	}

	public double getTotalPrice() {
		double total = 0;
		for(Item i : items) {
			total += i.calculateAmount();
		}
		return total;
	}

	
	
	
}
