package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Item;
import repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepo;
	
	/**
	 * This method add a new Item.
	 */
	public Item add(Item item) {
		
	}
}
