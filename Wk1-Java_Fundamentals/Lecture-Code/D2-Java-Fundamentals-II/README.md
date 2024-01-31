# D2: Java Fundamentals II

<div style="display: flex; justify-content: space-between;">
    <p>Week 1 Session ２</p>
    <p>２０２４年０１月２８日（日）</p>
</div>

### Table of Contents
- [Overview](#overview)
- [Modularization in Java Projects](#modularization-in-java-projects)
    - [Benefits of Modularization](#benefits-of-modularization)
    - [Applicability for This Project](#applicability-for-this-project)
- [Test File: `FirstJavaController`](#test-file-firstjavacontroller)
- [Class Methods File: `FirstJavaController`](#class-methods-file-firstjavacontroller)
    - [Conditionals](#conditionals)
    - [Switches](#switches)
    - [Ternaries](#ternaries)
    - [Strings](#strings)
- [How to Run](#how-to-run)

## Overview
This repository contains code demonstrating the concepts learned on the second day of Java fundamentals, covering modularization, strings, methods, and type casting.

## Modularization in Java Projects

Modularization plays a crucial role in enhancing code organization, maintainability, and scalability. The project consists of two main classes: `FirstJavaController` and `FirstJavaClass`.

### Benefits of Modularization

1. **Code Organization:** Modules group related functionalities, providing a clear and logical structure for the codebase. In this project, `FirstJavaController` serves as the entry point, orchestrating the execution of methods from `FirstJavaClass`.

2. **Reusability:** Modularization allows for the reuse of code. Methods defined in `FirstJavaClass` can be utilized in other parts of the project or potentially in future projects, reducing redundancy and promoting code efficiency.

3. **Scalability:** As the project grows, modularization facilitates the management of complexity. Each class or module can be developed, tested, and maintained independently, contributing to a scalable architecture.

4. **Collaboration:** Modular code encourages collaboration among developers. Different team members can work on distinct modules simultaneously, enabling efficient parallel development without interference.

5. **Testing:** Smaller modules are more manageable to test. Unit testing can be focused on individual modules, ensuring the correctness of each part of the application.

6. **Readability and Maintainability:** Modular code is inherently more readable and maintainable. Each module has a specific purpose and limited scope, making it easier to understand and modify without affecting the entire codebase.

### Applicability for This Project

In this project, a controller and class methods file represent distinct modules. The separation allows for a clear division of responsibilities: `FirstJavaController` handles the execution flow, while `FirstJavaClass` encapsulates various Java fundamentals, such as conditionals, switches, ternaries, and string manipulation.

By leveraging modularization, this project adheres to good software engineering practices. It promotes code organization, ease of maintenance, and the potential for future expansion. As the project evolves, the benefits of modularization become increasingly evident, contributing to the project's overall success and sustainability.


## Test File: `FirstJavaController`
The `FirstJavaController` class serves as the entry point for the program. In the `main` method, an instance of `FirstJavaClass` is created, and various methods related to conditionals, switches, ternaries, and strings are called.
```java
public class FirstJavaController {
    public static void main(String[] args) {
        FirstJavaClass fc = new FirstJavaClass();
        fc.conditionals();
        fc.switches();
        fc.ternaries();
        fc.strings();
    }
}
```

## Class Methods File: `FirstJavaController`

### Conditionals
Conditionals in programming are structures that allow you to execute different code blocks based on specific conditions. In Java, common conditional statements include `if`, `else if`, and `else`. These statements help control the flow of a program by allowing it to make decisions based on different scenarios.
```java
public void conditionals() {
    
    double double1 = 123d;
    double double2 = 456d;
    if ( Double.compare(double1, double2) == 0 ) {
        System.out.println("numbers are equal");
    } else if ( Double.compare(double1, double2) > 0 ) {
        System.out.println("double1 is greater than double2");
    } else {
        System.out.println("double2 is greater than double1");
    }
}
```

### Switches
The `switch` statement in Java is another way to control program flow based on the value of an expression. It's particularly useful when you have multiple conditions to check against a single variable. The `switch` statement provides a cleaner alternative to multiple `if-else` statements.
```java
String city = "Manhattan";
switch(city) {
    case "Seattle":
        System.out.println("Seattle");
        break;
    case "San Francisco":
        System.out.println("New York");
        break;
    case "Chicago":
        System.out.println("Chicago");
        break;
    case "Manhattan":
        System.out.println("Chicago");
        break;
    default:
        System.out.println("City not found...");
}
```

### Ternaries
The ternary operator (`? :`) is a concise way to express a conditional statement in a single line. It is useful when you have a simple decision to make and want to write a compact expression for it. The format is `(condition) ? expressionIfTrue : expressionIfFalse`.
```java
void ternaries() {
    boolean isCoder = true;
    System.out.println((isCoder)? "yes" : "no");
}
```

### Strings
In Java, strings are sequences of characters. The `String` class provides numerous methods to manipulate and format strings. The `String.format()` method allows you to create formatted strings by inserting values into a template. This is particularly useful for constructing messages with dynamic content.
```java
void strings() {
    System.out.println("안녕하세요");
    
    String nameInput = System.console().readLine();
    int balance = 123;
    double usBalance = 456.789;
    double krBalance = 789.0123;
    System.out.println(String.format("안녕, %s. 잔액은 $%d입니다.", nameInput, balance));
    System.out.println(String.format("안녕, %s. 잔액은 $%.2f입니다.", nameInput, usBalance));
    System.out.println(String.format("안녕, %s. 잔액은 ₩%.3f입니다.", nameInput, krBalance));
}
```

## How to Run
To run the program, compile and execute the `FirstJavaController` class. The code demonstrates the application of various fundamental Java concepts learned on the second day of the course.

