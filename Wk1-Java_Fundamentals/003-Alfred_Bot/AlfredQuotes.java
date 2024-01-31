import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class AlfredQuotes {
    
    /* Note: These greetings are not printed to the console,
        but returned as a String fo use in the testing file. */
    private String basicGreeting() {
        return "\nHello, lovely to see you. How are you?";
    }
    
    /* Guest Greeting
    ? Returns a greeting that includes the guest's name.
        Input: String name
        Return: String // ex: "Hello, Beth Cane. Lovely to see you."
    */
    public String guestGreeting() {
        return basicGreeting();
    }
    
    /* 忍者Ninja Bonus: Guest Greeting with Time
    ? Returns a greeting including the guest's name as well as the day period.
    ! Note: It must have the same method name but will have a different method signature.
        Inputs: String name, String dayPeriod ("morning", "afternoon" or "evening")
        Return Type: String ex: "Good evening, Beth Kane. Lovely to see you."
    */
    public String guestGreeting(String dayPeriod, String name) {
        return String.format("Good %s, %s. How can I assist you today?", dayPeriod, name);
    }
    
    /* 先生Sensei Bonus: Guest Greeting with Time Pt2
    ? Returns greeting including guest's name and the ACTUAL time of day.
    Instead of a string for the day period, write the overloaded method with
        no parameters, and use a Calendar object to determine the day period.
    */
    public String guestGreeting(String name) {
        /* The following is depracated:
            Date currenDate = new Date();
            int currentHour = currenDate.getHours();
        So java.util.Calendar is used. */
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
    
    /* Date Announcement Greeting
    ? Returns a polite announcement of the current date and time.
        Input: None
        Return: String // ex: "It is currently Wed Aug 11 16:34:59 PDT 2022"
    */
    public String dateAnnouncement() {
        return String.format("It is currently %s.\n", new Date());
    }
    public String dateAnnouncementSimplified() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy 'and' hh:mm a z");
        dateFormat.setTimeZone(TimeZone.getTimeZone("EST"));
        return String.format("It is currently %s.\n", dateFormat.format( new Date() ));
    }
    
    
    
    
    /*
        TODO Respond before Alexis
        ? AlfredBot will periodically process audio (Alfred is listening).
        ? Write a method that accepts any String of conversation and responds appropiately.
        Specifications:
            If "Alexis" appears in the conversation (in the String), return a snarky response, such as "Right away, ma'am/sir. She certainly isn't sophisticated enough for that."
            If "Alfred" is in the conversation return an obliging response. For example, "At your service. As you wish, naturally."
            If neither name is found, return an appropiate response, for instance, "Right. And with that I shall retire."
        Input: String (Any Phrase)
            Return Type: String
            Output: A response (String)
    */
    
    public String respondBeforeAlexis(String conversation) {
        
        // the -1 is to test if whatever is in the indexOf exists
        if (conversation.indexOf("Alexis") > -1) {
            return "She's really of no help. What can I get for you?";
        }
        if (conversation.indexOf("Alfred") > -1) {
            return "At your service, naturally. How may I be of assistance?";
        }
        
        return "Right. And with that I shall retire.";
    }
    
    
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}