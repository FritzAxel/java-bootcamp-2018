package service;

import java.util.Collection;
import java.util.Optional;

import entity.Item;
/**
 * This interface represents the item's service.
 * @author Axel
 *
 */
public interface ItemService {

	/**
	 * 
	 * @param item
	 * @return item id
	 */
	public void add(Item item);
	/**
	 * This method delete an item by id.
	 * @param itemId
	 */
	public void delete(Long itemId);
	/**
	 * This method update an existing item.
	 * @param item
	 */
	public void update(Item item);
	/**
	 * This method get an existing item.
	 * @param itemId
	 * @return
	 */
	public Optional<Item> get(Long itemId);
	 /**
	  * This method return a collection with all the items in the repository.
	  * @return Collection<Item>
	  */
	public Collection<Item> getAll();	
	
}
