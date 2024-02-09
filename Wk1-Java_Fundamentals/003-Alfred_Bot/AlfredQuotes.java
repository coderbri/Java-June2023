import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class AlfredQuotes {
    
    //* Guest Greeting
    private String basicGreeting() {
        return "\nHello, lovely to see you. How are you?";
    }
    public String guestGreeting() {
        return basicGreeting();
    }
    
    public String guestGreeting(String dayPeriod, String name) {
        return String.format("Good %s, %s. How can I assist you today?", dayPeriod, name);
    }
    
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
    
    
    // * Date Announcement Greeting
    public String dateAnnouncement() {
        return String.format("It is currently %s.\n", new Date());
    }
    
    public String dateAnnouncementSimplified() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy 'and' hh:mm a z");
        dateFormat.setTimeZone(TimeZone.getTimeZone("EST"));
        return String.format("It is currently %s.\n", dateFormat.format( new Date() ));
    }
    
    
    // * Respond to Conversation
    public String respondToConversation( String conversation ) {
        if ( conversation.contains("Alexis")) {
            return "Right way. She certainly isn't sophisticated enough for that.";
        } else if ( conversation.contains("Alfred") ) {
            return "At your service. As you wish, naturally.";
        } else {
            return "Right. And with that, I shall retire.";
        }
    }
}