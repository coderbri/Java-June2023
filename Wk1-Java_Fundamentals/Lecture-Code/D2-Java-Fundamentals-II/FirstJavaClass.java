public class FirstJavaClass {
    
    // * Conditionals // If, If-Else, & Else Statements
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
}
