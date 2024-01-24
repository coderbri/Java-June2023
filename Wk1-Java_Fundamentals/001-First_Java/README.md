# 001 First Java Program

### Table of Contents
- [Overview](#overview)
- [Code in `FirstJava.java`](#code-in-firstjavajava)
- [Output](#output)

## Overview

This project contains a Java class named `FirstJava` that showcases basic console output using the `System.out.println` and `System.out.printf` methods. The program prints information about a person, including their name, age, hometown, and state.

## Code in `FirstJava.java`

```java
public class FirstJava {
    
    public static void main(String[] args) {
        
        String myName = "coderBri";
        int myAge = 22;
        String hometown;
        
        System.out.println("My name is " + myName);
        System.out.printf("I am %d years old\n", myAge);
        
        hometown = "Manhattan";
        String state = "NY";
        System.out.printf("My hometown is %s, %s\n", hometown, state);
    }
}
```

## Output

The program will output information about the person, including their name, age, and hometown, to the console.

```plaintext
My name is coderBri
I am 22 years old
My hometown is Manhattan, NY
```

---
<p align="right">Completed: ２０２４年０１月２３日（火）</p>