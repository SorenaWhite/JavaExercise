package Practise;

public class Replacement {
    public static void main (String [] args) {
        int[] original = {634, 521, 786, 899, 509, 235, 750, 806, 142, 645};
        
        for (int e: replaceHighAndLow(original)) System.out.printf("%d ", e);
    }

    public static int[] replaceHighAndLow (int[] arr) {
        int[] copied = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            if (arr[i] < 250) copied[i]=0;
            else if (arr[i] > 750) copied[i] = 1000;
            else copied[i] = arr[i];
        }
        return copied;
    }
}
