package L2If_For;
import java.util.Scanner;
public class CompareAddition {
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        System.out.println ("Type first integer: ");
        int a = reader.nextInt();
        System.out.println ("Type second integer: ");
        int b = reader.nextInt();
        int sum=0;
        for (int i=a; i <= b; i++)
        {
            sum = sum+i;
        }
        System.out.println(sum);
        reader.close();
    }
}
