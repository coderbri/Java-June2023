# Guest Greeting

## Logic from `AlfredQuotes`

### 1. Basic Greeting
```java
/* Note: These greetings are not printed to the console,
    but returned as a String fo use in the testing file. */
private String basicGreeting() {
    return "\nHello, lovely to see you. How are you?";
}

public String guestGreeting() {
    return basicGreeting();
}
```
- Returns a greeting that includes the guest's name.
- Input: String name
- Return: String // ex: "Hello, Beth Cane. Lovely to see you."

### 2.  Guest Greeting based on Pseudo Day Period (忍者Ninja Bonus)
```java
public String guestGreeting(String dayPeriod, String name) {
    return String.format("Good %s, %s. How can I assist you today?", dayPeriod, name);
}
```
- Returns a greeting including the guest's name as well as the day period.
- **Note**: It must have the same method name but will have a different method signature.
- Inputs: String name, String dayPeriod ("morning", "afternoon" or "evening")
- Return Type: String ex: "Good evening, Beth Kane. Lovely to see you."


### Guest Greeting based on Actual Day Period (先生Sensei Bonus)
```java
public String guestGreeting(String name) {
    Calendar calendar = Calendar.getInstance();
    int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
    
    String dayPeriod;
    if ( currentHour >= 0 && currentHour < 12 ) {
        dayPeriod = "morning";
    } else if ( currentHour >= 12 && currentHour < 18 ) {
        dayPeriod = "afternoon";
    } else {
        dayPeriod = "evening";
    }
    
    return String.format("Good %s, %s. How can I assist you today?", dayPeriod, name);
}
```
- Returns greeting including guest's name and the ACTUAL time of day.
- Instead of a string for the day period, write the overloaded method with no parameters, and use a Calendar object to determine the day period.
- **Note**: The following is depracated:
    ```java
    Date currenDate = new Date();
    int currentHour = currenDate.getHours();
    ```
    So the library import, `java.util.Calendar`, is used.

## Execution
```java
String greeting = alfredBot.guestGreeting();
System.out.println(greeting);

String guestName = System.console().readLine("\nTo whom do I have the honor of assisting? ");
String greetingGuestwDayPeriod = alfredBot.guestGreeting("morning", guestName);
String greetingGuest = alfredBot.guestGreeting(guestName);
System.out.println(greetingGuestwDayPeriod);
System.out.println(greetingGuest);
```