# 002 Café Java

**Café Java** is a simple Java program simulates a café ordering system where customers can place orders for various coffee items. The program displays order status, readiness, and calculates the total cost for each order.

### Table of Contents
- [Overview](#overview)
- [Project Structure](#project-structure)
    - [Usage](#usage)
    - [Logic Explanation](#logic-explanation)
    - [Variables](#variables)
    - [Menu Variables](#menu-variables)
    - [Customer Name Variables](#customer-name-variables)
    - [Order Status](#order-status)
    - [Simulation](#simulation)

## Overview
The Café Java simulator consists of a main class, `CafeJava`, where customers place their orders and the program simulates the interaction with the barista. The simulation includes four customers placing different types of coffee orders, and it manages the order status and total costs.

## Project Structure

### Usage

1. **Run the program**: Compile and run the `CafeJava` class to start the simulation.

2. **Order Placement**: Customers place orders, and the program responds with messages based on order status.

3. **Order Readiness**: The program checks if orders are ready, displaying appropriate messages.

4. **Total Calculation**: The total cost is calculated and displayed for each customer.

## Logic Explanation

### Variables

- **`generalGreeting`**: A formatted greeting message that includes a placeholder for the customer's name.
- **`pendingMessage`**: A message indicating that the order will be ready shortly.
- **`readyMessage`**: A message indicating that the order is ready.
- **`displayTotalMessage`**: A formatted message displaying the total cost.

### Menu Variables

- **`mochaPrice`**: Price of a mocha.
- **`dripCoffeePrice`**: Price of a drip coffee.
- **`lattePrice`**: Price of a latte.
- **`cappuccinoPrice`**: Price of a cappuccino.

### Customer Name Variables

- **`customer1`**, **`customer2`**, **`customer3`**, **`customer4`**: Names of customers.

### Order Status

- **`isReadyOrder1`**, **`isReadyOrder2`**, **`isReadyOrder3`**, **`isReadyOrder4`**: Flags indicating whether the order is ready.

### Simulation

The program uses conditional statements to check the order status and determine appropriate messages to display. It calculates the total cost for each order, taking into account the quantity ordered in specific cases.

The simulation also includes a scenario where a customer realizes a mistake in the order, and the program adjusts the total accordingly.

---
<p align="right">Completed: ２０２４年０１月２６日（金）</p>