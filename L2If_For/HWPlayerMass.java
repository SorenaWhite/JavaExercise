package L2If_For;
import java.util.Scanner;

public class HWPlayerMass {
    public static void main (String [] args)
    {
        for (int i=0; i<10; i++)
        {
            calculate();
        }
    }
    private static void calculate()
    {
        Scanner reader = new Scanner (System.in);
        System.out.println ("What is your mass in kilograms?");
        double mass = reader.nextDouble();
        System.out.println ("What is your height in metres?");
        double height = reader.nextDouble();
        double heightSquared = height*height;
        double BMI = mass/heightSquared;
        System.out.println ("Your body mass index is " + BMI);
        if (BMI < 18.5)
        {
            System.out.println("Underweight");
        }
        else if (BMI < 25)
        {
            System.out.println("Health weight");
        }
        else if (BMI < 30)
        {
            System.out.println("Overweight");
        }
        else if (BMI < 40)
        {
            System.out.println("Obese");
        }
        else
        {
            System.out.println("Extremely obese");
        }
        reader.close();
    }
}
