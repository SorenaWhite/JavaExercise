package L4Review;
import java.util.Scanner;

public class Leap {
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        System.out.println ("Please enter year: ");
        int year = reader.nextInt();
        boolean leapYear = year%4==0 && year%100!=0 || year%400==0;
        System.out.println ("Is " + year + " a leap year: " + leapYear);

        reader.close();
    }
}
