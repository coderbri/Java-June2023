package classes;

import java.util.ArrayList;

public class Order {
	
//	* MEMBER VARIABLES (all contain default values)
	public String customerName; // Null
	public double total; // 0
	public boolean isReady; // false, change status in test file
	public ArrayList<Item> orderedItems = new ArrayList<Item>();
	
//	* METHOD
	public void calculateTotal() {
		total = 0;
		for (Item item : orderedItems) {
			total += item.getPrice();
		}
	}
}
