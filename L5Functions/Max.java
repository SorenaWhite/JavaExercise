package L5Functions;
import java.util.Scanner;

public class Max {
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        System.out.println ("Please enter first integer: ");
        int a = reader.nextInt();
        System.out.println ("Please enter second integer: ");
        int b =reader.nextInt();
        System.out.println ("Please enter third integer: ");
        int c = reader.nextInt();
        int great = max3(a, b, c);
        System.out.println ("The greatest integer of the three is " + great);
        reader.close();
    }
    public static int max (int a, int b, int c)
    {
        if (a >= b && a >= c)
        {
            return a;
        }
        else if (b >= a && b >= c)
        {
            return b;
        }
        else
        {
            return c;
        }
    }
    public static int max2 (int a, int b)
    {
        if (a >= b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static int max3 (int a, int b, int c)
    {
        return max2(max2 (a, b), c);
    }
}
