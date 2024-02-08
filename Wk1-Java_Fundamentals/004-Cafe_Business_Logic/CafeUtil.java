import java.lang.reflect.Array;
import java.util.ArrayList;

public class CafeUtil {
    
    // * Customer Reward System
    // TODO 忍者Ninja Bonus:
    // Add a parameter, `numWeeks` so taht an admin can change the number from 10 to whatever they want
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
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
    
    // ! Item Price Chart
    // TODO 先生Sensei Bonus:
    // TODO 先輩Senpai Bonus:
    void printPriceChart( String product, double price, int maxQuantity ) {}
    
    // ! Displaying the Menu
    void displayMenu( ArrayList<String> menuItems ) {
        for ( int i = 0; i < menuItems.size(); i ++ ) {
            String menuItem = menuItems.get(i);
            System.out.printf("%d %s\n", i, menuItem);
        }
    }
    void displayMenu( ArrayList<String> menuItems, ArrayList<Double> coffeePrices ) {
        // Table Header + Structure
        System.out.println("+---------------------------+");
        System.out.println("|      Café Java - Menu     |");
        System.out.println("+---------------------------+");
        System.out.println("| No. |   Coffees   | Price |");
        System.out.println("+-----+-------------+-------+");
        
        // Menu Items + Prices
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("|  %-2d | %-11s | $%.2f |\n", i, menuItems.get(i), coffeePrices.get(i));
        }
        // Table Footer
        System.out.println("+---------------------------+");
    }
    
    // ! Customer Waitlist
    public void addCustomer( ArrayList<String> customers ) {
        
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
                
                System.out.println("+--- Waitlist ---+");
                for ( int lineIdx = 0; lineIdx < customers.size(); lineIdx++ ) {
                    String customerName = customers.get(lineIdx);
                    System.out.printf("%d - %s\n", lineIdx+1, customerName);
                }
            }
        }
        
    }
}