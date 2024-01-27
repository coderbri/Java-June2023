public class CafeJava {
    public static void main(String[] args) {
        // * APP VARIABLES
        // ? Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Café Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready!";
        String displayTotalMessage = "Your total is $";
        
        // * Menu Variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 9;
        double lattePrice = 5;
        double cappucinoPrice = 4.4;
        
        // * Customer Name Variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Noah";
        String customer4 = "Jimmy";
        
        // * Order Status:
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
        
        // * APP INTERACTION SIMULATION
        System.out.println("=== Café Java Simulator===");
        // TODO ① Cindhuri orders a drip coffee; print msg based on order status.
        System.out.println(generalGreeting+customer1);
        
        // TODO ② Noah orders a cappacino. If ready print msg to display total.
        // TODO ③ Sam orders 2 lattes; print msg to display their total.
            // ? use an "if" statement to print appropiate order status msg.
            // ? test control logic by changing isReady flag for value from true to false or vice versa
        // TODO ④ Jimmy realises that he was charged for a coffee but had ordered a latte.
            // ? print total message with newly calculated total (what he owes) to make up the difference
    }
}