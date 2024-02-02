# D3: Java Fundamentals III

<div style="display: flex; justify-content: space-between;">
    <p>Week 1 Session ３</p>
    <p>２０２４年０１月３１日（水）</p>
</div>

### Table of Contents
- [Methods in `FirstJavaClass.java`](#methods-in-firstjavaclassjava)
    - [Loops](#loops)
        - [For Loops](#for-loops)
        - [While Loops](#while-loops)
        - [Purpose in Coding](#purpose-in-coding)
    - [Fixed Arrays](#fixed-arrays)
    - [Array Lists](#arraylists)
    - [HashMaps](#hashmaps)
- [Putting it Into Practice](#putting-it-into-practice)
    - [The Alphabet](#the-alphabet)
- [Testing Out the Code in `FirstJavaController.java`](#testing-out-the-code-in-firstjavacontrollerjava)

## Methods in `FirstJavaClass.java`

## Loops
### For Loops
```java
for (int i = 0; i < 10; i++) {
    System.out.println(i);
}
```
A for loop in Java is used for iterating over a sequence of code a specific number of times. The structure of a for loop consists of three parts:

1. **Declare and initialize loop control variable:** `int i = 0;` initializes the loop control variable `i` to 0.

2. **Checking condition:** `i < 10` is the condition that is checked before each iteration. The loop continues executing as long as this condition is true.

3. **Incrementing loop control variable:** `i++` increments the loop control variable `i` by 1 after each iteration.

The code inside the loop (in this case, `System.out.println(i);`) will be executed repeatedly until the condition `i < 10` becomes false.

### While Loops
```java
int num = 1;
while (num < 10) {
    System.out.println("Loop " + num);
    num++;
}
```

A while loop is used when the number of iterations is not known beforehand, and the loop continues executing as long as a specified condition is true.

1. **Initialize loop control variable:** `int num = 1;` initializes the loop control variable `num` to 1.

2. **Checking condition:** `num < 10` is the condition that is checked before each iteration. The loop continues executing as long as this condition is true.

3. **Incrementing loop control variable:** `num++` increments the loop control variable `num` by 1 after each iteration.

The code inside the loop (`System.out.println("Loop " + num);`) will be executed repeatedly until the condition `num < 10` becomes false.

### Purpose in Coding:

- **For Loops:** Useful when you know the number of iterations in advance, making it a concise way to iterate over a range of values.
  
- **While Loops:** Useful when the number of iterations is not known beforehand and depends on a certain condition. They are more flexible for dynamic situations.

Both types of loops are fundamental for controlling the flow of execution in Java programs, enabling efficient repetition of code blocks.


## Fixed Arrays

Fixed arrays in Java have a predetermined size and cannot be resized after initialization.

Looping through an array allows you to access and manipulate each element sequentially.

Examples:
```java
void fixedArrays() {
    int[] myArray = new int[6];
    for (int iterator : myArray) {
        System.out.println(iterator);
    }

    // Change values: fixedArrayName[index] = newValue;
    myArray[1] = 2;
    myArray[2] = 3;
    for (int iterator : myArray) {
        System.out.println(iterator);
    }

    int[] newArray = {1, 2, 3, 4, 5, 6};
    for (int i = 0; i < newArray.length; i++) {
        System.out.println(newArray[i]);
    }
}
```

## ArrayLists
ArrayLists are dynamic arrays in Java that can grow or shrink in size.

Example:
```java
void arrayLists() {
    ArrayList<String> newArrayList = new ArrayList<String>();
    newArrayList.add("하나");
    newArrayList.add("둘");
    newArrayList.add("셋");
    newArrayList.add("넷");

    newArrayList.remove(1);
    System.out.println(newArrayList);
    System.out.println("ArrayList Size: " + newArrayList.size());
}
```

## HashMaps
HashMaps in Java store key-value pairs and allow fast retrieval of values based on keys.

Example:
```java
void maps() {
    HashMap<String, String> myMap = new HashMap<String, String>();
    myMap.put("firstName", "Jane");
    myMap.put("lastName", "Doe");
    myMap.put("DOB", "March 18th");

    System.out.println(myMap);
    System.out.println(myMap.get("firstName"));

    Set<String> allKeys = myMap.keySet();
    for (String oneKey : allKeys) {
        String values = myMap.get(oneKey);
        System.out.printf("%s = %s\n", oneKey, values);
    }
}
```

## Putting it Into Practice

### The Alphabet

```java
void alphabet() {
    for (char i = 'a'; i <= 'z'; i++) {
        System.out.println(i);
    }
}

ArrayList<Character> alphabetArrayList() {
    ArrayList<Character> alphabetArrList = new ArrayList<Character>();
    for (char i = 'a'; i <= 'z'; i++) {
        System.out.println(i);
        alphabetArrList.add(i);
    }
    return alphabetArrList;
}
```

## Testing Out the Code in `FirstJavaController.java`

```java
FirstJavaController fc = new FirstJavaController();

fc.loops();
fc.fixedArrays();
fc.arrayLists();
fc.maps();

// * Application of Concepts
fc.alphabet();
ArrayList<Character> alphabetSoup = fc.alphabetArrayList();
System.out.println(alphabetSoup);
```
