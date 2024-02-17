package L7Array;
import java.util.Scanner;

public class Ex5_2_2 {
    public static void main (String [] args) throws Exception{
        Scanner reader = new Scanner (System.in);
        int[] numbers = new int[101];
        int count = 0;
        System.out.println("Type");
        for (int i=0; i<101; i++) {
            numbers [i] = reader.nextInt();
            if (numbers[i] == 0) {
                break;
            }
            else {
                count++;
            }
        }
        for (int j=count-1; j >= 0; j--) {
            System.out.printf("%d ", numbers[j]);
        }

        reader.close();
    }

    /*
     * int i = 1;
        int remember = 0;
        int[] list = new int[i];
        for (i = list.length-1; i<101; i++) {
            remember = reader.nextInt();
            list[i] = remember;
        }
        for (int j = list.length-1; j >= 0; j--) {
            System.out.printf("%d ", list[j]);
        }
        reader.close();
     */
}
