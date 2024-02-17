package L7Array;
import java.util.Scanner;
//https://www.luogu.com.cn/problem/P5727

public class Ex5_3_3 {
    public static void main (String [] args) {
        Scanner reader = new Scanner (System.in);
        System.out.println("Type:");
        int n = reader.nextInt();
        int[] change = new int[101];
        change[0] = n;
        int i = 1;
        while (n != 1) {
            if (n%2 != 0) {
                n = n*3+1;
            }
            else {
                n = n/2;
            }
            change[i] = n;
            i++;
        }
        for (int j=i-1; j>=0; j--) {
            System.out.printf("%d ", change[j]);
        }
        reader.close();
    }
}
