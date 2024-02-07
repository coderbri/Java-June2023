public class SimplifiedTestCafe {
    public static void main(String[] args) {
        SimplifiedCafeUtil cafeAppTest = new SimplifiedCafeUtil();
        System.out.println("\n===== Welcome to Café Java! =====");
        
        // * Customer Reward System: Streak Goal
        System.out.println("\n-------- Steak Goal Test --------");
        System.out.printf("Purchases needed by week 10: %s\n", cafeAppTest.getStreakGoal());
        
        System.out.println("\n----------- Order Test ----------");
        double[] prices = { 2.5, 3.0, 4.75, 1.25 };
        double total = cafeAppTest.getOrderTotal(prices);
        System.out.printf("Total order price: $%.2f\n", total);
        
    }
}
