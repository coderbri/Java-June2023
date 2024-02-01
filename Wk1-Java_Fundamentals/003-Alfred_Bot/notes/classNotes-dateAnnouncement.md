# Date Announcement

## Logic

### Date Announcement (Regular)
```java
public String dateAnnouncement() {
    return String.format("It is currently %s.\n", new Date());
}
```
- Returns a polite announcement of the current date and time.
- Input: None
- Return: String // ex: "It is currently Wed Aug 11 16:34:59 PDT 2022"

### Date Announcement (Simplified)
```java
public String dateAnnouncementSimplified() {
    SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM dd, yyyy 'and' hh:mm a z");
    dateFormat.setTimeZone(TimeZone.getTimeZone("EST"));
    return String.format("It is currently %s.\n", dateFormat.format( new Date() ));
}
```
- Returns a polite announcement of the current date and time in a simplified format.
- Input: None
- Return: String // ex: "It is currently Wednesday, August 11, 2022 and 04:34PM PDT."

## Execution
### Logic using Switch
```java
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

### Alternative Logic Using If-Else Statement
```java
String askDateFormat = System.console().readLine("\nHow would you like to know the date? (regular/simplified) ");

String announceDate;
if ( "simplified".equalsIgnoreCase(askDateFormat.trim() )) {
    announceDate = alfredBot.dateAnnouncementSimplified();
} else {
    announceDate = alfredBot.dateAnnouncement();
}
System.out.println(announceDate);
```