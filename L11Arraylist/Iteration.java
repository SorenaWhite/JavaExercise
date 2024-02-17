package L11Arraylist;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration {
    public static void main (String [] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(34);
        numbers.add(30);
        numbers.add(23);
        numbers.add(11);
        numbers.add(19);

        Iterator<Integer> it= numbers.iterator();
        while(it.hasNext()) {
            int v = it.next();
            if (v==34) {
                it.remove();
            }
        }

        System.out.println(numbers);

        ListIterator<Integer> it2 = numbers.listIterator(1);
        while(it2.hasNext()) {
            int v = it2.next(); // 拿一个并指向下一个，有两个功能
            System.out.printf("1) %d \n", v);
            v = it2.next();
            System.out.printf("2) %d \n", v);
            if(v == 30) {
                it2.remove();
            }
        }
    }
}
