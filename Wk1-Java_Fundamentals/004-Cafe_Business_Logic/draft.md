# 004 Café Business Logic

[ brief overview of this project ]

[ table of contents ]

## 1. Customer Reward System: `int getStreakGoal(int numWeeks)`
This method calculates the total number of purchases needed by the end of a specified number of weeks in Café Java's customer reward system. The system rewards customers who consistently purchase more drinks each week than the previous week.

### Purpose:
The purpose of this method is to provide flexibility for administrators to adjust the duration of the reward system. By accepting the parameter `numWeeks`, the method calculates the total number of purchases required to meet the reward goal over the specified number of weeks.

### Logic:
1. **Input**: The method takes an integer parameter `numWeeks`, representing the number of weeks for which the streak goal is to be calculated.
2. **Calculation**: It calculates the sum of consecutive integers from 1 to the specified number of weeks. Each integer represents the number of purchases needed in a single week to meet the reward goal.
3. **Output**: The method returns the total number of purchases required to achieve the reward goal over the specified number of weeks.

In essence, this method allows administrators to customize the duration of the reward system by adjusting the number of weeks, providing greater flexibility in managing customer rewards.

**CafeUtil.java**
```java
public int getStreakGoal() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
        sum += i;
    }
    return sum; // by default: 55
}
public int getStreakGoal(int numWeeks) {
    int sum = 0;
    for (int i = 1; i <= numWeeks; i++) {
        sum += i;
    }
    return sum;
}
```

**TestCafe.java**
```java
public class TestCafe {
    public static void main(String[] args) {
        CafeUtil cafeJava = new CafeUtil();
        
        System.out.println("\n-------- Steak Goal Test --------");
        int numWeeks = 15;
        System.out.printf("Purchases needed by week 10: %s\n", cafeJava.getStreakGoal());
        System.out.printf("Purchases needed by week %d: %s\n", numWeeks, cafeJava.getStreakGoal(numWeeks));
    }
}
```

This method allows administrators to dynamically adjust the duration of the reward system without modifying the code, providing greater flexibility and control over the café's customer reward program.



<!-- ! REMAINS UNCHANGED -->
### 2. Sum up Order Total: `double getOrderTotal(double[] prices)`
This method calculates the total price of an order by summing up all the prices of the items in the order.
1. **Input:** It first takes an array of `double` values `prices` as input, where each element represents the price of an item in the order.
2. **Processing**: It iterates through the `prices` array, adding each price to a running total.
3. **Output:** It returns the total price of the order, which is the sum of all the prices of the items in the order.


In essence, this method provides a convenient way to calculate the total cost of an order based on the prices of individual items. This is especially useful in this scenario where an order's total cost must be determined in this Café simulation.


**CafeUtil.java**
```java
double getOrderTotal(double[] prices) {
   double total = 0.0;
   for (int i=0; i < prices.length; i++){
       total += prices[i];
   }
   return total;
}
```


**TestCafe.java**
```java
public class TestCafe {
   public static void main(String[] args) {
       SimplifiedCafeUtil cafeAppTest = new SimplifiedCafeUtil();
       // ...
       System.out.println("\n----------- Order Test ----------");
       double[] prices = { 2.5, 3.0, 4.75, 1.25 };
       double total = cafeAppTest.getOrderTotal(prices);
       System.out.printf("Total order price: $%.2f\n", total);
       // ...
   }
}
```


### 3. Displaying the Menu: `displayMenu( ArrayList<String> menuItems )`
This method provides a way to display the menu items (along with their corresponding indices) to the customers, allowing them to see the available options and their corresponding indices. This is useful in applications where users need to make selections from a list of options in the cafe ordering system, enhancing the user experience by presenting information in a clear and organized manner.

The function presents the information by doing the following:
1. **Input:** It takes an **ArrayList** of menu items as input. Each element in the ArrayList is a String representing a menu item.

2. **Processing:** It iterates through the ArrayList of menu items, retrieving each item one by one using its index.

3. **Output:** For each menu item, it prints out its index and the item itself in a formatted manner in the console.

**CafeUtil.java**
```java
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
```

**TestCafe.java**
```java
System.out.println("\n------- Display Menu Test -------");
ArrayList<String> menuItems = new ArrayList<>();
menuItems.add("Drip Coffee");
menuItems.add("Cappuccino");
menuItems.add("Latte");
menuItems.add("Mocha");
cafeJava.displayMenu(menuItems);
```


### 4. Displaying the Menu with Prices: `displayMenu( ArrayList<String> menuItems, ArrayList<Double> coffeePrices )`
This method extends the functionality of displaying the menu by including the prices of each item alongside their respective names. It ensures that customers not only see the available options but also the prices associated with each item, providing them with comprehensive information for making informed decisions during the ordering process.

The function operates as follows:
1. **Input Validation:** It first checks whether the sizes of the `menuItems` and `coffeePrices` arrays are the same. If they differ in size, indicating a mismatch between menu items and prices, it prints an error message and exits.

2. **Display:** If the sizes match, it prints the menu items along with their corresponding prices in a structured format. Each item's index, name, and price are displayed in a table format, enhancing readability and aesthetics.

By incorporating prices into the menu display, this method enhances the user experience by providing comprehensive information, contributing to an efficient and satisfactory ordering process.

**CafeUtil.java**
```java
void displayMenu( ArrayList<String> menuItems, ArrayList<Double> coffeePrices ) {
    // Check if the sizes of menuItems and coffeePrices are the same
    if ( menuItems.size() != coffeePrices.size() ) {
        System.out.println("Error: Menu items and prices do not match. Unable to display menu.");
        return;
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
}
```

**TestCafe.java**
```java
System.out.println("\n------- Display Menu Test -------");
ArrayList<String> menuItems = new ArrayList<>();
menuItems.add("Drip Coffee");
menuItems.add("Cappuccino");
menuItems.add("Latte");
menuItems.add("Mocha");
// cafeJava.displayMenu(menuItems);

ArrayList<Double> coffeePrices = new ArrayList<>();
coffeePrices.add(1.25);
coffeePrices.add(3.00);
coffeePrices.add(4.75);
coffeePrices.add(2.50);
cafeJava.displayMenu(menuItems, coffeePrices);
```

<!-- ! NEEDS TO BE OPTIMIZED -->
### 4. Customer Waitlist: `addCustomer( ArrayList<String> customers )`
This method manages the waitlist of customers for the café. Here's a breakdown of its functionality:

1. **Prompt User Input**: The method prompts the user to enter their name via the console. If the user types 'q', indicating they want to quit, the method exits the loop and ends the waitlist management process.

2. **Customer Addition**: Upon entering a valid name (not 'q'), the method immediately adds the customer to the `customers` ArrayList, representing the waitlist.

3. **Position Calculation**: The method calculates the position of the newly added customer in line by obtaining the current size of the `customers` ArrayList.

4. **Message Rendering**: Depending on the position of the customer in line, the method provides a descriptive message to the customer.
  - If the customer is the first in line, they are informed that their order will be ready shortly.
  - If the customer is second in line, they are informed that they are next in line.
  - If the customer is third or later in line, they are informed about the number of people in front of them.

5. **Waitlist Display**: After adding the customer and rendering the appropriate message, the method displays the updated waitlist, showing the names of all customers in line along with their respective positions.

Overall, the `addCustomer` method efficiently manages the waitlist by continuously prompting customer input, updating the waitlist, providing relevant messages to customers based on their position in line, and displaying the updated waitlist to maintain transparency and customer awareness.


**CafeUtil.java**
```java
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
```

**TestCafe.java**
```java
public class TestCafe {
   public static void main(String[] args) {
       SimplifiedCafeUtil cafeAppTest = new SimplifiedCafeUtil();
       // ...
       System.out.println("\n----- Customer Waitlist Test ----");
       ArrayList<String> customers = new ArrayList<>();
       cafeAppTest.addCustomer(customers);
   }
}
```