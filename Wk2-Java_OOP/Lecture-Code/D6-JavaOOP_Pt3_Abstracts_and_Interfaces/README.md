# D5: Java OOP, Part III - Abstracts and Interfaces

<div style="display: flex; justify-content: space-between;">
    <p>Week ２ Session ３</p>
    <p>２０２４年０２月２８日（水）</p>
</div>


### Table of Contents
- [Introduction](#introduction)
    - [1. What are Interfaces and Why are They Important in Java?](#1-what-are-interfaces-and-why-are-they-important-in-java)
    - [2. How are Interfaces Useful in This Case?](#2-how-are-interfaces-useful-in-this-case)
- [Code Files](#code-files)
- [Abstract vs Interfaces](#abstract-vs-interfaces)
- [POJOs and JavaBeans](#pojos-and-javabeans)

## Introduction

In this project, we explore the concept of interfaces in Java Object-Oriented Programming (OOP). Interfaces define a contract for classes to implement specific methods, allowing for standardization and abstraction in code design.

## 1. What are Interfaces and Why are They Important in Java?

Interfaces in Java define a set of abstract methods without providing any implementation. They serve as blueprints for classes to adhere to, defining a contract that specifies what methods a class must implement. Interfaces promote code standardization, modularity, and flexibility by allowing classes to share common behavior without requiring inheritance. They are essential in Java because they enable multiple inheritance-like behavior, where a class can implement multiple interfaces, unlike traditional single inheritance.

## 2. How are Interfaces Useful in This Case?

In this project, we have two concrete classes, `Cat` and `Dog`, both implementing the `Animal` interface. The `Animal` interface defines three abstract methods: `sleep()`, `eat()`, and `showAffection()`. By implementing this interface, both `Cat` and `Dog` classes are required to provide implementations for these methods, ensuring consistent behavior across different animal types. This approach allows for code standardization and abstraction, as any class that implements the `Animal` interface is guaranteed to have these common behaviors.


## Code Files

### The Interface: Animal.java

The `Animal` interface defines three abstract methods: `sleep()`, `eat()`, and `showAffection()`. Classes that implement this interface must provide implementations for these methods.

### The Classes

#### Cat.java
The `Cat` class implements the `Animal` interface, providing concrete implementations for the methods defined in the interface. It also includes attributes and additional methods specific to cats.

#### Dog.java
Similar to the `Cat` class, the `Dog` class implements the `Animal` interface and provides implementations for the interface methods. It encapsulates attributes and methods specific to dogs.

### The Controller: AnimalController.java

The `AnimalController` class demonstrates the usage of `Cat` and `Dog` instances. It creates instances of both classes and invokes their methods to showcase their behaviors.


## Abstract vs Interfaces

| Feature                | Abstract Classes                                     | Interfaces                                            |
|------------------------|------------------------------------------------------|-------------------------------------------------------|
| Instantiation          | Cannot be instantiated directly                      | Cannot be instantiated directly                       |
| Method Type            | Can have both abstract and concrete methods          | Can only have abstract methods                        |
| Method Implementation | Abstract methods (unimplemented) must be implemented | All methods must be implemented                       |
| Variables              | Can have instance variables, constructors, and methods | Cannot have instance variables or constructors       |
| Inheritance            | Single inheritance; subclass extends abstract class  | Multiple inheritance; class implements interfaces     |
| Constructors           | Can have constructors                               | Cannot have constructors                              |
| Usage                  | Used for common base implementation                  | Used for defining contracts and achieving polymorphism |

In summary, abstract classes are used when you have a common base implementation shared among multiple related classes, whereas interfaces are used to define contracts that classes can implement to achieve a specific behavior. Abstract classes provide a way to share code among closely related classes, while interfaces allow classes to implement multiple types without inheriting from a common base class.


## POJOs and JavaBeans

POJOs and JavaBeans are both conventions used in Java programming, but they serve slightly different purposes:

### POJO (Plain Old Java Object)
   - A POJO is a simple Java class that adheres to a set of conventions, such as not extending or implementing any specialized classes or interfaces (except possibly interfaces related to serialization). 
   - POJOs are often used to represent simple data structures or domain objects in Java applications.
   - They typically consist of private fields, public getter and setter methods (or occasionally public fields), and possibly some additional methods for behavior.
   - POJOs are lightweight and easy to understand, making them suitable for various purposes in Java development.

### JavaBean
   - A JavaBean is a special type of POJO that follows specific conventions, primarily related to its structure, naming conventions, and behavior.
   - According to JavaBeans conventions, a JavaBean class must have a public no-argument constructor, private fields with corresponding public getter and setter methods (also known as accessors and mutators), and optionally, methods to support events and serialization.
   - JavaBeans are often used to encapsulate and manipulate data within Java applications, and they are widely used in frameworks like JavaFX, Java EE, and Spring for managing and transferring data between different components.
   - JavaBeans are also commonly used in graphical user interface (GUI) development, where properties of GUI components (such as text fields, buttons, etc.) can be represented using JavaBeans.

In summary, while both POJOs and JavaBeans are plain Java classes used to represent data, JavaBeans adhere to specific conventions, making them suitable for use in various frameworks and environments where standardized behavior and properties are required. POJOs, on the other hand, are more generic and flexible, making them suitable for a wide range of purposes in Java development.