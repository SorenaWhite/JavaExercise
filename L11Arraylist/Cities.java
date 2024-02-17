package L11Arraylist;
import java.util.ArrayList;
// 增删改查

public class Cities {
    public static void main (String [] args) {
        ArrayList<String> alist = new ArrayList<>();
        alist.add("Beijing");
        alist.add("NewYork");
        alist.add("London");
        alist.add("Tokyo");
        alist.add("Ottowa");
        alist.add("Paris");
        System.out.print(alist);
        System.out.printf("\n%d\n", alist.size());
        alist.remove(5);
        System.out.print(alist);
        System.out.printf("\n%d\n", alist.size());
        alist.remove("London");
        System.out.print(alist);
        System.out.printf("\n%d\n", alist.size());

        if(alist.contains("Beijing")) {
            System.out.printf("Beijing is in the list\n");
        }
        else {
            System.out.printf("Beijing is not in the list\n");
        }
        if(alist.contains("NewYork")) {
            System.out.printf("NewYork is in the list\n");
        }
        else{
            System.out.printf("NewYork is not in the list\n");
        }

        if(alist.isEmpty()) {
            System.out.printf("alist is empty\n");
        }
        else {
            System.out.printf("alist is not empty\n");
        }

        int d = alist.indexOf("Beijing");
        System.out.printf("Beijing has index %d\n", d);
        d = alist.indexOf("NewYork");
        System.out.printf("NewYork has index %d\n", d);

        String e = alist.get(0);
        System.out.printf("%s is at index 0\n", e);

        for (int i=0; i<alist.size(); i++) {
            System.out.printf("--%s\n", alist.get(i));
        }
        System.out.println();
    }
}
