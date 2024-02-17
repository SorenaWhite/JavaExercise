package Practise;
// import java.util.ArrayList;

class Hailstone {
    // ArrayList<Integer> sequence = new ArrayList<Integer>();
    

    // public int[] run(int n) {
    //     while (n!=1) {
    //         if (n%2 == 0) sequence.add(n/2);
    //         else if (n%2 == 1) sequence.add(3n+1);
    //     }
    //     int[] a = new int[sequence.size()];
    //     for (int i=0; i<sequence.size(); i++) {
    //         a[i] = sequence.get(i);
    //     }
    //     return a;
    // }

    public static int hailstoneLength(int n) {
        /* Returns length of hailstone sequence that starts with n
         * Precondition: n > 0
         */

        // return sequence.size();
        int x = 1;
        while (n>1) {
            if (n%2==0) n=n/2;
            else if (n%2==1 && n!=1) n=3*n+1;
            x++;            
        }
        return x;
    }

    public static boolean isLongSeq(int n) {
        /* Returns true if hailstone sequence starting with n is considered long and false otherwise
         * Precondition: n > 0
         */

        // if (n<hailstoneLength(n)) return true;
        // else return false;

        return n < hailstoneLength(n);

    }

    public static double propLong(int n) {
        /* Returns proportion of first n hailstone sequences that are considered long
         * Precondition: n > 0
         */
        double x =0.0;
        for (int i=1; i<=n; i++) {
            if (isLongSeq(i)) x++;
        }
        return x/n;
    }
}

public class HailstoneDemo {
    public static void main (String [] args) {
        System.out.println(Hailstone.hailstoneLength(5));
        System.out.println(Hailstone.isLongSeq(5));
        System.out.println(Hailstone.propLong(10));
    }
}
