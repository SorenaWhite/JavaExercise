package L6Class;

public class Button {
    private String label;
    private String colour;
    public void setColour(String colour)
    {
        this.colour=colour;
    }
    public void setLabel(String label)
    {
        this.label=label;
    }
    public void push()
    {
        System.out.println("push");
    }
    public void release()
    {
        System.out.println("release");
    }
    public String toString()
    {
        return "Button is " + "coloured " + colour + " and is labelled " + label; 
    }
}


