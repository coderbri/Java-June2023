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
}
