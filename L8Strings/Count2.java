package L8Strings;
import java.util.Scanner;
import java.util.Arrays;
//老师的版本

public class Count2 {
    public static void main (String [] args) throws Exception {
        Scanner r = new Scanner(System.in);
        String line = r.nextLine();

        int [] count_a = new int[26];
        int [] count_b = new int[26];
        
        Arrays.fill(count_a, 0); //count_a 的每个单元初始化为0
        Arrays.fill(count_b, 0);

        for (int i=0; i<line.length(); i++) {
            char c= line.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                count_b[c-'A']++;
            } else if (c >= 'a' && c<= 'z') {
                count_a[c-'a']++;
            }
        }

        for (int i=0; i<count_a.length; i++) {
            if (count_a[i] != 0) {
                System.out.printf ("%c %d\n", 'a'+i, count_a[i]);
            }
        }
        for (int i=0; i<count_b.length; i++) {
            if (count_b[i] != 0) {
                System.out.printf ("%c %d\n", 'A'+i, count_b[i]);
            }
        }

        //从小到大排序，大小写需要分开
        Arrays.sort(count_a); //把要排序的数组以参数的方式传进去
        System.out.println();

        r.close();
    }
}
