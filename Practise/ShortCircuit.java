package Practise;

public class ShortCircuit {
    public static void main (String [] args) {
        int count =0;
        int total = 0;
        boolean result = (count!=0 && total/count > 0);
        System.out.println(result);
    }
}
