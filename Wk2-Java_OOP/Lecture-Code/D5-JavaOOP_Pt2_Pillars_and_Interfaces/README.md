# D5: Java OOP, Part II - Using Inheritance

<div style="display: flex; justify-content: space-between;">
    <p>Week ２ Session ２</p>
    <p>２０２４年０２月２３日（金）</p>
</div>


### Table of Contents
- [Introduction](#introduction)
- [The Four Pillars of OOP](#the-four-pillars-of-oop)
- [Inheritance in Java](#inheritance-in-java)
- [Code Files](#code-files)


## Overview: The Four Pillars of OOP

1. **Encapsulation:** Achieved through class attributes and methods, encapsulation ensures data security and code organization.
2. **Abstraction:** Abstracting complex behaviors into simplified interfaces enhances code readability and maintainability.
3. **Inheritance:** Allows classes to inherit attributes and behaviors from parent classes, promoting code reuse and facilitating polymorphism.
4. **Polymorphism:** Enables objects of different classes to be treated as objects of a common superclass, enhancing code flexibility and extensibility.

## Inheritance in Java

Inheritance is a key concept in Java OOP that allows classes to inherit attributes and methods from parent classes. This facilitates code reuse and promotes the creation of class hierarchies. In this project, inheritance is utilized to establish relationships between the `Animal`, `Cat`, and `Dog` classes.


### Animal.java | `Animal` Class as the Parent Class

**Used OOP Pillars:** Encapsulation, Inheritance

The `Animal` class serves as the parent class, encapsulating common attributes and behaviors shared by all animals. These attributes include `color`, `height`, `weight`, `name`, and `energy`. By defining these attributes in the `Animal` class, subclasses such as `Cat` and `Dog` can inherit them without the need for redundant code.

### Extending the Animal Class

Both the `Cat` and `Dog` classes extend the `Animal` class, inheriting its attributes and behaviors. This is achieved through the `extends` keyword in Java, which signifies that `Cat` and `Dog` are subclasses of `Animal`. By extending the `Animal` class, `Cat` and `Dog` inherit all public and protected members of the `Animal` class, including attributes, methods, and constructors.


### Adding Specific Functionality in Subclasses: Cat.java & Dog.java

**Used OOP Pillar:** Inheritance

The `super()` keyword is used within the constructors of `Cat` and `Dog` to explicitly call the constructor of the superclass (`Animal`). This allows the subclasses to inherit the behavior of the superclass constructor, ensuring that the initialization logic defined in the superclass constructor (`Animal`) is also executed when creating instances of the subclasses (`Cat` and `Dog`). This ensures that the common attributes of animals are properly initialized when creating instances of `Cat` and `Dog`.

While inheriting attributes and behaviors from the `Animal` class, subclasses such as `Cat` and `Dog` can also implement additional functionality specific to their types. For example, the `Cat` class introduces the `huntMice()` method to simulate a cat's behavior of hunting mice, while the `Dog` class introduces the `run()` method to simulate a dog's behavior of running.


### Polymorphic Usage

Through inheritance, objects of the `Cat` and `Dog` classes can be treated as objects of the `Animal` class, promoting polymorphic behavior. This means that a method expecting an `Animal` object can accept instances of `Cat` or `Dog` as arguments, allowing for flexible and extensible code.


## AnimalController.java

**Logic Explanation**

The `AnimalController` class serves as the entry point for the application. It demonstrates the usage of the `Animal`, `Cat`, and `Dog` classes by instantiating objects of these classes and invoking their methods. This includes setting attributes, displaying animal data, and performing specific actions, such as hunting mice or running.


## Summary

In summary, inheritance in this project enables code reuse, organization, and polymorphism by establishing relationships between the `Animal`, `Cat`, and `Dog` classes. It facilitates the creation of a class hierarchy where subclasses inherit attributes and behaviors from their parent class while also allowing for the implementation of specific functionality unique to each subclass.
