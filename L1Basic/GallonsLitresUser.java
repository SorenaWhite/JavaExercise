package L1Basic;
import java.util.Scanner;

public class GallonsLitresUser {
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);

        System.out.println ("Gallons: ");
        double gallons = reader.nextDouble();
        double litres = gallons*3.7854;
        System.out.println (gallons + " gallons is " + litres + " litres.");

        if (gallons < litres)
        {
            System.out.println ("<");
        }
        else 
        {
            if (gallons > litres)
            {
                System.out.println (">");
            }
            else
            {
                System.out.println ("=");
            }
        }
           
        reader.close();
    }
}
