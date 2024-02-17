package L1Basic;
import java.util.Scanner;
public class ScannerString {
    public static void main (String [] augs)
    {
        Scanner reader = new Scanner (System.in);

        System.out.println ("What is your age? ");
        int age = reader.nextInt();
        System.out.println ("What is your name? ");
        String name = reader.next();
        System.out.println (name + " is " + age + " years old.");
        reader.close();
    }
}
