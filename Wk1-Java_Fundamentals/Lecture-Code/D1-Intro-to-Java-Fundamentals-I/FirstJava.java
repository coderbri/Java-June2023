public class FirstJava {
    public static void main( String[] args ) {
        
        // Prining to console
        System.out.println( "Hello World" );
        
        // * Defining Variables
        String firstName = "Jane"; // ? double quotes are used for strings
        char letter = 'a'; // ? single quotes are used for char
        int favoriteNumber; // ? camelCase for variables
        favoriteNumber = 7;
        
        boolean isCoder = true;
        long population = 87654321;
        double balance = 25.00; // float is depreciated
        
        System.out.println( "Hello! My name is " + firstName + "." );
        
        /* To print into terminal...
        * 1. Compile: javac FirstJava.java
        * 2. Run file to print: java FirstJava
        */
    }
}