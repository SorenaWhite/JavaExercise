package L3;
import java.util.Random;

public class TestRa {
    public static void main (String [] args) throws Exception
    {
        Random random = new Random();
        for (int i =0; i < 5; i++)
        {
            System.out.println("--------------------------------------------"+i);
            System.out.println(random.nextDouble());
            System.out.println(random.nextInt());
            System.out.println(random.nextInt(11)+1);
            System.out.println(random.nextLong());
            System.out.println(random.nextBoolean());
            System.out.println();
        }
    }
}
