import java.util.Scanner;

public class ASCII {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Encrypt");
        String input = reader.nextLine();
        for (int i=0; i<input.length(); i++) {
            System.out.printf("%d ", (int) input.charAt(i));
        }
        System.out.println();

        // System.out.println("Decrypt");
        // String input2 = reader.nextLine();
        // for (int i=0; i<input2.length(); i++) {

        // }
        // while ((int) (input2) != 46) System.out.printf("%s ", (char) input2);
        


        // for (int i=0; i<input2.length(); i++) {
        //     if (input2.charAt(i) != ' ') {
        //         System.out.printf("%s ", (char) input2.charAt(i));
        //     }
        // }

        reader.close();
    }
}
