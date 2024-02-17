package L3;

public class HWPrime2 {
    public static void main (String [] args)
    {
        int a;
        for (a =2; a <= 100; a++)
        {
            int i = 2; 
            for (i=2; i*i <= a; i++)
            {
                if (a%i==0)
                {
                    break;
                }
            }
            if (i*i>a)
            {
                System.out.println(a);
            }
        }
    }
}
