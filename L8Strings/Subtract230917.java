package L8Strings;
import java.util.Scanner;

public class Subtract230917 {
    public static void main (String [] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Input String A");
        String a = reader.nextLine();
        System.out.println("Input String B");
        String b = reader.nextLine();

        int j = a.indexOf(b);
        while (j != -1) {
            a = a.substring(0, j) + a.substring(j+b.length()); // lo. o
            j = a.indexOf(b);
        }

        System.out.println(a);
        // maxma => m
        // hello => l

        reader.close();
    }
}
