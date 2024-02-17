package L1Basic;
import java.util.Scanner;

public class Convert {
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        
        System.out.println ("What is the temperature in Farenheit?");
        double original = reader.nextDouble();
        double entered = (original-32)*5.0/9.0;
        System.out.println ("The unit in Celsius is " + entered);

        reader.close();
    }
}