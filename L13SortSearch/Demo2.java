package L13SortSearch;
import java.util.List;
import java.util.Random;
import java.util.Comparator;
import java.util.ArrayList;

public class Demo2 {
    static void show (List<Integer> numbers) {
        for (Integer i : numbers) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }

    public static void main (String [] args) {
        List<Integer> alist = new ArrayList<Integer>();

        Random r= new Random();
        for (int i=0; i<10; i++) {
            alist.add(r.nextInt(100));
        }
        show(alist);
        alist.sort(Comparator.naturalOrder());
        show(alist);
        alist.sort(Comparator.reverseOrder()); // Descending, from greatest to least, independent of line 23
        show(alist);
    }
}
