package L2If_For;
import java.util.Scanner;

public class Prime {
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        System.out.println ("Check what number? ");
        int n = reader.nextInt();
        reader.close();
        for (int i=2; i < n; i++)
        {
            if (n%i==0)
            {
                System.out.println(n + " is not prime");
                return;
            }
        }
        System.out.println(n + " is prime");
    }
}
