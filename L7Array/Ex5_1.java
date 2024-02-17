package L7Array;
import java.util.Scanner;
//P1428

public class Ex5_1 {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Please input the number of fish: ");
        int n = reader.nextInt();
        int[] fish = new int[n];
        System.out.println("Please input the cuteness of each fish, separated by space: ");
        for (int i=0; i<n; i++) fish[i] = reader.nextInt();
        
        for (int i=0; i<n; i++) {
            int cute = 0;
            for (int j=0; j<i; j++) {
                if (fish[j] < fish[i]) cute++;
            }
            System.out.printf("%d ", cute);
        }

        reader.close();
    }
}

/*
 * public static void main (String [] args) {
        //5-1 在自己的眼里范围内有多少条鱼不如自己可爱呢，朝左，整数，可能相同
        int[] fish = new int[100];
        Random random = new Random();
        设这个鱼的下标为n，从0到n的下标每一个格子的值，如果小于，就往 less 上+1
        cute：值，随机生成
        n：下标
        less：前面多少个 cute 比 n 的小
        1. 生成 cute 值
        2. 对比

         int i = 0;
         for (; i<100; i++)
         {
             fish [i] = random.nextInt(100);
             System.out.printf("%d ", fish[i]);
         }
         
         int cute = 0;
         for (i=0; i<100; i++) //这个鱼
         {
             for (int j=0; j<i; j++)
             {
                 if (fish[j] < fish[i])
                 {
                     cute++;
                 }
             }
             System.out.println("Fish #" + i + " is cuter than " + cute + " fish in front of it.");
         }
     }
 */