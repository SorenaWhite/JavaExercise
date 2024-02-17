package L5Functions;

public class HWChallenge {
    public static void main (String [] args)
    {
        for (int i=10; i<=40; i++)
        {
            String s = Integer.toBinaryString(10);
            System.out.printf("%-15d%c%x%o%s", i, s);
        }
    }
}
