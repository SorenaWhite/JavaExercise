package L6Class;

public class ButtonTest
{
    public static void main (String [] args)
    {
        Button test = new Button();
        test.setColour("blue");
        test.setLabel("button");
        test.push();
        test.release();
        System.out.println(test);
    }
}
