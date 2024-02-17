package Practise;

public class Times {
    public static void main (String [] args) {
    // int[] a = {10, 9, 8, 7, 6};
    int count = 0;
    int n=100;
        for (int i=1; i<=n-1; i++) {
            for (int j=n; j >= i +1; j--) {
                count++;
            }
        }
    System.out.println(count);
    }
    
}
