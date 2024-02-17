package L4Review;
import java.util.Random;
import java.util.Scanner;

public class RaPractise {
    public static void main (String [] args)
    {
        Random random = new Random();
        int number1 = random.nextInt(10);
        int number2 = random.nextInt(10);
        if (number1 < number2)
        {
            int t = number1;
            number1 = number2;
            number2 = t;
        }
        
        System.out.println ("What is " + number1 + " - " + number2 + "?");
        Scanner reader = new Scanner (System.in);
        int student = reader.nextInt();
        if (student == number1 - number2)
        {
            System.out.println ("Correct");
        }
        else
        {
            System.out.println ("Please try again");
        }
        reader.close();
    }
}
