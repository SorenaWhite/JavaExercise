package L10Inheritance;

class TwoDShape {
    protected double width;
    protected double height;

    void showDimensions() {
        System.out.println("Width: " + width + " height: " + height);
    }
}

class Triangle extends TwoDShape {
    String style;
    double area() {
        return width*height/2;
    }
    void showStyle() {
        System.out.println("Triangle style: "+ style);
    }
}

class Shapes {
    public static void main (String [] args) {
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle();

        t1.width=4.0;
        t1.height=4.0;
        t1.style = "filled";

        t2.width=3.0;
        t2.height=3.0;
        t2.style = "not filled";

        System.out.println("Info for triangle 1:");
        t1.showStyle();
        t1.showDimensions();
        System.out.println("Area of triangle 1 is " + t1.area());

        System.out.println();

        System.out.println("For for triangle 2:");
        t2.showStyle();
        t2.showDimensions();
        System.out.println("Area of triangle 2 is " + t2.area());
    }
}
