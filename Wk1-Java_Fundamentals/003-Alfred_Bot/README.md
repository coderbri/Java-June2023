# 003 Alfred Bot

The `AlfredBot` Java project simulates the interactions of Alfred, a virtual assistant, by providing various greetings and conversations. The project is structured to accommodate different requirements, including guest greetings, ninja bonuses for greetings with time, and sensei bonuses for more advanced functionalities.

### Table of Contents
- [Modularization of `AlfredBot`](#modularization-of-alfredbot)
- [Class File: `AlfredQuotes`](#class-file-alfredquotes)
    - [Project Dependencies](#project-dependencies)
    - [Guest Greeting](#guest-greeting)
    - [Date Announcement](#date-announcement)
    - [Respond to Conversation](#respond-to-conversation)
- [Main Program (Test) File: `AlfredTest`](#main-program-test-file-alfredtest)
    - [Test Case 1: Guest Greetings](#test-case-1-guest-greetings)
    - [Test Case 2: Date Announcement](#test-case-2-date-announcement)
        - [Rationale for Using a Switch Statement:](#rationale-for-using-a-switch-statement)
        - [Comparison with If-Else Alternative:](#comparison-with-if-else-alternative)
    - [Test Case 3: Respond To Conversation](#test-case-3-respond-to-conversation)
- [Executing the AlfredQuotes Project](#executing-the-alfredquotes-project)
    - [Prerequisites](#prerequisites)
    - [Execution Steps](#execution-steps)

## Modularization of `AlfredBot`
The modularization of this project into a class file (`AlfredQuotes`) and a main program test file (`AlfredTest`) serves a crucial organizational purpose. 

**`AlfredQuotes`** acts as a standalone unit, encapsulating greeting-related functionalities such as guest greetings, date announcements, and conversation responses. This modular structure ensures easy expansion of greeting features, allowing new variations to be added without impacting the main testing file. 

**`AlfredTest`** is dedicated to testing and verifying individual methods within `AlfredQuotes`, enabling focused testing scenarios for different functionalities. The separation of concerns enhances code readability, making it easier to understand and maintain. This approach supports efficient project organization, facilitates future expansions, and streamlines testing processes, all tailored to the specific requirements of this project.


## Class File: `AlfredQuotes`

### Project Dependencies

The `AlfredQuotes` class in this project relies on specific Java imports to enable essential functionalities. These imports are crucial for handling date and time-related operations. Here's a brief overview of the dependencies and their implementations:

```java
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
```

**1. `SimpleDateFormat`:** This class allows for the customization of date formatting, ensuring a specific pattern for the date announcement.

**2. `Calendar`:** Utilized to access and manipulate date and time information, the `Calendar` class helps determine the current hour of the day for the guest greeting method.

**3. `Date`:** The `Date` class represents a specific instant in time and is used to obtain the current date for the date announcement.

**4. `TimeZone`:** This class ensures consistency in displaying time across different regions by setting the time zone for the date announcement.

These imports showcase the modularity of Java's standard libraries, allowing developers to efficiently leverage pre-built classes for common functionalities, enhancing code readability and maintainability.

### Guest Greeting

1. **Basic Greeting:** This method simply calls the `basicGreeting()` method, which returns a standard greeting string.
    ```java
    public String guestGreeting() {
        return basicGreeting();
    }
    ```


2. **Greeting with Time:** Here, the method takes a `dayPeriod` and `name` as parameters and returns a formatted greeting based on the provided day period and guest's name.
    ```java
    public String guestGreeting(String dayPeriod, String name) {
        return String.format("Good %s, %s. How can I assist you today?", dayPeriod, name);
    }
    ```

3. **Greeting with Actual Time:** This method determines the current time using a `Calendar` object and then calculates the appropriate day period (morning, afternoon, or evening). The final greeting is based on the determined day period and the guest's name.
    ```java
    public String guestGreeting(String name) {
        Calendar calendar = Calendar.getInstance();
        int currentHour = calendar.get(Calendar.HOUR_OF_DAY);
        
        String dayPeriod;
        if (currentHour >= 0 && currentHour < 12) {
            dayPeriod = "morning";
        } else if (currentHour >= 12 && currentHour < 18) {
            dayPeriod = "afternoon";
        } else {
            dayPeriod = "evening";
        }
        
        return String.format("Good %s, %s. How can I assist you today?", dayPeriod, name);
    }
    ```


### Date Announcement

1. **Regular Date Announcement:** This method provides a formatted announcement of the current date and time using the `Date` class.
    ```java
    public String dateAnnouncement() {
        return String.format("It is currently %s.\n", new Date());
    }
    ```

2. **Simplified Date Announcement:** Here, the method uses a `SimpleDateFormat` to create a more detailed and human-readable date format. The time zone is set to Eastern Standard Time (EST).
    ```java
    public String dateAnnouncementSimplified() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy 'and' hh:mm a z");
        dateFormat.setTimeZone(TimeZone.getTimeZone("EST"));
        return String.format("It is currently %s.\n", dateFormat.format(new Date()));
    }
    ```


### Respond to Conversation

```java
public static String respondToConversation(String conversation) {
    if (conversation.contains("Alexis")) {
        return "Right way. She certainly isn't sophisticated enough for that.";
    } else if (conversation.contains("Alfred")) {
        return "At your service. As you wish, naturally.";
    } else {
        return "Right. And with that, I shall retire.";
    }
}
```
This method checks the input conversation for mentions of "Alexis" or "Alfred" and responds accordingly. If "Alexis" is found, a snarky response is returned. If "Alfred" is found, an obliging response is returned. Otherwise, a retirement response is given.


## Main Program (Test) File: `AlfredTest`
The `AlfredTest.java` file serves as a testing ground for the methods defined in the `AlfredQuotes` class. Let's break down the key components and logic within this file:

### Test Case 1: Guest Greetings

1. **Instance Creation:** An instance of the `AlfredQuotes` class named `alfredBot` is created. This instance allows access to all the methods defined in the `AlfredQuotes` class.
   ```java
   AlfredQuotes alfredBot = new AlfredQuotes();
   ```

2. **Guest Greeting Test:** The `guestGreeting()` method is called without any parameters, generating a basic greeting. The result is then printed to the console.
   ```java
   String greeting = alfredBot.guestGreeting();
   System.out.println(greeting);
   ```

3. **User Input for Guest Greeting with Name:** The user is prompted to input their name, and two variations of the `guestGreeting()` method are called, one with a predefined day period ("morning") and the other without any additional parameters. Both greetings are then printed.
   ```java
   String guestName = System.console().readLine("\nTo whom do I have the honor of assisting? ");
   String greetingGuestwDayPeriod = alfredBot.guestGreeting("morning", guestName);
   String greetingGuest = alfredBot.guestGreeting(guestName);
   System.out.println(greetingGuestwDayPeriod);
   System.out.println(greetingGuest);
   ```

### Test Case 2: Date Announcement

4. **Date Announcement:** The user is asked how they'd like to receive the date announcement: in a regular format or a simplified format. The user's choice determines which method (`dateAnnouncement()` or `dateAnnouncementSimplified()`) is called, and the result is printed.
   ```java
   // User Input
   String askDateFormat = System.console().readLine("\nHow would you like to know the date? (regular/simplified) ");
   
   String announceDate;
   switch( askDateFormat.trim().toLowerCase() ) {
       case "simplified":
           announceDate = alfredBot.dateAnnouncementSimplified();
           break;
       case "regular":
           announceDate = alfredBot.dateAnnouncement();
           break;
       default:
           announceDate = "Invalid choice. Please choose 'regular' or 'simplified'.\n";
           break;
   }
   System.out.println(announceDate);
   ```

   - The `switch` statement is used to evaluate the value of `askDateFormat` after trimming whitespaces and converting to lowercase.
   - For each case, the corresponding method (`dateAnnouncementSimplified()` or `dateAnnouncement()`) from the `AlfredQuotes` class is called, and the result is assigned to the `announceDate` variable.
   - The `default` case is triggered if the user's input doesn't match any of the specified cases, providing an error message.

#### Rationale for Using a Switch Statement:
- **Readability and Conciseness:** The switch statement provides a concise and readable way to handle multiple cases based on the value of a single expression.
- **Specific Case Matching:** In this scenario, the user's input can only be one of two specific values ("regular" or "simplified"). Switch statements are well-suited for scenarios with a limited number of discrete options.
- **Ease of Adding Cases:** If additional date formats were introduced in the future, it's straightforward to add more cases to the switch statement, maintaining clarity in the code.

#### Comparison with If-Else Alternative:
```java
if ( "simplified".equalsIgnoreCase(askDateFormat.trim() )) {
    announceDate = alfredBot.dateAnnouncementSimplified();
} else {
    announceDate = alfredBot.dateAnnouncement();
} 
```
- The alternative if-else statement structure is commented out for reference. While it achieves the same functionality, the switch statement is often preferred for its clarity, especially when handling multiple distinct cases.
- If-else statements are generally more suitable when conditions involve ranges, patterns, or complex boolean expressions. For this specific scenario, the simplicity of the switch statement aligns well with the limited and clear-cut choices for date formats.


### Test Case 3: Respond To Conversation

5. **Respond Before Alexis:** A predefined conversation containing "Alexis" triggers the `respondToConversation()` method, generating a snarky response. The result is printed.
   ```java
   String conversation1 = "Alexis! Play some low-fi beats.";
   String alexisResponseTest = alfredBot.respondToConversation(conversation1);
   System.out.println(alexisResponseTest);
   ```

6. **Respond to Various Conversations:** Additional conversations are used to test the responses for both "Alexis" and "Alfred," as well as a neutral response. The results are printed.
   ```java
   String conversation2 = "I can't find my yo-yo. Maybe Alfred will know where it is.";
   String alfredResponseTest = alfredBot.respondToConversation(conversation2);
   System.out.println(alfredResponseTest);

   String conversation3 = "Maybe I should watch the Lion King...";
   String responseTest = alfredBot.respondToConversation(conversation3);
   System.out.println(responseTest);
   ```

7. **Custom Conversation:**  The user is prompted to input a custom conversation, and the `respondToConversation()` method generates a response based on the input. The result is printed.
   ```java
   String customConversation = System.console().readLine("What would you like to talk about? ");
   String responseTest2 = alfredBot.respondToConversation(customConversation);
   System.out.println(responseTest2);
   ```

This structure allows for interactive testing of the implemented methods, demonstrating the versatility of the `AlfredQuotes` class in different conversational scenarios.


## Executing the AlfredQuotes Project

### Prerequisites
- Ensure you have Java installed on your machine. If not, download and install it from [Java's official website](https://www.oracle.com/java/technologies/javase-downloads.html).

### Execution Steps

1. **Download the Project Directory:** Download the project `AlfredBot`.

2. **Compile and Run:** Open a terminal or command prompt. Navigate to the directory containing the downloaded files. Now, compile and run the `AlfredTest` file using the following commands:
     ```bash
     javac AlfredTest.java
     java AlfredTest
     ```
   The program will prompt you for input to simulate different interactions with Alfred.

4. **Interact with Alfred:** Follow the on-screen instructions to provide input for guest greetings, date format preferences, and simulated conversations. Explore the responses generated by Alfred based on the input provided.

5. **Review the Code:** Open the `AlfredQuotes.java` and `AlfredTest.java` files in a text editor or integrated development environment (IDE) to review the code and understand the implementation details.

---
<p align="right">Completed: ２０２４年０１月３１日（水）</p>