package L7Array;
import java.util.Random;

public class ArrayIteration {
    public static void main (String [] args)
    {
        Random random = new Random();
        int [] sample = new int[10];
        for (int i=0; i<10; i++)
        {
            sample [i] = random.nextInt(100);
        }
        for (int i=0; i<10; i++)
        {
            System.out.println (sample [i]);
        }

        int maxv = sample[0];
        int minv = sample [0];
        for (int i=1; i<10; i++)
        {
            if (maxv < sample[i])
            {
                maxv = sample[i];
            }
            if (minv > sample[i])
            {
                minv = sample[i];
            }
        }
        System.out.println ("The greatest is " + maxv + " and the least is " + minv);

        for (int i=0; i < sample.length-1; i++)
        {
            for (int j=0; j < sample.length-i-1; j++)
            {
                if (sample[j] > sample [j+1])
                {
                    int t = sample [j];
                    sample [j] = sample [j+1];
                    sample [j+1] = t;
                }
            }
        }
        for (int i=0; i<sample.length; i++)
        {
            System.out.printf("%d ", sample[i]);
        }

        // 6 3 4 1  sample.length = 4
        // 0 1 2 3
        // for (int i=0; i < 3; i++)

        // i=0
        // j=0, j < 3, j++
        // sample [0] > sample [1], so int t = 6, sample [0] = 3, sample [1] = 6   =>  3 6 4 1
        // j=1, j < 3, j++
        // sample [1] > sample [2], so int t = 6, sample [1] = 4, sample [2] = 6   =>  3 4 6 1
        // j=2, j < 3, j++
        // sample [2] > sample [3], so int t = 6, sample [2] = 1, sample [3] = 6   =>  3 4 1 6
        // 3 4 1 6
        // 0 1 2 3

        // i=1
        // j=0, j < 2; j++
        // sample [0] < sample [1]  => 3 6 4 1
        // j=1, j < 2; j++
        // sample [1] > sample [2], so int t = 4, sample [1] = 1, sample [2] = 4   =>  3 1 4 6
        // 3 1 4 6
        // 0 1 2 3

        // i=2
        // j=0, j < 1; j++
        // sample [0] > sample [1], so int t = 3, sample [0] = 1, sample [1] = 3   =>  1 3 4 6
        // 1 3 4 6
        // 0 1 2 3

    }
}
