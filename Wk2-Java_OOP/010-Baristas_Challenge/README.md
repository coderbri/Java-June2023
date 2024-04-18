# 010 Barista's Challenge

## Overview
Barista's Challenge is a Java project built upon the foundation of the [**Orders and Items**](https://github.com/coderbri/Java-June2023/tree/e7caa4d4bdeeba7d5b722bd209dd2f5507b86c22/Wk2-Java_OOP/009-Orders_and_Items) project. It simulates an ordering system for a cafe, allowing users to place orders, add items to their orders, and view receipts for their orders. This project demonstrates basic object-oriented programming concepts and the use of ArrayLists in Java.

## Classes
### 1. Item
The `Item` class represents a menu item in the cafe. It has two member variables: `name` for the name of the item and `price` for the price of the item. The class also includes a method `displayMenu()` to display the cafe menu.

### 2. Order
The `Order` class represents an order placed by a customer. It contains information such as the customer's name, the list of items ordered, the total price, and whether the order is ready. The class provides methods to calculate the total price of the order and display a receipt.

### 3. TestOrders
The `TestOrders` class serves as the entry point for the application. It contains a `main` method where sample orders are created and simulated.

## Improvements
- The project builds upon the existing Orders and Items classes by adding functionality to display the cafe menu and handling order statuses.
- The `Item` class now includes a `displayMenu()` method to show the cafe menu, enhancing the user experience.
- Error handling is implemented to display a message when attempting to display a receipt for an order with no items.
- The `Order` class is enhanced to include a `calculateTotal()` method to compute the total price of the order.

## Usage
To use the Barista's Challenge application:
1. Ensure you have Java installed on your system.
2. Compile the Java files.
3. Run the `TestOrders` class to simulate orders and test the functionality.

## Sample Code Executions

### 1. Order 1:
```
======== Café Java ========

+~~~~~~~~ Order 1 ~~~~~~~~~+
Thank you for waiting, Guest. Your order will be ready shortly.
Guest, your order is ready.

+-----------------------+
|        Receipt        |
| --------------------- |
| Customer: Guest       |
| Cappuccino -- $4.36  |
| Drip Coffee -- $2.15  |
| --------------------- |
|        Total: $6.51   |
+-----------------------+
```

### Order 2:
```
+~~~~~~~~ Order 2 ~~~~~~~~~~+
Thank you for waiting, Jimmy. Your order will be ready shortly.
Cindhuri, your order is ready.

+-----------------------+
|        Receipt        |
| --------------------- |
| Customer: Jimmy       |
| Mocha -- $3.50        |
| --------------------- |
|        Total: $3.50   |
+-----------------------+
```

### Order 3:
```
+~~~~~~~~ Order 3 ~~~~~~~~~~+
Thank you for waiting, Noah. Your order will be ready shortly.
Noah, your order is ready.

+-----------------------+
|        Receipt        |
| --------------------- |
| Customer: Noah        |
|    Error: No items    |
| --------------------- |
|        Total: $0.00   |
+-----------------------+
```

### Order 4:
```
+~~~~~~~~ Order 4 ~~~~~~~~~~+
Thank you for waiting, Cindhuri. Your order will be ready shortly.
Cindhuri, your order is ready.

+-----------------------+
|        Receipt        |
| --------------------- |
| Customer: Cindhuri    |
| Latte -- $4.16        |
| Latte -- $4.16        |
| --------------------- |
|        Total: $8.32   |
+-----------------------+
```

These examples showcase the functionality of the Barista's Challenge application, including placing orders, adding items, marking orders as ready, and displaying receipts.

---
<p align="right">Completed: ２０２４年０４月１７日（水）</p>