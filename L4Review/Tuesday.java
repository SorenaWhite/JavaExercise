package L4Review;

public class Tuesday {
    public static void main (String [] args)
    {
        int i = 4;
        i = (i +101%7)%7;
        System.out.println(i);
        switch (i)
        {
            case 0:
            System.out.println("Monday");
            break;
            case 1:
            System.out.println("Tuesday");
            break;
            case 2:
            System.out.println("Wednesday");
            break;
            case 3:
            System.out.println("Thursday");
            break;
            case 4:
            System.out.println("Friday");
            break;
            case 5:
            System.out.println("Saturday");
            break;
            case 6:
            System.out.println("Sunday");
            break;
        }

        System.out.println(25.0/4);
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);
        System.out.println(1.0-0.5);
    }
}
