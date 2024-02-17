package L11Arraylist;
import java.util.Scanner;
import java.util.Arrays;

public class Trees {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);

        int road = reader.nextInt();
        int length = road+1;
        boolean[] trees = new boolean[length];

        // for (int i=0; i<length; i++) {
        //     trees[i] = true;
        // }
        Arrays.fill(trees, true);

        int numArea = reader.nextInt();
        for (int i=0; i < numArea; i++) {
            int start = reader.nextInt();
            int end = reader.nextInt();
            // for (int j=start; j<=end; j++) {
            //     trees[j] = false;
            // }
            Arrays.fill(trees, start, end+1, false);
        }

        int t = 0;
        for (int i=0; i<length; i++) {
            if (trees[i]) {
                t++;
            }
        }
        System.out.println(t);

        reader.close();

    }
}
