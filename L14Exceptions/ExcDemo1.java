package L14Exceptions;
// from Herbert book

public class ExcDemo1 {
    public static void main (String [] args) {
        int[] nums = new int [4];
        try {
            System.out.println("Before exception is generated.");
            nums[7] = 10; // Generate an index out-of-bounds exception.
            System.out.println("This won't be displayed."); // not displayed
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            // catch the exception
            // 类型指定
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement.");
    }
}