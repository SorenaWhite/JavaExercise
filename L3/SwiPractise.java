package L3;

public class SwiPractise {
    public static void main (String [] args) throws java.io.IOException
    {
        char grade = (char) System.in.read();
        System.out.println("Your grade is " + grade);
        switch(grade)
        {
            case 'A' :
                System.out.println("Excellent");
                break;
            case 'B' :
            case 'C' :
                System.out.println("Well done");
                break;
            default :
                System.out.println("Invaid grade");
        }
    }
}
