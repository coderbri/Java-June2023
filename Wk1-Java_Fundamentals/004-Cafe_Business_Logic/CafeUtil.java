import java.util.ArrayList;

public class CafeUtil {
    
    // * Customer Reward System
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    // * 忍者Ninja Bonus: Method Overload
    public int getStreakGoal( int numWeeks ) {
        int sum = 0;
        for (int i = 1; i <= numWeeks; i++) {
            sum += i;
        }
        return sum;
    }
    
    // * Sum Up Order Total
    double getOrderTotal(double[] prices) {
        double total = 0.0;
        for (int i=0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }
    
    
    // * Displaying the Menu
    void displayMenu( ArrayList<String> menuItems ) {
        // Table Header + Structure
        System.out.println("+--------------------+");
        System.out.println("|  Café Java - Menu  |");
        System.out.println("+--------------------+");
        System.out.println("| No. |    Coffees   |");
        System.out.println("+-----+--------------+");
        
        // Menu Items
        for ( int i = 0; i < menuItems.size(); i ++ ) {
            String itemName = menuItems.get(i);
            System.out.printf("|  %-2d | %-12s |\n", i, itemName);
        }
        // Table Footer
        System.out.println("+--------------------+");
    }
    
    boolean displayMenu( ArrayList<String> menuItems, ArrayList<Double> coffeePrices ) {
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
            System.out.printf("|  %-2d | %-11s | $%.2f |\n", i, menuItems.get(i), coffeePrices.get(i));
        }
        System.out.println("+---------------------------+");
        return true;
    }
    
    
    // * Item Price Chart
    void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println("+----------------------------+");
        System.out.printf("|  %-24s  |\n", product);
        System.out.println("+----------------------------+");
        System.out.println("|  Qty. |    Price ($USD)    |");
        System.out.println("+-------+--------------------+");
        
        double discount = 0.00; // Initial discount value
        for (int i = 1; i <= maxQuantity; i++) {
            double discountedPrice = (price * i) + discount;
            System.out.printf("|  %-4d |     $%-11.2f   |\n", i, discountedPrice);
            discount -= 0.50;
        }
        System.out.println("+----------------------------+\n");
    }
    
    
    // * Customer Waitlist
    public void addCustomers( ArrayList<String> customers ) {
        while (true) {
            String userName = System.console().readLine( "\nPlease enter your name (type 'q' to quit): " );
            if ( userName.equalsIgnoreCase("q") ) {
                System.out.println("\nExiting waitlist...");
                break;
            } else {
                customers.add(userName);
                int position = customers.size();
                
                System.out.printf("\nHello, %s! ", userName);
                switch (position) {
                    case 1:
                        System.out.println("Your order will be ready shortly.");
                        break;
                    case 2:
                        System.out.println("You're next in line.");
                        break;
                    default:
                        System.out.printf("There are %d people in front of you.\n", position);
                        break;
                }
                
                System.out.println("+--------------------------+");
                System.out.println("|   Café Java - Waitlist   |");
                System.out.println("+--------------------------+");
                System.out.println("|  Place  |    Customer    |");
                System.out.println("+---------+----------------+");
                for ( int lineIdx = 0; lineIdx < customers.size(); lineIdx++ ) {
                    String customerName = customers.get(lineIdx);
                    System.out.printf("|   %-4d  |  %-13s |\n", lineIdx + 1, customerName);
                }
            }
        }
    }
}