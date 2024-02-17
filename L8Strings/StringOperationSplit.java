package L8Strings;
import java.util.Arrays;

public class StringOperationSplit {
    public static void main (String [] args) {
        // 第四题
        String T = "I love competitive programming. I also love chess.";
        String P = T.replace(".", "");
        String[] tokens = P.split(" ");
        Arrays.sort(tokens);
        for (String word : tokens) System.out.printf("%s, ", word);  
        System.out.println();

        // 第五题 没完全写对
        for (int i=0; i<tokens.length; i++) {
            String word = tokens[i];
            int count = 1;
            int j=i+1;
            while (j <tokens.length) {
                int equal = word.compareTo(tokens[j]);
                if (equal == 0) {
                    count++;
                    j+=2;
                }
                else {
                    j++;
                }
            }
            System.out.println(word + ": " + count);
        }
    }
}