package Practise;
import java.lang.Math; // 在 lang package 里面，而非 util

public class Calculate {
    public static void main (String [] args) {
        double a = Math.random()*10+10;
        double b = Math.random()*10+10;
        double x = Math.abs(a-b);
        double c = Math.pow(x, 3);
        double d = Math.sqrt(c);
        System.out.printf("a is %f and b is %f, so x = %f, c = %f, and d = %f \n", a, b, x, c, d);
    }
}
