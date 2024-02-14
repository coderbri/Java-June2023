import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
    private Random randMachine;
    public PuzzleJava() {
        randMachine = new Random();
    }
    
    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> rolls = new ArrayList<Integer>();
        for (int i = 1; i < 10; i++) {
            rolls.add(randMachine.nextInt(20) + 1);
        }
        return rolls;
    }
    
    public char getRandomLetter() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int index = randMachine.nextInt(26);
        return alphabet[index];
    }
    // Alternative Possible Solution
    // explain why the first solution is better than this second solution
    public String getRandomLetterWithArray() {
        String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf(alphabetString.charAt(i));
        }
        String randomLetter = alphabet[randMachine.nextInt(26)];
        return randomLetter;
    }
    
    public String generatePassword() {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            password.append(getRandomLetter());
        }
        return password.toString();
    }
    
    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordsList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            passwordsList.add(generatePassword());
        }
        return passwordsList;
    }
    
    // * 忍者Ninja Bonus
    public void shuffleArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = randMachine.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
    
    public void shuffleArray(char[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            int index = randMachine.nextInt(i + 1);
            char temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
    }
    
    public String generatePassword(int length) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) { // Even index: add a random letter
                password.append(getRandomLetter());
            } else { // Odd index: add random digit
                password.append(randMachine.nextInt(10));
            }
        }
        // Shuffle characters in the password
        char[] pwCharactersArray = password.toString().toCharArray();
        shuffleArray(pwCharactersArray);
        String finalizedPassword = new String(pwCharactersArray);
        return finalizedPassword;
    }
}