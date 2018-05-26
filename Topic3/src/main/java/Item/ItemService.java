package Item;
/**
 * This class represent the Item service
 * @author Axel Fritz
 *
 */
public interface ItemService {

	/**
	 * This method creates a new item.
	 * @param item
	 */
	public void createNewItem(Item item);
	
	public void updateItem(Long id, String name, String description, double price);
	
	/**
	 * This method delete an item.
	 * @param item
	 */
	public void deleteItem(Item item);
	
	/**
	 * This method show an item.
	 * @param item
	 * @return
	 */
	public String seeItem(Item item);
	
	
}
