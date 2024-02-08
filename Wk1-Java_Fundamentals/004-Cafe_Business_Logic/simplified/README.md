# 004 Café Business Logic《 Simplified 》

This project focuses on implementing various functionalities for Café Java, including customer reward systems, order total calculation, menu display, and customer waitlist management.

### Table of Contents

1. [Customer Reward System: `int getStreakGoal()`](#1-customer-reward-system-int-getstreakgoal)
2. [Sum up Order Total: `double getOrderTotal(double[] prices)`](#2-sum-up-order-total-double-getordertotaldouble-prices)
3. [Displaying the Menu: `displayMenu( ArrayList<String> menuItems )`](#3-displaying-the-menu-displaymenu-arrayliststring-menuitems)
4. [Customer Waitlist: `addCustomer( ArrayList<String> customers )`](#4-customer-waitlist-addcustomer-arrayliststring-customers)


### 1. Customer Reward System: `int getStreakGoal()`
This method calculates the total number of purchases needed by the end of the 10 weeks of Café Java's customer reward system. The system rewards customers who consistently purchase more drinks each week than the previous week.


To determine the total number of purchases needed after 10 weeks, the method calculates the sum of consecutive integers from 1 to 10. This sum represents the total number of purchases required to achieve the reward goal over the 10 weeks. In this case, the sum is 55, indicating that the customer must make 55 purchases over the 10 weeks to meet the reward criteria.


**CafeUtil.java**
```java
public int getStreakGoal() {
   int sum = 0;
   for (int i = 1; i <= 10; i++) {
       sum += i;
   }
   return sum;
}
```


**TestCafe.java**
```java
public class TestCafe {
   public static void main(String[] args) {
       SimplifiedCafeUtil cafeAppTest = new SimplifiedCafeUtil();
      
       // * Customer Reward System: Streak Goal
       System.out.println("\n-------- Steak Goal Test --------");
       System.out.printf("Purchases needed by week 10: %s\n", cafeAppTest.getStreakGoal());
       // ... code ommitted for brevity
   }
}
```


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
   for ( int i = 0; i < menuItems.size(); i ++ ) {
       String menuItem = menuItems.get(i);
       System.out.printf("%d %s\n", i, menuItem);
   }
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
      
       System.out.println("\n------- Display Menu Test -------");
       ArrayList<String> menuItems = new ArrayList<>();
       menuItems.add("drip coffee");
       menuItems.add("cappuccino");
       menuItems.add("latte");
       menuItems.add("mocha");
       cafeAppTest.displayMenu(menuItems);
       // ...
   }
}
```


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

---
<p align="right">Completed: ２０２４年０２月０７日（水）</p>