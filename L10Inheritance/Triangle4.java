package L10Inheritance;

class TwoDShape4 {
    private double width;
    private double height;

    TwoDShape4() {
        width = height = 0.0;
    }

    TwoDShape4(double x) {
        width=height=x;
    }

    TwoDShape4(double w, double h) {
        width = w;
        height = h;
    }

    void showDimensions() {
        System.out.println("Width: " + width + " height: " + height);
    }

    void setHeight(double height) {
        this.height=height;
    }
    void setWidth(double width) {
        this.width=width;
    }

    double getWidth() {
        return width;
    }
    double getHeight() {
        return height;
    }
}

class Triangle4 extends TwoDShape4 {
    String style;

    Triangle4() {
        super(); // superclass 的构造函数，永远写在最开始
        style = "None";
    }

    Triangle4(double x) {
        super(x);
        style = "filled";
    }

    Triangle4(String s, double w, double h) {
        super(w,h);
        style = s;
    }

    double area() {
        return getHeight() * getWidth() /2;
    }

    void showStyle() {
        System.out.println("Triangle style: " + style);
    }
}

class Shapes4 {
    public static void main (String [] args) {
        Triangle4 t1 = new Triangle4("filled", 4.0, 4.0);
        Triangle4 t2 = new Triangle4(12.0);
        Triangle4 t3 = new Triangle4();

        System.out.println("Information for triangle 1: ");
        t1.showStyle();
        t1.showDimensions();
        System.out.println("Area is " + t1.area());

        System.out.println();
        
        System.out.println("Information for triangle 2: ");
        t2.showStyle();
        t2.showDimensions();
        System.out.println("Area is " + t2.area());

        System.out.println();
        
        System.out.println("Information for triangle 3: ");
        t3.showStyle();
        t3.showDimensions();
        System.out.println("Area is " + t3.area());
    }
}