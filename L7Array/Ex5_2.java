package L7Array;
import java.util.Scanner;
//P1427

public class Ex5_2 {
    public static void main (String [] args) {
        int[] numbers = new int[101];
        System.out.println("Please enter numbers, separated by space, ended with 0: ");
        int i=0;
        try (Scanner reader = new Scanner(System.in)) {
            for (; i<8; i++) {
                numbers[i] = reader.nextInt();
            }
            reader.close();
        }
        System.out.printf("%d ", numbers);
        for (i=numbers.length-1; i>=0; i--) {
            System.out.printf("%d ", numbers[i]);
        }



        /*
         * for (int i = str.length()-1; i >= 0; i--) //倒着打印字符串，因为开头坐标是0所以从-1开始
        {
            System.out.printf("%c", str.charAt(i));
        }
         */




        
   
        
    }
}

/*
 * int[] numbers = new int[0];
        numbers = new int[numbers.length];
        int number =0;
        for (int i=0; i<numbers.length; i++) 
        {
            number = reader.nextInt();
        }

        System.out.println(number);
        
 */