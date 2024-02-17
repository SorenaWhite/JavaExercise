package L3;

public class HWPrimeIn100 {
    public static void main (String [] args)
    {
        for (int n=2; n < 100; n++)
        {
            for (int i=2; i < n; i++)
            {
                if (n%i==0)
                {
                    break;
                }
                else
                {
                    System.out.println(n + "is prime");
                }    
            }
        }
    }
}
