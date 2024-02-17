package L7Array;
import java.util.Scanner;
//老师的版本

public class Ex5_2_3 {
    public static void main (String [] args)
    {
        int[] d = new int[110];
        int i = 0; //下一个要放数字的地方
        Scanner reader = new Scanner (System.in);
        int v; //输入的数字
        System.out.println("Type");
        while ((v = reader.nextInt()) != 0) { //直接判断
            d[i] = v; //不是0的话就存到数组里面
            i++;
        }

        i--; //所有都存完了以后，把i减去1，找最后一个有数字的下标

        while (i>=0) {
            System.out.printf("%d ", d[i]);
            i--;
        }
        reader.close();
    }
}
