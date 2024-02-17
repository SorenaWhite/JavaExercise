package L11Arraylist;
/* 
 * int
 * 1 to 10
 * 返回下标为中间位的值
 */
import java.util.ArrayList;
import java.util.Scanner;

//命名：尽量不要和元素数量相关，容易变得不相关

public class Ten {
    public static void main (String [] args) {
        ArrayList <Integer> ten = new ArrayList<Integer>();
    
        //加入元素
        for (int i=1; i<11; i++) ten.add(i);
        //打印中间位
        System.out.println(ten.get(ten.size()/2));
        //删除最后一位
        ten.remove(ten.size()-1);

        // 打印
        for (int a: ten) System.out.println(a);

        //复制
        ArrayList<Integer> ten2 = new ArrayList<Integer>();
        for (int e: ten) ten2.add(e);
        for (int e: ten2) System.out.printf("%d ", e);

        System.out.println();

        //查找
        Scanner reader = new Scanner (System.in);
        int find = reader.nextInt();
        int i = searchNumber(ten2, find);
        if (i >= 0) System.out.println(find + " has index " + i);
        else System.out.println(find + " cannot be found");
        reader.close();

        //返回最大值
       int da = greatest(ten2);
       System.out.println(da);

    }
    // given: 形式参数，不需要按照前面的名称
    //查找函数
    public static int searchNumber(ArrayList<Integer> given, int number) {
        int index = -1;
        for (int i=0; i<given.size(); i++) {
            if (given.get(i) == number) index=i;
        }
        return index;
    }

    //返回最大值函数
    public static int greatest(ArrayList<Integer> given) {
        int high = 0;
        for (int i=0; i<given.size(); i++) {
            if (given.get(i) > given.get(high)) high=i;
        }
        return given.get(high);
    }
}
