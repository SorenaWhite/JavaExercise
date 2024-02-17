package L7Array;
import java.util.Random;

public class ArrayE {
    public static void main (String [] args) throws Exception{
        //Exception: 异常. throws exception：抛出异常，用来集中处理，让逻辑往下走
        Random random = new Random();
        int[]alist = new int[10];
        for(int i=0; i < alist.length; i++)
        {
            alist[i] = random.nextInt(100);
            System.out.printf("%d ", alist[i]);
        }
        System.out.println();
        for(int e: alist) //不使用下标，将 array 里面的值copy给e，不改变数组里本身的值
        {
            System.out.printf("%d ", e);
        }
        System.out.println();
        return;
    }
}
