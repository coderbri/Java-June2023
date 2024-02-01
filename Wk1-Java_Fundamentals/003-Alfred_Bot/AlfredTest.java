// import java.util.Scanner;

public class AlfredTest {
    public static void main(String[] args) {
        
        // Making an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // * Guest Greeting Test
        // String greeting = alfredBot.guestGreeting();
        // System.out.println(greeting);
        
        String guestName = System.console().readLine("\nTo whom do I have the honor of assisting? ");
        // String greetingGuestwDayPeriod = alfredBot.guestGreeting("morning", guestName);
        // System.out.println(greetingGuestwDayPeriod);
        String greetingGuest = alfredBot.guestGreeting(guestName);
        System.out.println(greetingGuest);
        
        
        // * Date Announcement
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
        /* Alternative: If-Else Statement
        if ( "simplified".equalsIgnoreCase(askDateFormat.trim() )) {
            announceDate = alfredBot.dateAnnouncementSimplified();
        } else {
            announceDate = alfredBot.dateAnnouncement();
        } */
        System.out.println(announceDate);
        
        
        // * Respond To Conversation
        String conversation1 = "Alexis! Play some low-fi beats.";
        String alexisResponseTest = alfredBot.respondToConversation(conversation1);
        System.out.println(alexisResponseTest);
        
        String conversation2 = "I can't find my yo-yo. Maybe Alfred will know where it is.";
        String alfredResponseTest = alfredBot.respondToConversation(conversation2);
        System.out.println(alfredResponseTest);
        
        String conversation3 = "Maybe I should watch the Lion King...";
        String responseTest = alfredBot.respondToConversation(conversation3);
        System.out.println(responseTest);
        
        // Alternative: Custom Conversations
        String customConversation = System.console().readLine("What would you like to talk about? ");
        String responseTest2 = alfredBot.respondToConversation(customConversation);
        System.out.println(responseTest2);
    }
}