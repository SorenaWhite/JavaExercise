package Practise;
import java.util.Scanner;

public class CountString {
    public static void main (String [] args) {
        Scanner reader = new Scanner (System.in);

        System.out.println("enter");

        String in = reader.nextLine();
        String space = " ";
        int count =0;
        int start = 0;
        int current = in.substring(start).indexOf(space);
        while(current != -1) {
            count++;
            start+= (current+1);
        }
        System.out.println(count);
        reader.close();
    }
}
