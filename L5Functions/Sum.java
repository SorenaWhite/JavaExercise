package L5Functions;
import java.util.Scanner;

public class Sum {
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        System.out.println ("Please enter a number: ");
        int a = reader.nextInt();
        System.out.println ("Plese enter another number greater than the first: ");
        int b = reader.nextInt();
        int sum = sum (a, b);
        System.out.println ("The sum from a to b is " + sum);
        reader.close();
    }
    public static int sum (int a, int b)
    {
        for (int i=a+1; i <=b; i++)
        {
            a = a+i;
        }
        return a;
    }

}
