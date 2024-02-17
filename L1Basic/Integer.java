package L1Basic;
public class Integer {
    public static void main (String [] args)
    {

        int v1;
        int v2;
        v1 = 1024;
        System.out.println ("v1 contains " + v1);
        v2 = v1 / 2;
        System.out.println ("v2 contains v1 / 2: " + v2);
        if (v1%2 == 1)
        {
            v2=1;
        }
        else
        {
            v2=0;
        }
        System.out.println ("v2 is now: " + v2);



    }
    
}
