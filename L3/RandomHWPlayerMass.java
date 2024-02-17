package L3;
import java.util.Random;

public class RandomHWPlayerMass {
    public static void main (String [] args)
    {
        Random random = new Random();
        for (int i=0; i<10; i++)
        {
            calculate(random);
        }
    }
    private static void calculate(Random random)
    {
        System.out.println ("What is your mass in kilograms?");
        double mass = random.nextDouble()*50+50;
        System.out.println(mass);
        System.out.println ("What is your height in metres?");
        double height = random.nextDouble()*0.8+1.5;
        System.out.println(height);
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
    }
}
