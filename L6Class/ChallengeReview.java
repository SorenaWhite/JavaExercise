package L6Class;

public class ChallengeReview {
    public static void main (String [] ags)
    {
        int j=0;
        char i;
        for (j=0, i=40; i<120; i++, j++)
        {
            System.out.printf("%3d %c %-3d %h %o %s\n", j, i, (int)i, (int)i, (int)i, Integer.toBinaryString((int)i));
        }
    }
}
