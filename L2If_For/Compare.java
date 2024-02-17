package L2If_For;
import java.util.Scanner;

public class Compare {
    public static void main (String [] args) throws java.io.IOException
    {
        Scanner reader = new Scanner (System.in);
        System.out.println ("What is your first number? ");
        double a = reader.nextDouble();
        System.out.println ("What is your second number? ");
        double b = reader.nextDouble();
        if (a > b)
        {
            System.out.println (">");
        }
        else if (a < b)
        {
            System.out.println ("<");
        }
        else
        {
            System.out.println ("==");
        }
        reader.close();

    }
}
