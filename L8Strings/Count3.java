package L8Strings;
import java.util.Scanner;
import java.util.Arrays;
//放到一个数组里面的第三版

public class Count3 {
    public static void main (String [] args) throws Exception {
        Scanner r = new Scanner(System.in);
        String line = r.nextLine();

        int [] count = new int[52];
        Arrays.fill(count, 0);


        for (int i=0; i<line.length(); i++) {
            char c= line.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                count[c-'A']++; //大写字母放在前面
            } else if (c >= 'a' && c<= 'z') {
                count[c-'a'+26]++; //找出小写字母绝对位置，整体往右移26个
            }
        }

        for (int i=0; i<count.length; i++) {
            if (count[i] != 0) {
                if (i <= 25) System.out.printf ("%c %d\n", 'A'+i, count[i]);
                else System.out.printf ("%c %d\n", 'a'+i-26, count[i]);
            }
        }

        
        
        
        r.close();
    }
}