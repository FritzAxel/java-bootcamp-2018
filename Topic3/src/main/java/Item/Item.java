package Item;

public class Item {

	/**
	 * Id of the item.
	 */
	private Long id;
	/**
	 * Name of the item.
	 */
	private String name;
	/**
	 * Description of the item.
	 */
	private String description;
	/**
	 * Price of a single item.
	 */
	private double price;
	/**
	 * Quantity of items
	 */
	private int quantity;
	
	/**
	 * Constructor of the class.
	 * @param i
	 * @param name
	 * @param description
	 * @param price
	 */
	public Item(Long i, String name, String description, double price) {
		this.id = i;
		this.name = name;
		this.description = description;
		this.price = price;
		this.quantity = 0;
	}

	/**
	 * This method return the amount.
	 * @return
	 */
	public double calculateAmount() {
		return this.price*this.quantity;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Item item = (Item) obj;
		return this.getId().equals(item.getId());
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}


	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	
	
	
}
