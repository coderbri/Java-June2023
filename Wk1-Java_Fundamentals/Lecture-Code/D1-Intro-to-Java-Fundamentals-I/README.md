# D1: Intro to Java Fundamentals I

<div style="display: flex; justify-content: space-between;">
    <p>Week 1 Session 1</p>
    <p>２０２４年０１月２３日（火）</p>
</div>

### Table of Contents
- [Getting Started](#getting-started)
	- [The Main Method](#the-main-method)
		- [File Naming](#file-naming)
		- [Printing to Console](#printing-to-console)
		- [Compiling and Running the Code](#compiling-and-running-the-code)

# Getting Started
```java
// File name must be the same as the class name
// Every file IS a class
public class Test {
	
	// The file or class with the exact method signature below
	// is always the launching point of the application.
	// You cannot run a Java program without it.
	public static void main(String[] args) {
			// For now, all your code goes here!
			
	}
}
```

## The Main Method
Every Java program will have one and only one class file that has a main method. We’ll dive deeper into classes, and OOP generally in the next section. But for now, we’ll be writing all of our procedural code inside of this main method. Think of the main as the launchpad for all your applications.

1. **`public class Test`**: This declares a class named "Test." The `public` keyword indicates that the class is accessible from other classes. The class name follows, and the class itself contains the code within the curly braces `{}`.

2. **`public static void main(String[] args)`**: This line defines the `main` method, which serves as the entry point for the Java program. The `public` keyword means that the method is accessible from outside the class. The `static` keyword allows the method to be called without creating an instance of the class. The return type is `void`, indicating that the method does not return any value. The `main` method takes an array of strings (`String[] args`) as its parameter, allowing command-line arguments to be passed to the program.

### File Naming
Every time a `.java` file is created, the following naming conventions are following:
- The file name and class name need to be exactly the same, or it won’t compile. In this case, `Test.java` and `class Test`.
- The file and class names should be Pascal case. For example, a class file with all the methods (functions) for a bank account would be called `BankAccount.java` and `class BankAccount`.

### Printing to Console
```java
public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}
```

`{ System.out.println("Hello World!"); }`: This is the body of the `main` method. It contains a single statement that prints the string "Hello World!" to the console using `System.out.println`.

In summary, this code is a basic Java program that defines a class with a `main` method. When the program is executed, it prints "Hello World!" to the console. The `main` method is essential as it serves as the starting point for the execution of Java programs.
### Compiling and Running the Code
There are a few steps to running your Java program.

1. Compile it with the command `javac NameOfFile.java`.
2. Fix any syntax errors that come up during compilation and re-compile (step 1) until there are no errors.
3. Run your program with the command `java NameOfFile`.

Running the `javac NameOfFile.java` command will not print anything to the console. However, if the next command line is returned, it means that file compiled successfully and a `NameOfFile.class` file is now created. This is the `bytecode` file that your Java Virtual Machine will translate to machine code.

Now the code is ready to run. By entering the `java Test` command, "Hello World" will be printed to the console. Also, every time a change is made to the `.java` file, it needs to be recompiled to reflect those changes.

