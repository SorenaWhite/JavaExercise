package L3;
import java.util.Scanner;

public class PythagoreanTheorem 
{
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        System.out.println ("Please enter the length of a: ");
        double a = reader.nextDouble();
        System.out.println ("Please enter the length of b: ");
        double b = reader.nextDouble();
        double aSquared = a*a;
        double bSquared = b*b;
        double c = Math.sqrt(aSquared + bSquared);
        System.out.println("The length of the hypotenuse of triangle ABC is " + c);
        reader.close();
    }
}