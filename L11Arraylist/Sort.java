package L11Arraylist;

public class Sort {
    public static void main (String [] args) {
        int[] ori = {67, 23, 12, 54, 35, 18};
        // InsertionSort(ori);
        SelectionSort(ori);
        for (int i: ori) System.out.printf("%d ", i);
    }
    //Insertion sort
    public static void InsertionSort(int[] arr) {
        for (int j=1; j<arr.length; j++) { // j=1
            int value = arr[j]; // a=23
            int index = j; // index = 1
            while (index>0 && value < arr[index-1]) { // 23 < 67 && j>0
                arr[index] = arr[index-1]; // 67, 67
                arr[index-1] = value; // 23, 67
                index--; // j=0
            }
        }
    }

    public static void SelectionSort(int[] arr) {
        
    }
}
