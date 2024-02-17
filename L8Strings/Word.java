package L8Strings;
import java.util.Scanner;
// 2023-01-19 作业

public class Word {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter string: ");
        String string = reader.nextLine();
        System.out.println("Enter word number: ");
        int n = reader.nextInt();
        String [] words = string.split(" ");
        System.out.println(words[n-1]);

        System.out.println("Enter string: ");
        String large = reader.nextLine(); //运行的时候，如果第一题的代码不注释掉，就会自动跳过这一行
        System.out.println("Enter the word you are looking for: ");
        String word = reader.next();
        int count = 0;
        int i = 0;
        while (large.indexOf(word, i) != -1) {
            count++;
            i = large.indexOf(word, i) + word.length();
        }
        System.out.println(count);

        reader.close();
    }
}
