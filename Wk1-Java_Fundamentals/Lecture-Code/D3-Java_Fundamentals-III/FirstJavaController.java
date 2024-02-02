import java.util.ArrayList;

public class FirstJavaController {
    public static void main(String[] args) {
        FirstJavaClass fc = new FirstJavaClass();
        
        /* D2 Test Cases
        fc.conditionals();
        fc.switches();
        fc.ternaries();
        fc.strings();
        */
        
        fc.loops();
        fc.fixedArrays();
        fc.arrayLists();
        fc.maps();
        
        // * Application of Concepts
        fc.alphabet();
        ArrayList<Character> alphabetSoup = fc.alphabetArrayList();
        System.out.println(alphabetSoup);
    }
}
