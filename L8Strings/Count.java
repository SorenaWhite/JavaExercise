package L8Strings;
import java.util.Scanner;

//HW 2022-01-15 #2
//what is
public class Count {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type string");
        String input = reader.nextLine();
        System.out.println("The length of the string is " + input.length());
        int[] chars = new int[58];
        for (char i='A'; i<='z'; i++) {
            for (int j=0; j<input.length(); j++) {
                if (input.charAt(j) == i) chars[(int)i-65]++;
            }
            if (chars[(int)i-65] != 0) System.out.println(i + ": " + chars[(int)i-65]);
        }
        reader.close();

        /*
         * char[] string = new char[input.length()];
        for (int i=0; i<input.length(); i++) { //把输入的字符串储存到 String 的数组里
            string[i] = input.charAt(i);
        }
        for (int i=0; i<input.length(); i++) {
            System.out.printf("%c", string[i]);
        }
        int[] chars = new int[58];
        for (int i=0; i<58; i++) {
            if (string[i] == (char)i+65) {
                chars[i]++;
            }
            System.out.println(chars[i]);
        }
        int count = 0;
        for (int j=0; j<input.length(); j++) {
            for (char i=65; i<=122; i++) {

            }
        }
         */
    }
}
