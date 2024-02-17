package L10Inheritance;

class AA{
    int i,j;
    AA(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i and j are " + i + " " + j);
    }
}

class BB extends AA {
    int k;
    BB(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show() { // 如果第9行前面有 final，就不能 override，这里就会报错
        System.out.println("k = " + k);
    }
    // BB(int b, int a, int c) {
    //     super(b, a);
    //     k=c;
    // }
    // 关心：哪个位置是哪个类型，不能重复
}

class CC extends AA {
    int d;
    CC(int f, int a, int b) {
        super(a, b);
        d=f;
    }
    void show() {
        System.out.println("d is " + d);
    }
}

public class Override {
    public static void main (String [] args) {
        BB subB = new BB(1, 2, 3);
        subB.show();
        AA a = subB;
        a.show();

        CC subC = new CC(10, 0, 5);
        subC.show();
        a = subC;
        a.show(); // dynamic when running: 实时根据调用的对象而调整
    }
}
