package ShoppingCart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;
import org.junit.Test;

public class ShoppingCartTest {
	
	
	Item item = new Item("01", "item1", "descripcion", 200);
	
	@Test
	public void whenAddAnItemToTheCart() {
		ShoppingCartImplementation shoppingCart = new ShoppingCartImplementation();
		shoppingCart.addItemToCart(item, 2);
		List<Item> list = shoppingCart.getListOfItems();
		assertTrue(list.contains(item));
	}
	
	@Test
	public void whenRemoveAnItemOfTheCart() {
		ShoppingCartImplementation shoppingCart = new ShoppingCartImplementation();
		boolean result = shoppingCart.removeItemOfCart("01");
		List<Item> list = shoppingCart.getListOfItems();
		assertTrue(result);
	}
	
	@Test
	public void whenUpdateTheQuantityOfAnItemAtTheCart() {
		ShoppingCartImplementation shoppingCart = new ShoppingCartImplementation();
		shoppingCart.updateQuantityOfItemAtTheCart(item, 5);
		List<Item> list = shoppingCart.getListOfItems();
		int quantity = 0;
		for(Item i : list) {
			if(i.equals(item))
				quantity = i.getQuantity();
		}
		assertEquals(5, quantity);
	}
	
	
}
