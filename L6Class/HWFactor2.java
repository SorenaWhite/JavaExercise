package L6Class;
import java.util.Random;

public class HWFactor2 {
    private int a;
    private int b;
    public HWFactor2 (int a, int b)
    {
        this.a=a;
        this.b=b;
    }
     boolean isFactor()
        {
            return a%b==0 || b%a==0;
        }
}

class FactorDemo
{
    public static void main (String [] args)
    {
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);
        System.out.println(a + "," + b);
        HWFactor2 factor = new HWFactor2(a, b);
        System.out.println(factor.isFactor());
    }
}