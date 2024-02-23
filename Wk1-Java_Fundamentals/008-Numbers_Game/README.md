# 008 Numbers Game

This project is called **Numbers Game**, a simple Java console application where the user needs to guess a number between 0 and 10. The initial version of the game had several bugs reported by users. This README outlines the bugs that have been fixed in the final version of the game.

## Fixed Bugs:

1. **User Input Bug:**
   - **Description:** The application crashed when the user entered anything other than a number or 'q' to quit.
   - **Fix:** Added error handling to ensure that only valid input (numbers between 0 and 10 or 'q') is accepted. This was achieved by using a try-catch block to handle NumberFormatException and checking if the guessed number is within the valid range.

2. **Guessing Range Bug:**
   - **Description:** Users were able to guess numbers smaller than 0 and larger than 10, even though they were only supposed to guess a number between 0 and 10.
   - **Fix:** Modified the code to validate the user's guess and prompt them to enter a number within the range of 0 to 10.

3. **Repeated Guess Bug:**
   - **Description:** Sometimes users guessed a number incorrectly, and then if they guessed the same number later, it was considered correct.
   - **Fix:** Moved the random number generation outside the while loop to ensure that the same random number is used throughout the game session, preventing the issue of a correct guess for a previously incorrect number.

4. **Limited Guesses Bug:**
   - **Description:** There was no restriction on the number of guesses a user could make. Users could guess indefinitely.
   - **Fix:** Implemented a counter to keep track of the number of guesses, allowing only three guesses per game session. If the user exceeded three guesses without guessing the correct number, the game terminated.

5. **Prompting Message Bug:**
   - **Description:** The application prompted the "Swing and a miss! Keep trying..." message even on the third guess when the user failed to guess the correct number.
   - **Fix:** Modified the code to skip the prompting message on the third guess if the user had not guessed the correct number.

6. **Play Again Feature:**
   - **Description:** There was no option for the user to play the game again after finishing a game session.
   - **Fix:** Added a loop to allow the user to play multiple game sessions. After each game, the user is prompted to play again. If they choose to play again, a new game session starts; otherwise, the program exits.

## Final Version:

The final version of the Numbers Game is now free of the above-mentioned bugs and includes additional features such as limiting the number of guesses, skipping prompting messages on the third guess, and allowing the user to play multiple game sessions.

---
<p align="right">Completed: ２０２４年０２月２２日（木）</p>