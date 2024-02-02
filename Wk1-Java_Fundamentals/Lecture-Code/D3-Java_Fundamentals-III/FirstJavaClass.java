import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class FirstJavaClass {
    
    // * Conditionals
    public void conditionals() {
        
        double double1 = 123d;
        double double2 = 456d;
        if ( Double.compare(double1, double2) == 0 ) { // ? compare to "if ( double1 == double2 ) {}"
            System.out.println("numbers are equal");
        } else if ( Double.compare(double1, double2) > 0 ) { // ? compare to else if ( double1 > double2 ) {}
            System.out.println("double1 is greater than double2");
        } else {
            System.out.println("double2 is greater than double1");
        }
    }
    
    // * Switches
    void switches() {
        
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
        
        int day = 4;
        switch(day) {
            case 1:
                System.out.println("윌요일");
                break;
            case 2:
                System.out.println("화요일");
                break;
            case 3:
                System.out.println("수요일");
                break;
            case 4:
                System.out.println("목요일");
                break;
            case 5:
                System.out.println("금요일");
                break;
            case 6:
                System.out.println("토요일");
                break;
            case 7:
                System.out.println("일요일");
                break;
            default:
                System.out.println("There are only seven days in a week...");
        }
    };
    
    // * Ternaries
    void ternaries() {
        boolean isCoder = true;
        System.out.println((isCoder)? "yes" : "no");
    }
    
    // * Strings
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
    
    // * D3 - Loops, Fixed Arrays, Array Lists, and HashMaps
    
    // * Loops
    void loops() {
        System.out.println("\n=== For Loop ===");
        /* Parts of a Loop Statement:
            1. Declare and initialize loop control variable
            2. Checking condition
            3. Incrementing loop control variable
        ?       1       2     3         */
        for ( int i=0; i<10; i++ ) {
            System.out.println(i);
        }
        
        System.out.println("\n=== While Loop ===");
        int num = 1;
        while (num<10) {
            System.out.println("Loop " + num);
            num++;
        }
    }
    
    // * FixedArrays
    void fixedArrays() {
        System.out.println("\n=== Fixed Arrays ===\n");
        int[] myArray = new int[6]; // ? Initialize a fixedArray:
        
        for ( int iterator : myArray ) {
            System.out.println(iterator);
        }
        // Output: 0 0 0 0 0 0 (per line)
        
        // Change values: fixedArrayName[index] = newValue;
        System.out.println("\n=== With Changed Values ===");
        myArray[1] = 2;
        myArray[2] = 3;
        for ( int iterator: myArray ) {
            System.out.println(iterator);
        }
        // Output: 0 2 3 0 0 0 (per line)
        
        System.out.println("\n=== Another Example ===");
        int[] newArray = {1, 2, 3, 4, 5, 6};
        for ( int i=0; i<newArray.length; i++ ) {
            System.out.println(newArray[i]);
        }
        // Output: 1 2 3 4 5 6 (per line)
    }
    
    // * ArrayLists
    void arrayLists() {
        System.err.println("\n === ArrayLists ===");
        // Instantiate a new ArrayList, and import java.util.ArrayList library
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.add("하나");
        newArrayList.add("둘");
        newArrayList.add("셋");
        newArrayList.add("넷");
        System.out.println(newArrayList); // Output: [하나, 둘, 셋, 넷]
        
        newArrayList.remove(1); // ? Removes a value at that index
        System.out.println(newArrayList); // Output: [하나, 둘, 셋, 넷]
        System.out.println("ArrayList Size: " + newArrayList.size()); // 3
    }
    
    // * Maps
    void maps() {
        System.err.println("\n=== Maps ===");
        // ? Besides instantiating, java.util.HashMap mut be imported
        HashMap<String, String> myMap = new HashMap<String, String>();
        //                  key : value
        myMap.put("firstName", "Jane");
        myMap.put("lastName", "Doe");
        myMap.put("DOB", "March 18th");
        System.out.println(myMap); // {firstName=Jane, lastName=Doe, DOB=March 18th}
        
        // ? Retrieve info by key name:
        System.out.println(myMap.get("firstName")); // Jane
        
        System.out.println("\n= Retrieving Key Names & Their Values:");
        Set<String> allKeys = myMap.keySet(); // ? import java.util.Set
        for ( String oneKey : allKeys ) {
            // System.out.println(oneKey);
            String values = myMap.get(oneKey);
            System.out.printf( "%s = %s\n", oneKey, values );
        }
    }
    
    // * Application of Concepts
    void alphabet() {
        for ( char i = 'a'; i <= 'z'; i++ ) {
            System.out.println(i);
        }
    }
    ArrayList<Character> alphabetArrayList() {
        System.out.println("\n=== Looping Through Alphabet with ArrayList ===");
        ArrayList<Character> alphabetArrList = new ArrayList<Character>();
        for ( char i = 'a'; i <= 'z'; i++ ) {
            System.out.println(i);
            alphabetArrList.add(i);
        }
        return alphabetArrList;
    }
}
