package L9M_C;
// 和 static 方法的对比

class CountableMS {
    private int factor = 0;

    static int count = 0;

    CountableMS(int factor) {
        this.factor = factor;
        count++;
    }

    int sum(int a, int b) {
        return a+b+factor;
    }

    double sum(double a, double b) {
        return a+b+factor;
    }

    int sum(int[] a) {
        int sum=0;
        for (int i=0; i<a.length; i++) {
            sum = sum + a[i];
        }
        return sum+factor;
    }
}

public class MSCountableDemo {
    public static void main (String [] args) {
        CountableMS a = new CountableMS(10);
        CountableMS b = new CountableMS(20);
        System.out.println(a.sum(10, 20));
        System.out.println(b.sum(10, 20));
        System.out.println(CountableMS.count);
        CountableMS c = new CountableMS(30);
        System.out.println(c.sum(10, 20));
        System.out.println(CountableMS.count);
    }
}
