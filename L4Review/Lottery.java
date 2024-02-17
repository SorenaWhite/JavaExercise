package L4Review;
import java.util.Random;
import java.util.Scanner;


public class Lottery {
    public static void main (String [] args)
    {
        Random random = new Random();
        int number = random.nextInt(99);
        int digit1 = number%10;
        int digit2 = number/10;
        System.out.println("Please enter your two-digit number: ");
        Scanner reader = new Scanner (System.in);
        int user = reader.nextInt();
        System.out.println ("The lottery number is " + number);
        int user1 = user%10;
        int user2 = user/10;
        if (user == number)
        {
            System.out.println ("Exact match: your win is $10,000");
        }
        else if (user1 == digit2 && user2 == digit1)
        {
            System.out.println ("Number match: your win is $3,000");
        }
        else if (user1 == digit2 || user2 == digit1)
        {
            System.out.println ("One match: your win is $1,000");
        }
        else
        {
            System.out.println ("No win");
        }
        reader.close();
    }
}
