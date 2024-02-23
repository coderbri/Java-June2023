import java.util.Random;

public class NumbersGame {
    public static void main(String[] args){
        
        boolean playAgain = true;
        while (playAgain) {
            playGame();
            String response = System.console().readLine("Do you want to play again? (yes/no)  >> ");
            playAgain = response.equalsIgnoreCase("yes");
        }
        System.out.println("Thanks for playing! Goodbye.");
    }
    
    public static void playGame() {
        
        System.out.println("\nHello, human. I am thinking of a number between 0 and 10.");
        System.out.println("*********************************************************");
        System.out.println("Can you guess the number?");
        System.out.println("If you are not up to the task, you can always type 'q' to quit.");
        
        int answer = new Random().nextInt(11);
        int guessCount = 0;
        
        while (guessCount < 3) {
            String guess = System.console().readLine();
            
            if (guess.equals("q")) {
                System.out.println("I knew you didn't have it in you.");
                System.out.println("Shutting down...");
                return;
            }
            
            try {
                int numberGuess = Integer.parseInt(guess);
                
                if (numberGuess < 0 || numberGuess > 10) {
                    System.out.println("Invalid guess. Please enter a number between 0 and 10.");
                } else {
                    guessCount++;
                    
                    if (Integer.parseInt( guess ) == answer) {
                        System.out.println("Lucky guess! But can you do it again?");
                        return;
                    } else if (guessCount < 3) {
                        System.out.println("Swing and a miss! Keep trying...");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number between 0 and 10 or 'q' to quit.");
            }
        }
        System.out.println("You've run out of guesses! Better luck next time.");
        System.out.printf("The correct answer was: %d\n", answer);
        System.out.println("Game over. Shutting down...");
    }
}