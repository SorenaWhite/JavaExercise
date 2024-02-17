package L10Inheritance;

abstract class A {
    int i;
    int e;
    abstract int equal();
}

class B extends A {
    int i;

    B(int a, int b) {
        super.i=a;
        i=b;
    }
    B() {
        super();
    }
    void show() {
        System.out.println("i in superclass A: " + super.i);
        System.out.println("i in subclass B: " + i);
    }
    int equal() {
        return i;
    } // 必须实现 abstract
}

class C extends B {
    int e;
    
    C(int a, int b) {
        super.e=a;
        e=b;
    }

    C() {
        super();
    }
    void show() {
        System.out.println("i in supersuperclass A: " + super.e);
        System.out.println("i in subclass C: " + e);
    }
}

public class Super {
    public static void main (String [] args) {
        B subB = new B(1, 2);
        subB.show();

        C subC = new C(3, 4);
        subC.show();
    }
}
