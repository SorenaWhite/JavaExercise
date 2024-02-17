package Practise;

public class Alphabet {
    public static void main (String [] args) {
        String name1 = "hello";
        String name2 = "hellu";

        if (name1.compareTo(name2) < 0) System.out.println(name1 + " " + name2);
        else System.out.println(name2 + " " + name1);
    }
}
