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
public class ItemServiceImplementation implements ItemService{
	@Autowired
	private ItemRepository itemRepo;
	
	
	public void add(Item item) {
		this.itemRepo.save(item);
	}
	
	
	public void delete(Long itemId) {
		this.itemRepo.deleteById(itemId);
	}
	
	
	public void update(Item item) {
		this.itemRepo.save(item);
	}
	
	
	public Optional<Item> get(Long itemId) {
		return this.itemRepo.findById(itemId);
	}
	
	public Collection<Item> getAll(){
		return (Collection<Item>) this.itemRepo.findAll();
	}
}
