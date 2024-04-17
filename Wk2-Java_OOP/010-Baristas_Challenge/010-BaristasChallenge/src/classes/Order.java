package classes;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Order {
	
//	* MEMBER VARIABLES -- w/ default values set to null/false
	private String customerName;
	private boolean isReady;
	private ArrayList<Item> orderedItems;
	
//	* CONSTRUCTOR
	// ? No arguments, sets name to "Guest", initializes items as an empty list
	public Order() {
		this.customerName = "Guest";
		this.orderedItems = new ArrayList<Item>();
	}
//	* OVERLOADED CONSTRUCTOR
	// ? Takes a name as an argument, sets name to this custom name.
	// ? Initializes items as an empty list.
	public Order(String customerName) {
		this.customerName = customerName;
		this.orderedItems = new ArrayList<Item>();
	}
	
//	* ORDER METHODS
	public void addOrderedItem(Item item) {
		orderedItems.add(item);
	}
	
	public String getStatusMessage() {
		if (isReady) {
			return this.customerName + ", your order is ready.";
		}
		return String.format("\nThank you for waiting, %s. Your order will be ready shortly.", this.customerName); // default unless isReady = true
	}
	
	public double getOrderTotal() {
		double total = 0;
		for (Item item : orderedItems) {
			total += item.getPrice();
		}
//		DecimalFormat decimalFormat = new DecimalFormat("#.##");
//		String formattedTotal = decimalFormat.format(total);
//		return Double.parseDouble(formattedTotal);
		return total;
	}
	
	public void displayReceipt() {
		System.out.println("\n+-----------------------+");
		System.out.println("|        Receipt        |");
		System.out.println("| --------------------- |");
		System.out.printf("| Customer: %-11s |\n", this.customerName);
		
		if (orderedItems.isEmpty()) {
			System.out.println("|    Error: No items    |");
		} else {
			for (Item item : orderedItems) {
				System.out.printf("| %-11s -- $%.2f  |\n", item.getName(), item.getPrice());
			}
			System.out.println("| --------------------- |");
			
			DecimalFormat decimalFormat = new DecimalFormat("#0.00");
			String formattedTotal = decimalFormat.format(getOrderTotal());
			
			System.out.printf("| %12s: %2s%-5s |\n", "Total", "$", formattedTotal);
		}
		System.out.println("+-----------------------+");
	}
	
	
//	* GETTERS & SETTERS
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public boolean isReady() {
		return isReady;
	}
	public void setReady(boolean isReady) {
		this.isReady = isReady;
	}
	public ArrayList<Item> getOrderedItems() {
		return orderedItems;
	}
	public void setOrderedItems(ArrayList<Item> orderedItems) {
		this.orderedItems = orderedItems;
	}
}
