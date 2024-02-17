package L8Strings;
import java.util.Scanner;
// 第三题

public class StringOperationCount {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        String T = reader.nextLine();
        int numberCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;
        System.out.printf("Total: %d, ", T.length());
        for (int i=0; i<T.length(); i++) {
            char c = T.charAt(i);
            if (c >= '0' && c <= '9') numberCount++;
            else if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A'||c=='E'||c=='I'||c=='O'||c=='U') vowelCount++;
            else if ((c >= 'A' && c <= 'Z') || (c >='a' && c<='z')) consonantCount++; 
        }
        System.out.println("numbers: " + numberCount + ", vowels: " + vowelCount + ", consonants: " + consonantCount);
        reader.close();
    }
}
