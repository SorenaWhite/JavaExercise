package L9M_C;

class Overload {
    void fun() {
        System.out.println("fun with no parameters");
    }
    void fun(int a) {
        System.out.println("fun with one parameter "+ a);
    }
    void fun(int a, int b) {
        System.out.println("fun with two parameters "+ a + " and " + b);
    }
    double fun(double a, double b) {
        System.out.println("fun with two double parameters " + a + " and " + b);
        return a+b;
    }
}

public class OverloadDemo {
    public static void main (String [] args) {
        Overload a = new Overload();
        a.fun();
        a.fun(1);
        a.fun(1, 3);
        a.fun(1.2, 3.4);

    }
}
