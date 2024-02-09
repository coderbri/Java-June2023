# 004 Café Business Logic

This project encompasses a set of methods and functionalities aimed at enhancing the operations and user experience of a café business. From managing customer rewards to displaying menus and handling waitlists, these utilities contribute to streamlining various aspects of café management and customer interaction.

### Table of Contents
- [1. Customer Reward System](#1-customer-reward-system-int-getstreakgoalint-numweeks)
- [2. Sum up Order Total](#2-sum-up-order-total-double-getordertotaldouble-prices)
- [3. Displaying the Menu](#3-displaying-the-menu-displaymenu-arrayliststring-menuitems)
- [4. Displaying the Menu with Prices](#4-displaying-the-menu-with-prices-boolean-displaymenu-arrayliststring-menuitems-arraylistdouble-coffeeprices)
- [5. Generating a Price Chart for Products](#5-generating-a-price-chart-for-products-void-printpricechartstring-product-double-price-int-maxquantity)
- [6. Customer Waitlist](#6-customer-waitlist-addcustomer-arrayliststring-customers)
- [Project Summary](#project-summary)

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



## 2. Sum up Order Total: `double getOrderTotal(double[] prices)`

### Purpose
This method calculates the total price of an order by summing up all the prices of the items in the order.

### Logic
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


## 3. Displaying the Menu: `displayMenu( ArrayList<String> menuItems )`

### Purpose
This method provides a way to display the menu items (along with their corresponding indices) to the customers, allowing them to see the available options and their corresponding indices. This is useful in applications where users need to make selections from a list of options in the cafe ordering system, enhancing the user experience by presenting information in a clear and organized manner.

### Logic
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


### 4. Displaying the Menu with Prices: `boolean displayMenu( ArrayList<String> menuItems, ArrayList<Double> coffeePrices )`

### Purpose
This method extends the functionality of displaying the menu by including the prices of each item alongside their respective names. It ensures that customers not only see the available options but also the prices associated with each item, providing them with comprehensive information for making informed decisions during the ordering process.

### Logic
The function operates as follows:
1. **Input Validation:** It first checks whether the sizes of the `menuItems` and `coffeePrices` arrays are the same. If they differ in size, indicating a mismatch between menu items and prices, it prints an error message and exits.

2. **Display:** If the sizes match, it prints the menu items along with their corresponding prices in a structured format. Each item's index, name, and price are displayed in a table format, enhancing readability and aesthetics.

By incorporating prices into the menu display, this method enhances the user experience by providing comprehensive information, contributing to an efficient and satisfactory ordering process.

**CafeUtil.java**
```java
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

**Console:**
```cmd
+---------------------------+
|      Café Java - Menu     |
+---------------------------+
| No. |   Coffees   | Price |
+-----+-------------+-------+
|  0  | Drip Coffee | $1.25 |
|  1  | Cappuccino  | $3.00 |
|  2  | Latte       | $4.75 |
|  3  | Mocha       | $2.50 |
+---------------------------+
```


## 5. Generating a Price Chart for Products: `void printPriceChart(String product, double price, int maxQuantity)`

### Purpose
The purpose of the `printPriceChart` method is to generate a price chart for a specific product, displaying the quantity and corresponding price (in USD) for each unit up to a maximum quantity specified. This method provides a visual representation of the pricing structure for the product, helping customers understand the pricing options based on the quantity they wish to purchase.

### Logic
1. **Header Printing**: The method starts by printing a header for the price chart, including the name of the product. It uses formatted strings to ensure the header is centered and visually appealing.

2. **Table Structure Printing**: Next, it prints the structure of the price chart table, including headers for "Qty." and "Price ($USD)". This adds clarity to the chart and ensures that the quantities and prices are properly aligned.

3. **Discount Calculation**: The method initializes a `discount` variable to 0.00, representing the initial discount value, and will be used to adjust the prices based on the quantity purchased.

4. **Price Calculation and Printing**: It then iterates through each quantity from 1 up to the maximum quantity specified.
   - For each quantity, it calculates the discounted price by adding the product's base price multiplied by the quantity to the discount value.
   - The discount value is adjusted by subtracting $0.50 for each additional unit, reflecting the progressive discount specified.
   - The method then prints the quantity and corresponding discounted price in a formatted manner within the price chart table.

5. **Footer Printing**: Finally, the method prints a footer to complete the price chart table, ensuring it is visually complete and well-structured.

By following this logic, the `printPriceChart` method generates an informative and visually appealing price chart for the specified product, helping customers make informed purchasing decisions based on quantity and pricing options.

**CafeUtil.java**
```java
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
```

**TestCafe.java**
```java
System.out.println("\n----- Price Chart for Product ---");
String product1 = "Columbian Coffee Grounds";
double price1 = 15.00;
int maxQty1 = 3;
cafeJava.printPriceChart(product1, price1, maxQty1);

String product2 = "Starbucks Coffee Beans";
double price2 = 24.00;
int maxQty2 = 10;
cafeJava.printPriceChart(product2, price2, maxQty2);
```

**Console:**
```cmd
+----------------------------+
|  Columbian Coffee Grounds  |
+----------------------------+
|  Qty. |    Price ($USD)    |
+-------+--------------------+
|  1    |     $15.00         |
|  2    |     $29.50         |
|  3    |     $44.00         |
+----------------------------+
```


## 6. Customer Waitlist: `addCustomer( ArrayList<String> customers )`
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

**Console:**
```bash
+--------------------------+
|   Café Java - Waitlist   |
+--------------------------+
|  Place  |    Customer    |
+---------+----------------+
|   1     |  coderBri      |
|   2     |  Jane Doe      |
# ...table cut off for brevity
|   8     |  Anya          |
|   9     |  Loyd Forger   |
|   10    |  Yor Briar     |

# typing 'q' will promit exit message...
```


### Project Summary:
The Café Business Logic project aims to provide a comprehensive set of functionalities to manage various aspects of a café business, including customer reward systems, order total calculation, menu display with and without prices, generating price charts for products, and managing a customer waitlist.

---
<p align="right">Completed: ２０２４年０２月０９日（金）</p>