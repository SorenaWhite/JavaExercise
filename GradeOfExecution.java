/* Grade of Execution
 * 1. Input 9 values
 * 2. Sort
 * 3. Cancel the least and the greatest
 * 4. Find mean
 * 5. Read "BV"
 * 6. Print mean/5*BV
 */

import java.util.Scanner;
import java.util.Arrays;

public class GradeOfExecution {
    public static void main (String [] args) {
        Scanner reader = new Scanner (System.in);

        int[] judge = new int[9];

        for (int i=0; i<9; i++) {
            int number = i+1;
            System.out.println("GOE for judge " + number);
            judge[i] = reader.nextInt();
        }

        Arrays.sort(judge);
        double sum=0;
        double count=0;
        for (int i=1; i<8; i++) {
            sum+=judge[i];
            count++;
        }
        double mean = sum/count;
        double BV = reader.nextDouble();
        double cal = mean/5.00*BV/2.00;
        System.out.printf("The GOE is %.2f", cal);
        System.out.println();
        double sop = BV+cal;
        System.out.printf("The Scores of Panel is %.2f\n", sop);

        reader.close();
    }
}
