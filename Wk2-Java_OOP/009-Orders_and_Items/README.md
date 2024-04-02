# 009 Orders & Items

The **Orders and Items** project is an advanced simulation of the [Café Business Logic](https://github.com/coderbri/Java-June2023/tree/93e527ffa2a8a8e7ac060be51832f18c191a64b7/Wk1-Java_Fundamentals/004-Cafe_Business_Logic) project, built using Java OOP in Spring Tool Suite.
This project implements an order management system for Café Java, a fictional coffee shop. The system allows customers to place orders for various items from the café menu and tracks the status of each order.

## Overview

The project consists of three main components:
1. `Item` class: Represents a menu item offered by Café Java. Each item has a name and a price.
2. `Order` class: Represents an order placed by a customer. Each order contains the customer's name, a list of ordered items, the total cost, and a status indicating whether the order is ready for pickup.
3. `TestOrders` class: Contains the main logic to simulate orders and manage the order workflow.

## Item and Order Classes

### Item Class

The `Item` class is structured as follows:
- **Member Variables**: 
  - `name`: String representing the name of the menu item.
  - `price`: Double representing the price of the menu item.
- **Methods**:
  - `getName()`, `setName()`: Getters and setters for the item's name.
  - `getPrice()`, `setPrice()`: Getters and setters for the item's price.
  - `displayMenu(ArrayList<String> menuItems, ArrayList<Double> coffeePrices)`: Displays the café menu with item names and prices.

### Order Class

The `Order` class is structured as follows:
- **Member Variables**:
  - `customerName`: String representing the name of the customer placing the order.
  - `total`: Double representing the total cost of the order.
  - `isReady`: Boolean indicating whether the order is ready for pickup.
  - `orderedItems`: ArrayList of `Item` objects representing the items ordered by the customer.
- **Methods**:
  - `calculateTotal()`: Calculates the total cost of the order based on the prices of the ordered items.

## TestOrders.java Logic

The `TestOrders` class contains the main logic to simulate orders and manage the order workflow. Here's a summary of the logic:
1. Initialization of menu items and prices.
2. Creation of order objects for different customers.
3. Displaying the café menu.
4. Simulating orders by adding items to each order and calculating the total cost.
5. Managing the order status (pending or ready).
6. Updating orders and displaying the updated status.

## Usage

To run the project, compile the Java files and execute the `TestOrders` class.

```bash
javac controllers/TestOrders.java
java controllers.TestOrders
```

---
<p align="right">Completed: ２０２４年０４月０２日（火）</p>