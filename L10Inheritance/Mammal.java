package L10Inheritance;

public class Mammal {
    private boolean vertebrate;
    private boolean milkProducer;
    protected String hairColour;

    public Mammal() {
        vertebrate=true;
        milkProducer=true;
    }

    public Mammal(String colour) {
        vertebrate=true;
        milkProducer=true;
        hairColour=colour;
    }

    public void dyeTo (String colour) {
        hairColour=colour;
    }

    public String getColour() {
        return hairColour; 
    } 

    public boolean isVerte() {
        return vertebrate;
    }
    public boolean isMP() {
        return milkProducer;
    }
}

class Dog extends Mammal {
    private String name;
    public Dog() {
        super();
    }
    public Dog(String hairColour, String name) {
        super(hairColour);
        this.name=name;
    }
    public void changeName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void dyeTo(String colour) {
        super.hairColour = "dog: " + colour; 
    }

    public static void main (String [] args) {
        Dog d1 = new Dog();
        System.out.println(d1.getName());
        System.out.println(d1.getColour());
        d1.dyeTo("black");
        System.out.println(d1.getColour());
        System.out.println(d1.isVerte());
        System.out.println(d1.isMP());
        System.out.println();

        Dog d2 = new Dog("Brown", "Belle");
        System.out.println(d2.getName());
        System.out.println(d2.getColour());
        System.out.println(d2.isVerte());
        System.out.println(d2.isMP());
    }
}