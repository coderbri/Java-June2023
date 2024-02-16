# 005 Puzzling

After you passed the first challenge, the company decided they wanted to give you a few puzzles to solve that apply to features the company uses in their client-side operations. As they put it: "The first challenge was just to check your familiarity with the language, now we want to see your problem-solving skills."

In this project, a new class is introduced: `Random`. This will be used to generate random values.

## Table of Contents
- [Importing the `Random` Class Utility](#importing-the-random-class-utility)
- [PuzzleJava Methods](#puzzlejava-methods)
  - [Get Ten Rolls](#1-get-ten-rolls-gettenrolls)
  - [Get Random Letter](#2-get-random-letter-getrandomletter)
  - [Generate Password](#3-generate-password-generatepassword)
  - [Get New Password Set](#4-get-new-password-set-getnewpasswordset-int-length)
  - [Shuffle Array](#5-shuffle-array-shufflearray-int-array)
  - [Shuffle Array (Overloaded)](#6-shuffle-array-overloaded-shufflearray-char-array)
  - [Generate Password (Overloaded)](#7-generate-password-overloaded-generatepassword-int-length)

## Importing the `Random` Class Utility

To make use of the `Random` class in this project, you need to import it at the beginning of your Java file:

```java
import java.util.Random;
```

This allows you to create an instance of the `Random` class and use its methods to generate random numbers.

```java
Random randMachine = new Random();
int randomNumber = randMachine.nextInt(10); // Generates a random number between 0 and 9
```

## PuzzleJava Methods

### 1. Get Ten Rolls: `getTenRolls()`

This method generates and returns an array with 10 random numbers between 1 and 20, inclusive.

### 2. Get Random Letter: `getRandomLetter()`

This method creates an array within the method that contains all 26 letters of the alphabet, generates a random index between 0 and 25, and uses it to pull a random letter out of the array, then returns the random letter.

### 3. Generate Password: `generatePassword()`

This method uses the `getRandomLetter` method to create a random string of eight characters and returns that string.

### 4. Get New Password Set: `getNewPasswordSet(int length)`

This method takes an integer length as an argument and creates an array of random eight-character words. The array should have the length passed in as an integer and returns the array of passwords.

### 5. Shuffle Array: `shuffleArray(int[] array)`

This method takes an array of integers and mixes up all the values in a pseudorandom way.

### 6. Shuffle Array (Overloaded): `shuffleArray(char[] array)`

This overloaded method takes an array of characters and shuffles them in a pseudorandom way. It is specifically designed as a helper function for the [Generate Password (Overloaded)](#7-generate-password-overloaded-generatepasswordint-length) method, allowing the shuffling of passwords to ensure randomness and security. This method plays a crucial role in enhancing the strength of generated passwords by preventing patterns or predictability.


### 7. Generate Password (Overloaded): `generatePassword(int length)`

This overloaded method takes an integer length as an argument and generates a password of the specified length. The password contains alternating random letters and numbers, and then shuffles the characters randomly before returning the password.


## TestPuzzleJava File Setup

To test the `PuzzleJava` methods, create a `TestPuzzleJava` class with a `main` method. Inside the `main` method, create an instance of the `PuzzleJava` class and call each method to test its functionality.

```java
public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();

        // Call each method to test its functionality
        // Example:
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println("Ten random rolls between 1 and 20: " + randomRolls);
    }
}
```

---
<p align="right">Completed: ２０２４年０２月１４日（水）</p>
