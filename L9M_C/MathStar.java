package L9M_C;

class MS {
    static int sum(int a, int b) {
        return a+b;
    }

    static double sum(double a, double b) {
        return a+b;
    }

    static int sum(int[] a) {
        int sum=0;
        for (int i=0; i<a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

}

public class MathStar {
    public static void main (String [] args) {
        System.out.println(MS.sum(100, 20));
        System.out.println(MS.sum(20.09, 45.23));
        int[] a = {23, 45, 65, 21};
        System.out.println(MS.sum(a));
        // 用大MS因为三个方法都是static的，不依赖于对象，直接用类调用，就像 String.valueOf()
    }
}
