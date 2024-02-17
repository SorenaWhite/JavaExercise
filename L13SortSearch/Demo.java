package L13SortSearch;
import java.util.Random;
import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;


public class Demo {
    public static void main (String [] args) {
        Integer[] d = new Integer[10]; // 20行转换成 ArrayList，primitive type 不能转换成 ArrayList，要用通用类型 generic
        Random r = new Random();
        for(int i=0; i<10; i++) {
            d[i]=r.nextInt(100);
        }
        for (Integer i : d) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        // Ascending
        Collections.sort(Arrays.asList(d)); // 要先转换成 ArrayList。sort：按照数据大小排序
        for (Integer i : d) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        // Descending
        Collections.reverse(Arrays.asList(d)); // reverse: 和数据大小没有关系，只是把数据倒排一下
        for (Integer i : d) {
            System.out.printf("%d ", i);
        }



        ArrayList<Integer> alist = new ArrayList<Integer>();
        for (int i=0; i<10; i++) {
            alist.add(r.nextInt(100));
        }

        for (Integer i : alist) {
            System.out.printf("%d ", i);
        }
        System.out.println();

        Collections.sort(alist);
        for(Integer i : alist) {
            System.out.printf("%d ", i);
        }
        System.out.println();

    }
}
