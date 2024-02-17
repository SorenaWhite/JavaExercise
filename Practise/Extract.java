package Practise;

public class Extract {
    public static void main (String [] args) {
        String motto = "May the force be with you";
        int originalSpace = motto.indexOf(" ");
        int firstSpace = motto.indexOf(" ", originalSpace+9);
        int secondSpace = motto.indexOf(" ", firstSpace+8);
        String word = motto.substring(firstSpace + 1, secondSpace+4);
        System.out.println(word);
    }
}
