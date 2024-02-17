package L5Functions;
import java.util.Scanner;

public class FunctionPrac {
    public static double average (double x, double y)
    {
        double sum = x+y;
        x=2*x;
        return sum/2;
    }
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        System.out.println ("Please enter your first number: ");
        double a = reader.nextDouble();
        System.out.println ("Please enter your second number: ");
        double b = reader.nextDouble();
        double result = average (a,b);
        System.out.println ("The mean of "+ a + " and " + b + " is " + result);
        reader.close();
    }
}
