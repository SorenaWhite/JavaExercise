package L12Recursion;
import java.util.Scanner;

public class WordPlay {
    static Scanner reader = new Scanner(System.in);

    public static void stackWords() {
        System.out.println("Word: ");
        String word = reader.next();
        if(word.equals(".")) {
            System.out.println();
        }
        else {
            stackWords();
        }
        System.out.println(word);
    }

    public static void main (String [] args) {
        stackWords();
    }
}
