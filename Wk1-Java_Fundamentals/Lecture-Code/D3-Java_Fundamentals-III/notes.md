- Loops
    - explain what are for loops
        - Parts of a Loop Statement:
            1. Declare and initialize loop control variable
            2. Checking condition
            3. Incrementing loop control variable
                ```java
                ?       1       2     3
                for ( int i=0; i<10; i++ ) {
                    System.out.println(i);
                }
                ```
    - explain what are while loops
    ```java
    int num = 1;
    while (num<10) {
        System.out.println("Loop " + num);
        num++;
    }
    ```

- Fixed Arrays
    - explain what are fixed arrays
        - explain why its important to loop through an array
    - coded are some examples of fixed arrays. explain the logic:
        ```java
        void fixedArrays() {
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
        ```

- ArrayLists
    - explain what are arrayLists and how to use them
    - coded are some examples of ArrayLists. explain the logic:
        ```java
        void arrayLists() {
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
        ```

- HashMaps
    - explain what are hashmaps and how they work
    - coded are some examples of ArrayLists. explain the logic:
        ```java
        void maps() {
            // ? Besides instantiating, java.util.HashMap mut be imported
            HashMap<String, String> myMap = new HashMap<String, String>();
            //                  key : value
            myMap.put("firstName", "Jane");
            myMap.put("lastName", "Doe");
            myMap.put("DOB", "March 18th");
            System.out.println(myMap); // {firstName=Jane, lastName=Doe, DOB=March 18th}
            
            // ? Retrieve info by key name:
            System.out.println(myMap.get("firstName")); // Jane
            
            System.out.println("\nRetrieving Key Names & Their Values:");
            Set<String> allKeys = myMap.keySet(); // ? import java.util.Set
            for ( String oneKey : allKeys ) {
                // System.out.println(oneKey);
                String values = myMap.get(oneKey);
                System.out.printf( "%s = %s\n", oneKey, values );
            }
        }
        ```

- Putting it Into Practice
    - explain these blocks of code
    ```java
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
    ```