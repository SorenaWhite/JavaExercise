package L8Strings;
import java.util.Scanner;

public class Switch {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);

        String command = reader.next();
        switch (command) {
            case "connect":
                System.out.println("Trying to connect...");
                break;
            case "cancel":
                System.out.println("Cancelling task...");
                break;
            case "disconnect":
                System.out.println("Disconnecting...");
                break;
            default:
                System.out.println("Sorry. I do not understand.");
                break;
        }
        
        reader.close();
    }
}
