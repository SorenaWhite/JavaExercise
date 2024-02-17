package L2If_For;


//import java.util.Scanner;

public class Guess {
    public static void main (String [] args) throws java.io.IOException
    {
        char a;
        char b = 'O';
        System.out.println ("Please guess character: ");
        a = (char) System.in.read();
        if (a == b)
        {
            System.out.println ("Well done!");
        }
        else
        {
            if (a < b)
            {
                System.out.println ("Plese guess a greater letter: ");
            }
            else
            {
                System.out.println ("Please guess a smaller letter: ");
            }
        }



        //Scanner reader = new Scanner (System.in);
        //a = reader.next().charAt(0);
        
        //reader.close();
    }
}
