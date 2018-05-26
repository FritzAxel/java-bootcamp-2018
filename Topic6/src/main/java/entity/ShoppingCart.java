package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ShoppingCart {

	@Id @GeneratedValue
	private Long id;
	@OneToOne
	private User user;
	@OneToMany(mappedBy = "ShoppingCart")
	private List<Item> itemsList = new ArrayList<Item>();
	
	public ShoppingCart() {}
	
	public ShoppingCart(User user) {
		this.user = user;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the itemsList
	 */
	public List<Item> getItemsList() {
		return itemsList;
	}

	/**
	 * @param itemsList the itemsList to set
	 */
	public void setItemsList(List<Item> itemsList) {
		this.itemsList = itemsList;
	}
	
	
	
}
