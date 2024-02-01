# Respond to Conversation

## Logic
```java
public static String respondToConversation( String conversation ) {
    if ( conversation.contains("Alexis")) {
        return "Right way. She certainly isn't sophisticated enough for that.";
    } else if ( conversation.contains("Alfred") ) {
        return "At your service. As you wish, naturally.";
    } else {
        return "Right. And with that, I shall retire.";
    }
}
```
- AlfredBot will periodically process audio (Alfred is listening).
- Write a method that accepts any String of conversation and responds appropiately.
- **Specifications:**
    - If "Alexis" appears in the conversation (in the String), return a snarky response, such as "Right away, ma'am/sir. She certainly isn't sophisticated enough for that."
    - If "Alfred" is in the conversation return an obliging response. For example, "At your service. As you wish, naturally."
    - If neither name is found, return an appropiate response, for instance, "Right. And with that I shall retire."
- Input: String (Any Phrase)
- Return Type: String
- Output: A response (String)

## Execution
```java
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
```