package L14Exceptions;
// Herbert pg. 345

public class NestTrys {
    // different categories of errors to be handled in different ways
    public static void main (String [] args) {
        int [] numer= {4, 8, 16, 32, 64, 128, 256, 512};
        int [] denom = {2, 0, 4, 4, 0, 8};



        try {
            for (int i=0; i<numer.length; i++) {
                try { // nested try
                    System.out.println(numer[i] + "/" + denom[i] + " is " + numer[i]/denom[i]);
                }
                // catch multiple exceptions
                catch (ArithmeticException exc) {
                    System.out.println("Cannot divide by zero!");
                }
            }  
        }
        // 放在 for 循环外面：只要一次不行，就结束了
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching element found.");
            System.out.println("Fatal error — program terminated.");
        }
    }
}
