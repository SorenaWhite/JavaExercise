package L6Class;
import java.util.Random;

public class HWFactor {
    static boolean isFactor(int a, int b)
        {
            return a%b==0 || b%a==0;
        }
}

class FactorDemo
{
    public static void main (String [] args)
    {
        //HWFactor factor = new HWFactor();
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        System.out.println(a + "," + b);
        System.out.println(HWFactor.isFactor(a, b));
    }
}