// package L12Recursion;
// import java.util.Scanner;

// public class Sum {
//     public static void main (String [] args) {
//         Scanner reader = new Scanner (System.in);
//         int result = 0;
//         System.out.println("Input: ");
//         int n = reader.nextInt();
//         if (n==1) {
//             result = 1;
//         }

//         reader.close();
//     }
// }


package L12Recursion;
import java.util.Scanner;

class Sum {
    public int Add(int n) {
        if (n==1) return n;
        else return n+Add(n-1);
    }
}

class SumDemo {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        Sum test = new Sum();
        int a = reader.nextInt();
        System.out.println("The sum from 1 to " + a + " is " + test.Add(a));
        reader.close();
    }
} 

