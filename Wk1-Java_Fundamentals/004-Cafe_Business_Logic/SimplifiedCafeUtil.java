import java.util.ArrayList;

public class SimplifiedCafeUtil {
    
    // * Customer Reward System
    public int getStreakGoal() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
    
    // * Sum up Order Total
    double getOrderTotal(double[] prices) {
        double total = 0.0;
        for (int i=0; i < prices.length; i++){
            total += prices[i];
        }
        return total;
    }
    
    // * Displaying the Menu
    void displayMenu( ArrayList<String> menuItems ) {
        for ( int i = 0; i < menuItems.size(); i ++ ) {
            String menuItem = menuItems.get(i);
            System.out.printf("%d %s\n", i, menuItem);
        }
    }
    
    // * Customer Waitlist
    public void addCustomer( ArrayList<String> customers ) {
        
        while (true) {
            String userName = System.console().readLine( "\nPlease enter your name (type 'q' to quit): " );
            if ( userName.equalsIgnoreCase("q") ) {
                System.out.println("\nExiting waitlist...");
                break;
            } else {
                // Add the customer to the waitlist immediately upon entering their name
                customers.add(userName);
                // Calculate the position of the customer in line
                int position = customers.size();
                
                // Greet the customer and provide a descriptive message based on their position in line
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
                
                // Display the waitlist
                System.out.println("+--- Waitlist ---+");
                for ( int lineIdx = 0; lineIdx < customers.size(); lineIdx++ ) {
                    String customerName = customers.get(lineIdx);
                    System.out.printf("%d - %s\n", lineIdx+1, customerName);
                }
            }
        }
        
    }
}
