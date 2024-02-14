import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzleJava {
    public static void main(String[] args) {
        PuzzleJava generator = new PuzzleJava();
        
        System.out.println("========== Get Ten Rolls ==========");
        // System.out.println(generator.getTenRolls());
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println("Ten random rolls between 1 and 20: " + randomRolls);
        
        System.out.println("\n======= Get Random Letter =======");
        char randomLetter = generator.getRandomLetter();
        System.out.println("Random Letter: " + randomLetter);
        
        System.out.println("\n======= Generate Password =======");
        String password = generator.generatePassword();
        System.out.println("Generated password: " + password);
        
        System.out.println("\n====== Get New Password Set =====");
        ArrayList<String> passwordSet = generator.getNewPasswordSet(8);
        System.out.println("List of generated Passwords: " + passwordSet);
        
        System.out.println("\n========= Shuffle Array =========");
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Original array: " + Arrays.toString(array));
        generator.shuffleArray(array);
        System.out.println("Shuffled array: " + Arrays.toString(array));
        
        System.out.println("== Generate Password with Length ==");
        String newPassword = generator.generatePassword(8);
        System.out.println("Generated password with length of 8: " + newPassword);
        
        String newPassword2 = generator.generatePassword(10);
        System.out.println("Generated password with length of 10: " + newPassword2);
    }
}