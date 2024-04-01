package controllers;

import classes.Item;
import classes.Order;

public class TestOrders {

	public static void main(String[] args) {
		
//		* APP VARIABLES -- MESSAGES
		String generalGreeting = "Welcome to Cafe Java, ";
		String pendingMessage = ", your order will be ready shortly";
		String readyMessage = ", your order is ready";
		String displayTotalMessage = "Your total is $";
		
//		* APP VARIABLES -- MENU ITEMS
		Item item1 = new Item();
		item1.setName("Mocha");
		item1.setPrice(3.5);
		
//		* APP VARIABLES -- ORDERS
		Order order1 = new Order();
		order1.customerName = "Cindhuri";
		
//		* APPLICATION SIMULATION
		System.out.println("\n===== Welcome to Café Java! =====");
		
		System.out.println(order1); // classes.Order@7344699f
		System.out.printf("Customer: %s\n", order1.customerName); // Customer: Cindhuri
		System.out.printf("Total: $%.2f\n", order1.total); // Total: $0.00
		System.out.printf("%s Price: $%.2f\n", item1.getName(), item1.getPrice()); // Mocha Price: $3.50
		System.out.printf("Ready: %s\n", order1.isReady); // Ready: false
		
	}

}
