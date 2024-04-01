package classes;

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
		item1.setName("mocha");
		
//		* APP VARIABLES -- ORDERS
		Order order1 = new Order();
		order1.customerName = "Cindhuri";
		
//		* APPLICATION SIMULATION
		System.out.println("\n===== Welcome to Café Java! =====");
		
		System.out.println(order1); //
		System.out.printf("Customer: %s\n", order1.customerName); // Customer: 
		System.out.printf("Total: $%.2f\n", order1.total); // Total:
		System.out.printf("Ready: %s\n", order1.isReady); // Ready:
		
	}

}
