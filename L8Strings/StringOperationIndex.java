package L8Strings;
import java.util.Scanner;
// 第二题

public class StringOperationIndex {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);

        String T = "I love Competitive Programming, i also love chess.";
        System.out.println("Input string to search: ");
        String P = reader.next();
        int i = 0;
        if (T.indexOf(P, i) != -1) {
            while (T.indexOf(P, i) != -1) {
                System.out.printf("%d ", T.indexOf(P, i));
                i = T.indexOf(P, i) + P.length();
            }
        }
        else System.out.printf("%d ", -1);
        

        reader.close();
    }
}
