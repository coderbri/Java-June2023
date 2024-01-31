```java
public void conditionals() {
    
    double double1 = 123d;
    double double2 = 456d;
    // * if (condition) {
        // ? What to do if condition is true
        // ? can have 1 or more if statements
    // * }
    if ( Double.compare(double1, double2) == 0 ) { // ? compare to "if ( double1 == double2 ) {}"
        System.out.println("numbers are equal");
    }
    
    // * else if (condition) {
        // ? What to do if 2nd condition is true
        // ? Always following an if statemnt
        // ? can have as many else if statements
    // * }
    else if ( Double.compare(double1, double2) > 0 ) { // ? compare to else if ( double1 > double2 ) {}
        System.out.println("double1 is greater than double2");
    }
    
    // ! else (condition) {
        // ? What to do if none of the conditions are true
        // ? can have 1 or NO else statment
    // ! }
    else {
        System.out.println("double2 is greater than double1");
    }
    
    // "continue" and "break" statements can be used in loops
}
```