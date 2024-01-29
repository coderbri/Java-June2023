public class FirstJavaClass {
    
    static int number = 7;
    void d1Code() {
        // Prining to console
        System.out.println( "Hello World" );
        
        // * VARIABLES: dataType variableName = VALUE;
        // * Primitives
        String firstName = "Jane"; // ? double quotes are used for strings
        char letter = 'a'; // ? single quotes are used for char
        int favoriteNumber; // ? camelCase for variables
        favoriteNumber = 7;
        boolean isCoder = true;
        
        System.out.println( "Hello! My name is " + firstName + "." );
        System.out.printf("%s's favorite number is %d\n", firstName, favoriteNumber);
        
        /* About Long datatype:
        ! Provide a long/double value upon initialization.
        ? The literal 4375296489157 of ype int is out of range, and will prompt:
        ! Type Mismatch: cannot convert from long to int */
        long population = 87654321;
        double balance = 25.00; // float is depreciated
        
        /* To print into terminal...
        * 1. Compile: javac FirstJava.java
        * 2. Run file to print: java FirstJava */
        
        // * Wrapper Classes
        Integer $myCatsAge = 3;
        System.out.println($myCatsAge);
        String _catsName = "猫ちゃん";
        Long bigNumber;
        Double decimalNumber = 7.58;
        Integer result = $myCatsAge/favoriteNumber;
        System.out.println(result);
    }
    
    // todo: conditionals
    void conditionals() {
        // todo if
        // todo else-if
    }
    
    // todo Switch
    void switches() {
        // * switch( parameterValueToCheck ) {}
        // * case parameterValueToCheck:
            // code...
            // ? break;
        // * repeat above...
        // * default:
            // code...
    };
    
    // todo ternary
    void ternary() {
        // * The ternary operator consists of three pieces;
            // ? the condition,
            // ? the return value if the condition is true,
            // ? and the return value if the condition is false.
        
    }
    // todo Strings
}
