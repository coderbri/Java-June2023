import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeJava = new CafeUtil();
        System.out.println("\n===== Welcome to Café Java! =====");
        
        System.out.println("\n-------- Steak Goal Test --------");
        // System.out.printf("Purchases needed by week 10: %s\n", cafeJava.getStreakGoal());
        
        System.out.println("\n----------- Order Test ----------");
        // double[] prices = { 2.5, 3.0, 4.75, 1.25 };
        // double total = cafeJava.getOrderTotal(prices);
        // System.out.printf("Total order price: $%.2f\n", total);
        
        System.out.println("\n------- Display Menu Test -------");
        // ? Define menu items and their corresponding prices
        ArrayList<String> menuItems = new ArrayList<>();
        menuItems.add("Drip Coffee");
        menuItems.add("Cappuccino");
        menuItems.add("Latte");
        menuItems.add("Mocha");
        cafeJava.displayMenu(menuItems);
        
        ArrayList<Double> coffeePrices = new ArrayList<>();
        coffeePrices.add(1.25);
        coffeePrices.add(3.00);
        coffeePrices.add(4.75);
        coffeePrices.add(2.50);
        
        cafeJava.displayMenu(menuItems, coffeePrices);
        
        System.out.println("\n----- Customer Waitlist Test ----");
        // ArrayList<String> customers = new ArrayList<>();
        // cafeJava.addCustomer(customers);
    }
}