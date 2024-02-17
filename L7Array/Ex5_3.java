package L7Array;
import java.util.Scanner;
//P5727

public class Ex5_3 {
    public static void main (String [] args) throws Exception {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please type integer:");
        int number = reader.nextInt();
        int i = 1;
        int[] list = new int[i];
        list[0]= number;
        while (number != 1) {
            if (number%2 != 0)
            {
                number = number*3+1;
            }
            else
            {
                number = number/2;
            }
            list[list.length-1] = number;
            System.out.printf("%d ", list[list.length-1]);
            i++;
            list = new int[i++];
        }
        System.out.println();
        System.out.println(i);
        for (int j=list.length-1; j>=0; j--) {
            System.out.printf("%d ", list[j]);
        }

        reader.close();
    }
}
