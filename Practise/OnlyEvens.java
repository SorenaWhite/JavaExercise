package Practise;
import java.util.Random;
// Math.random: 返回0-1之间的随机小数

public class OnlyEvens {
    public static void main (String [] args) {
        int[] result = onlyEvens(10, 100);
        for (int e: result) {
            System.out.printf("%d ", e);
        }
        
    }
    
    
    public static int[] onlyEvens(int size, int range) {
        int[] arr = new int[size];
        Random random = new Random();
        for (int i=0; i<arr.length; i++) {
            // arr[i] = random.nextInt()%(range+1);
            arr[i] = (int) (random.nextDouble()*(range+1));
            if (arr[i]%2 != 0) arr[i]+=1;
            // arr[i] = (int) Math.random();
        }
        return arr;
    }
}
