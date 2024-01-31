public class FirstJavaClass {
    
    public void conditionals() {
        
        // * if (condition) {
            // ? What to do if condition is true
            // ? can have 1 or more if statements
        // * }
        
        // * else if (condition) {
            // ? What to do if 2nd condition is true
            // ? Always following an if statemnt
            // ? can have as many else if statements
        // * }
        
        // ! else (condition) {
            // ? What to do if none of the conditions are true
            // ? can have 1 or NO else statment
        // ! }
        // "continue" and "break" statements can be used in loops
        
        int num1 = 4;
        int num2 = 6;
        if ( Double.compare(num1, num2) == 0 ) { // ? compare to "if ( num1 == num2 ) {}"
            System.out.println("numbers are equal");
        } else if ( Double.compare(num1, num2) > 0 ) { // ? compare to else if ( num1 > num2 ) {}
            System.out.println("num1 is greater than num2");
        } else {
            System.out.println("num2 is greater than num1");
        }
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
    
    // todo ternary
    void ternaries() {
        // one-line conditional that only gives 2 options... this or that
        // * The ternary operator consists of three pieces;
            // ? - the condition
            // ? - ? the return value if the condition is true,
            // ? - : and the return value if the condition is false.
        // format: (condition)? expressionIfTrue : expressionIfFalse
        boolean isCoder = true;
        System.out.println((isCoder)? "yes" : "no");
    }
    
    // todo Strings
    void strings() {
        // formatted strings
        // formatted print
        System.out.println("안녕하세요");
        
        String nameInput = System.console().readLine();
        int balance = 123;
        double usBalance = 456.789;
        double krBalance = 789.0123;
        System.out.println(String.format("안녕, %s. 잔액은 $%d입니다.", nameInput, balance));
        System.out.println(String.format("안녕, %s. 잔액은 $%.2f입니다.", nameInput, usBalance));
        System.out.println(String.format("안녕, %s. 잔액은 ₩%.3f입니다.", nameInput, krBalance));
    }
}
