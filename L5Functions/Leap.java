package L5Functions;
import java.util.Scanner;

public class Leap {
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        System.out.println ("Please enter year: ");
        int year = reader.nextInt();
        if (isLeapYear (year))
        {
            System.out.println (year + " is a leap year.");
        }
        reader.close();
    }
    public static Boolean isLeapYear (int year)
    {
        Boolean leapYear = year%4==0 && year%100!=0 || year%400==0;
        return leapYear;
    }
}
