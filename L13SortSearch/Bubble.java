package L13SortSearch;

public class Bubble {
    public static void main (String [] args) {
        int[] test = {1, 7, 6, 5, 4, 8};
    
        for (int i=1; i<test.length; i++) { // why 1
            for (int j=0; j<test.length-i; j++) {
                if (test[j] > test[j+1]) {
                    int c = test[j];
                    test[j] = test[j+1];
                    test[j+1] = c;
                }
            }
        }

        for (int a : test) {
            System.out.printf("%d ", a);
        }
    }
}
