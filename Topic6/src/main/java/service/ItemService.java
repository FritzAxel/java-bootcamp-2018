package service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import entity.Item;
import repository.ItemRepository;

@Service
public class ItemService {
	@Autowired
	private ItemRepository itemRepo;
	
	/**
	 * 
	 * @param item
	 * @return item id
	 */
	public void add(Item item) {
		this.itemRepo.save(item);
	}
	
	/**
	 * This method delete an item by id.
	 * @param itemId
	 */
	public void delete(Long itemId) {
		this.itemRepo.deleteById(itemId);
	}
	
	/**
	 * This method update an existing item.
	 * @param item
	 */
	public void update(Item item) {
		this.itemRepo.save(item);
	}
	
	/**
	 * This method get an existing item.
	 * @param itemId
	 * @return
	 */
	public Item get(Long itemId) {
		return this.itemRepo.findById(itemId);
	}
	 /**
	  * This method return a collection with all the items in the repository.
	  * @return Collection<Item>
	  */
	public Collection<Item> getAll(){
		return (Collection<Item>) this.itemRepo.findAll();
	}
}
