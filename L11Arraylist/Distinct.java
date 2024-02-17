package L11Arraylist;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Comparator;
import java.util.Collections;

public class Distinct {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (reader.hasNext()) {
            int input = reader.nextInt();
            if (input == 0) break;
            else if (list.contains(input)) continue;
            else list.add(input);
        }

        // 第12行完成以下：
        // for (int i=0; i<list.size(); i++) {
        //     for (int j=i+1; j<list.size(); j++) {
        //         if (list.get(i)==list.get(j)) {
        //             list.remove(j);
        //         }
        //     }
        // }
        System.out.println(list);
        reader.close();


        // 排序 方法一 Comparator
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        list.sort(Comparator.reverseOrder());
        System.out.println(list);

        // 排序 方法二 Collections
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
