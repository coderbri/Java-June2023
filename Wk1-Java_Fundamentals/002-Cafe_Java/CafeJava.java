public class CafeJava {
    public static void main(String[] args) {
        // * APP VARIABLES
        // ? Lines of text that will appear in the app.
        String generalGreeting = "\nWelcome to Café Java, %s.\n";
        String pendingMessage = "%s, your order will be ready shortly.\n";
        String readyMessage = "%s, your order is ready!\n";
        String displayTotalMessage = "Your total is $%.2f.\n\n";
        
        // * Menu Variables
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.15;
        double lattePrice = 4.16;
        double cappucinoPrice = 4.36;
        
        // * Customer Name Variables
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Noah";
        String customer4 = "Jimmy";
        
        // * Order Status:
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
        
        // * APP INTERACTION SIMULATION
        System.out.println("\n=== Café Java Simulation===");
        // ① Cindhuri orders a drip coffee; print msg based on order status.
        System.out.printf(generalGreeting, customer1);
        System.out.printf( !isReadyOrder1 ? pendingMessage : readyMessage + displayTotalMessage, customer1, mochaPrice);
        
        // ② Noah orders a cappacino. If ready print msg to display total.
        System.out.printf(generalGreeting, customer3);
        if ( isReadyOrder3 ) {
            System.out.printf(readyMessage, customer3);
            System.out.printf(displayTotalMessage, cappucinoPrice);
        } else {
            System.out.printf(pendingMessage, customer3);
        }
        
        // ③ Sam orders 2 lattes; print msg to display their total.
        System.out.printf(generalGreeting, customer2);
        int numOfLatteOrdersBySam = 2;
        double samsLatteTotal = numOfLatteOrdersBySam * lattePrice;
        
        if ( isReadyOrder2 ) { // ? use an "if" statement to print appropiate order status msg.
            System.out.printf(readyMessage, customer2);
            System.out.printf(displayTotalMessage, samsLatteTotal);
        } else { // ? test control logic by changing isReady flag for value from true to false or vice versa
            System.out.printf(pendingMessage, customer2);
        }
        
        // ④ Jimmy realises that he was charged for a coffee but had ordered a latte.
        System.out.printf(generalGreeting, customer4);
        if ( isReadyOrder4 ) { // ? use an "if" statement to print appropiate order status msg.
            System.out.printf(readyMessage, customer4);
            System.out.printf(displayTotalMessage, lattePrice+dripCoffeePrice);
        } else { // ? test control logic by changing isReady flag for value from true to false or vice versa
            System.out.printf(pendingMessage, customer4);
        }
        
        // ? print total message with newly calculated total (what he owes) to make up the difference
        System.out.println(customer4+":   Hey! I didn't order a coffee! I only ordered a latte!");
        System.out.println("Barista: We're so sorry, sir. We'll fix that right up.");
        System.out.printf(readyMessage, customer4);
        System.out.printf(displayTotalMessage, lattePrice-dripCoffeePrice);
    }
}