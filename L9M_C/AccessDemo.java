package L9M_C;

class MyClass {
    private int alpha; //private data member
    public int beta; //public data member
    int gama; //没说 = public

    //methods to access alpha
    void setAlpha(int a) {
        alpha = a;
    }
    int getAlpha() {
        return alpha;
    }
}

public class AccessDemo {
    public static void main (String[] args) {
        MyClass ob = new MyClass();
        ob.setAlpha(-9);
        System.out.println("ob.alpha is: " + ob.getAlpha());

        //ob.alpha = -9
        ob.beta = 88;
        ob.gama = 109; //24-25行可以访问是因为 beta 和 gama 是 public的，而 alpha 作为 private 的成员，不能在这里访问
    }
}
