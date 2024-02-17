package Practise;

class SomeClass
{
     int x=0; // 独属于 object
    private static int y=0; // static：独有一份，独属于 class

    public SomeClass(int pX) {
        this.x = pX;
        y++;
    }

    public void incrementY() {
        y++;
    }

    public void incrementY(int inc) {
        y+=inc;
    }

    public int getY() {
        return y;
    }
}

public class SomeClassDemo {
    public static void main (String [] args) {
        SomeClass first = new SomeClass(10);
        SomeClass second = new SomeClass(20);
        SomeClass third = new SomeClass(30);
        first.incrementY();
        second.incrementY(10);
        System.out.println(third.getY());
        System.out.println(first.getY());
    }
}