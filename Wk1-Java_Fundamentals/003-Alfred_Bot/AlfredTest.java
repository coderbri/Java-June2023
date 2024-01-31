import java.util.Scanner;

public class AlfredTest {
    public static void main(String[] args) {
        
        // Making an instance of AlfredQuotes to access all its methods.
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        // * Guest Greeting Test
        String greeting = alfredBot.guestGreeting();
        // System.out.println(greeting);
        
        String guestName = System.console().readLine("\nTo whom do I have the honor of assisting? ");
        String greetingGuestwDayPeriod = alfredBot.guestGreeting("morning", guestName);
        String greetingGuest = alfredBot.guestGreeting(guestName);
        // System.out.println(greetingGuestwDayPeriod);
        System.out.println(greetingGuest);
        
        
        
        /* Setting up Scanner to expect User Input
            Scanner scanner = new Scanner(System.in);
            ? Testing out Scanner
            System.out.println("To whom do I have the honor of assisting?");
            String name = scanner.nextLine();
        */
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
        
        
        
        
        // Todo: Make some test greetings, providing any necessary data
        // String testGreeting = alfredBot.basicGreeting();
        // String testGuestGreeting = alfredBot.guestGreeting( name, "evening" );
        // String testDateAnnouncement = alfredBot.dateAnnouncement();
        // String alexisTest = alfredBot.respondBeforeAlexis( "Alexis! Play some low-fi beats." );
        // String alfredTest = alfredBot.respondBeforeAlexis( "I can't find my yo-yo. Maybe Alfred will know where it is." );
        // String notRelevantTest = alfredBot.respondBeforeAlexis( "Maybe that's what Batman is about. Not winning. But failing.." );

        // * Print Test
        // System.out.println(testGreeting);
        
        // System.out.println(testGuestGreeting);
        // System.out.println(testDateAnnouncement);
        
        // System.out.println(alexisTest);
        // System.out.println(alfredTest);
        // System.out.println(notRelevantTest);
    }
}