package L12Recursion;
import java.util.Scanner;

class Fib {
    int Next(int n) {
        int next = 0;
        if (n==0 || n ==1) {
            next = n;
            // System.out.printf("%d ", next);
        }
        else {
            next = Next(n-1) + Next(n-2);
        }
        return next;
    }
}

public class Fibonacci {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        Fib hi = new Fib();
        int num = reader.nextInt();
        // System.out.println(hi.Next(5));
        for (int i=0; i<num; i++) {
            System.out.printf("%d ", hi.Next(i));
        }
        reader.close();
    }
}
