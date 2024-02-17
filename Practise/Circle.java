//15 October 2023
package Practise;

public class Circle {
    private double radius; // instance variable

    public Circle () {
        radius=0;
        count++;
    }

    public Circle(double radius) {
        this.radius = radius;
        count++;
    }

    double getRadius() {
        return radius;
    }

    double getDiameter() {
        return radius*2;
    }

    double getArea() {
        return Math.PI*Math.pow(radius, 2);
    }

    private static int count = 0; // static: 类的变量 
    
    public static int getCount() { // static: 类的方法
        return count;
    }

    void setRadius(double radius) {
        this.radius=radius;
    }

    

    // public String toString() { //toString: 让系统自己来调用函数，换名字就不行了
    //     String str;
    //     str = "The cirlce has radius " + radius + " and area " + getArea();
    //     return str;
    // }
}

class CircleDemo {
    public static void main (String [] args) {
        // Circle c1 = new Circle();
        // Circle c2 = new Circle(1.28); 
        // System.out.println(c1.getRadius());
        // System.out.println(c2.getRadius());
        // System.out.println(c1.getDiameter());
        // System.out.println(c2.getDiameter());
        // System.out.println(c1.getArea());
        // System.out.println(c2.getArea());
        // System.out.println(Circle.getCount()); // 因为是类的方法，前面需要加类的名字 circle

        // System.out.println(c2); //toString

        Circle myCircle = new Circle(100);
        int number=90;

        goAhead(myCircle, number);
        System.out.println(myCircle.getRadius()); // 修改过的对象的值
        System.out.println(number); // 对象原来的值
    }

    public static void goAhead (Circle c, int n) {
        c.setRadius(28); // 传入了地址，修改了地址对应的对象
        n=50; // 只传入了值，没有修改对象
    }
}