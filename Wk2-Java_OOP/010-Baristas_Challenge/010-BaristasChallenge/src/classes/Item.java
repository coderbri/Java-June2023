package classes;

public class Item {
	
//	* MEMBER VARIABLES
	private String itemName;
	private double itemPrice;
	
//	* CONSTRUCTOR
//	? Takes a name and price as arguments and sets them accordingly
	
	public Item (String name, double price) {
		this.itemName = name;
		this.itemPrice = price;
	}
	
//	GETTERS & SETTERS - for item name and prices
	
	public String getName() {
		return itemName;
	}

	public void setName(String name) {
		this.itemName = name;
	}

	public double getPrice() {
		return itemPrice;
	}

	public void setPrice(double price) {
		this.itemPrice = price;
	}
}
