package L11Arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class Duplicate {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter five integers for list 1: ");
        for (int i=0; i<5; i++) {
            list.add(reader.nextInt());
        }
        System.out.println("Enter five integers for list 2: ");
        for (int i=0; i<5; i++) {
            int a = reader.nextInt();
            if (list.contains(a)) continue;
            else list.add(a);
        }
        
        System.out.println(list);       


        reader.close();
    }
}
