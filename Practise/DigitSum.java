package Practise;
import java.util.Scanner;

public class DigitSum {
    public static void main (String [] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Please input: ");
        int value = reader.nextInt();
        int number = Math.abs(value);
        int digit, sum = 0;
        while (number > 0) {
            digit = number%10;
            sum+=digit;
            number /= 10;
        }
        System.out.println(sum);
        reader.close();
    }
}
