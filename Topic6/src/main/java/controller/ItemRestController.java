package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.Item;
import repository.ItemRepository;
import repository.ShoppingCartRepository;

@RestController
@RequestMapping("/item")
public class ItemRestController {

	private final ItemRepository itemRepo;
	private final ShoppingCartRepository shoppingCartRepo;
	
	@Autowired
	ItemRestController(ItemRepository itemRepo, ShoppingCartRepository shoppCartRepo){
		this.itemRepo = itemRepo;
		this.shoppingCartRepo = shoppCartRepo;
	}
	
	@GetMapping
	List<Item> readItems(@PathVariable Long cartId){
				
	}
	
	
}
