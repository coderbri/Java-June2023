```java
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
```
