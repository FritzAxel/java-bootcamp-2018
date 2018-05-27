package controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Item;
import repository.ItemRepository;
import repository.ShoppingCartRepository;
import service.ItemServiceImplementation;

@RestController
@RequestMapping("/items")
public class ItemRestController {

	@Autowired
	ItemServiceImplementation itemService;
	
	@PostMapping(value = "/add")
	public void addItem(@RequestBody Item item) {
		this.itemService.add(item);
	}
	
	@DeleteMapping(value = "/delete/{itemId}")
	public void deleteItem(Long itemId) {
		this.itemService.delete(itemId);
	}
	
	@PutMapping(value = "/update/{itemId}")
	public void update(@RequestBody Item item) {
		this.itemService.update(item);
	}
	
	@GetMapping(value = "/show/{itemId}")
	public Optional<Item> getItem(Long itemId) {
		return this.itemService.get(itemId);
	}
	
	@GetMapping(value = "/show")
	public Collection<Item> getAll(){
		return this.itemService.getAll();
	}
	
}
