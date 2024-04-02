package controllers;

import java.util.ArrayList;

import classes.Item;
import classes.Order;

public class TestOrders {

	public static void main(String[] args) {
		
//		* APP VARIABLES -- MESSAGES
		String generalGreeting = "Welcome to Café Java, ";
		String pendingMessage = ", your order will be ready shortly";
		String readyMessage = ", your order is ready";
		String displayTotalMessage = "Your total is ";
		
		
//		* APP VARIABLES -- MENU ITEMS
		Item item1 = new Item();
		item1.setName("Drip Coffee");
		item1.setPrice(2.15);
		
		Item item2 = new Item();
		item2.setName("Mocha");
		item2.setPrice(3.5);
		
		Item item3 = new Item();
		item3.setName("Latte");
		item3.setPrice(4.16);
		
		Item item4 = new Item();
		item4.setName("Cappuccino");
		item4.setPrice(4.35);
		
		Item itemUtil = new Item();
		
		ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add(item2.getName());
        menuItems.add(item1.getName());
        menuItems.add(item3.getName());
        menuItems.add(item4.getName());
        
        ArrayList<Double> coffeePrices = new ArrayList<>();
        coffeePrices.add(item2.getPrice());
        coffeePrices.add(item1.getPrice());
        coffeePrices.add(item3.getPrice());
        coffeePrices.add(item4.getPrice());
        // Go to "APPLICATION SIMULATION" to display Menu
		
//		* APP VARIABLES -- ORDERS
		Order order1 = new Order();
		order1.customerName = "Cindhuri";
		
		Order order2 = new Order();
		order2.customerName = "Jimmy";
		
		Order order3 = new Order();
		order3.customerName = "Noah";
		
		Order order4 = new Order();
		order4.customerName = "Sam";
		
		
//		* APPLICATION SIMULATION
		System.out.println("\n====== Welcome to Café Java! ======\n");
		
        itemUtil.displayMenu(menuItems, coffeePrices);
		
		System.out.println("+-------- ORDER 1 -----------+");
		System.out.println(order1); // classes.Order@7344699f
		System.out.printf("Customer: %s\n", order1.customerName); // Customer: Cindhuri
		System.out.printf("%s%s.\n", generalGreeting, order1.customerName);
		order1.orderedItems.add(item2);
		order1.calculateTotal();
		System.out.printf("Total: $%.2f\n", order1.total); // Total: $0.00
		System.out.printf("Ready: %s\n", order1.isReady); // Ready: false
		
		System.out.println("\n+--------- ORDER 2 ----------+");
		System.out.printf("%s%s.\n", generalGreeting, order2.customerName);
		order2.orderedItems.add(item1);
		order2.calculateTotal();
		
		order2.isReady = true;
		if (order2.isReady) {
			System.out.printf("Ready: %s\n", order2.isReady);
			System.out.printf("%s%s.\n", order2.customerName, readyMessage);
			System.out.printf("%s$%.2f.\n", displayTotalMessage, order2.total);
		} else {
			System.out.printf("%s%s.\n", order2.customerName, pendingMessage);
		}
		
		System.out.println("\n+--------- ORDER 3 ----------+");
		System.out.printf("%s%s.\n", generalGreeting, order3.customerName);
		order3.orderedItems.add(item4);
		order3.calculateTotal();
//		order3.isReady = false;
		System.out.printf("%s%s.\n", order3.customerName, pendingMessage);
		
		System.out.println("\n+--------- ORDER 4 ----------+");
		System.out.printf("%s%s.\n", generalGreeting, order4.customerName);
		order4.orderedItems.add(item3);
		System.out.printf("%s%s.\n", order4.customerName, pendingMessage);
		order4.calculateTotal();
		
		
		System.out.println("\n+---- (UPDATED) ORDER 1 -----+");
		order1.isReady = true;
		System.out.println( order1.isReady
			? String.format("Ready: %s\n", order1.isReady)
				+ String.format("%s%s.\n", order1.customerName, readyMessage)
				+ String.format("%s$%.2f.\n", displayTotalMessage, order1.total)
			: String.format("%s%s.\n", order1.customerName, pendingMessage)
		);
		
		System.out.println("\n+---- (UPDATED) ORDER 4 -----+");
		order4.orderedItems.add(item3);
		order4.orderedItems.add(item3);
		order4.calculateTotal();
		order4.isReady = true;
		if (order4.isReady) {
			System.out.printf("Ready: %s\n", order4.isReady);
			System.out.printf("%s%s.\n", order4.customerName, readyMessage);
			System.out.printf("%s$%.2f.\n", displayTotalMessage, order4.total);
		} else {
			System.out.printf("%s%s.\n", order4.customerName, pendingMessage);
		}
	}

}
