package classes;

import java.util.ArrayList;

public class Item {
	
//	* MEMBER VARIABLES
	private String name;
	private double price;
	
	
//	* METHODS
	public boolean displayMenu( ArrayList<String> menuItems, ArrayList<Double> coffeePrices ) {
        // Check if the sizes of menuItems and coffeePrices are the same
        if ( menuItems.size() != coffeePrices.size() ) {
            System.out.println("Error: Menu items and prices do not match. Unable to display menu.");
            return false;
        }
        
        System.out.println("+---------------------------+");
        System.out.println("|      Café Java - Menu     |");
        System.out.println("+---------------------------+");
        System.out.println("| No. |   Coffees   | Price |");
        System.out.println("+-----+-------------+-------+");
        // Menu Items + Prices
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("|  %-2d | %-11s | $%.2f |\n", i+1, menuItems.get(i), coffeePrices.get(i));
        }
        System.out.println("+---------------------------+");
        return true;
    }
	
	
//	* GETTERS & SETTERS
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
