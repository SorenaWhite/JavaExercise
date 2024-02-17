package L8Strings;
import java.util.Scanner;
//HW 2022-01-15 #1

public class Index {
    public static void main (String [] args) {
        String original = "Computer Science is no more about computers than astronomy is about telescopes.";
        System.out.println("The character at position 0 is " + original.charAt(0));
        System.out.println("The character at position 10 is " + original.charAt(10));
        Scanner reader = new Scanner(System.in);
        System.out.println("Specify character position: ");
        int n = reader.nextInt();
        int last = original.length()-1;
        if (n < original.length()) System.out.println("The character at position " + n + " is " + original.charAt(n));
        else System.out.println("Please specify a position in the range [0, " + last + "]");
        reader.close();
    }
}
