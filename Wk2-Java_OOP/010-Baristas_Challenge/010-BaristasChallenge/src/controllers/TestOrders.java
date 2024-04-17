package controllers;

import classes.Item;
import classes.Order;

public class TestOrders {

	public static void main(String[] args) {
		
//		* APP VARIABLES
		Item item1 = new Item("Mocha", 3.5);
		Item item2 = new Item("Drip Coffee", 2.15);
		Item item3 = new Item("Latte", 4.16);
		Item item4 = new Item("Cappuccino", 4.36);
		
		Order order1 = new Order();
		
		Order order2 = new Order("Jimmy");
		Order order3 = new Order("Noah");
		Order order4 = new Order("Cindhuri");
		
		
		
//		* APP SIMULATION
		System.out.println("======== Café Java ========");
		
		System.out.println("\n+~~~~~~~~ Order 1 ~~~~~~~~~+");
		order1.addOrderedItem(item4);
		order1.addOrderedItem(item2);
		System.out.println(order2.getStatusMessage());
		
		order1.setReady(true);
		System.out.println(order1.getStatusMessage());
		order1.displayReceipt();
		
		System.out.println("\n+~~~~~~~~ Order 2 ~~~~~~~~~~+");
		order2.addOrderedItem(item1);
		System.out.println(order2.getStatusMessage());
		
		order2.setReady(true);
		System.out.println(order4.getStatusMessage());
		order2.displayReceipt();
		
		System.out.println("\n+~~~~~~~~ Order 3 ~~~~~~~~~~+");
		System.out.println(order3.getStatusMessage());
//		order3.addOrderedItem(item4);
//		order3.addOrderedItem(item3);
		
		order3.setReady(true);
		System.out.println(order3.getStatusMessage());
		order3.displayReceipt();
		
		System.out.println("\n+~~~~~~~~ Order 4 ~~~~~~~~~~+");
		order4.addOrderedItem(item3);
		order4.addOrderedItem(item3);
		order4.getStatusMessage();
		
		order4.setReady(true);
		System.out.println(order4.getStatusMessage());
		order4.displayReceipt();
	}

}
