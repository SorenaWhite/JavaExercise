package L14Exceptions;

public class ExcDemo5 {
    public static void main (String [] args) {
        int [] numer= {4, 8, 16, 32, 64, 128, 256, 512};
        int [] denom = {2, 0, 4, 4, 0, 8};

        for (int i=0; i<numer.length; i++) {
            try {
                System.out.println(numer[i] + "/" + denom[i] + " is " + numer[i]/denom[i]);
            }
            // catch multiple exceptions
            catch (ArrayIndexOutOfBoundsException exc) { // 更具体
                // catch the exception: numer.length > denom.length
                System.out.println("No matching element found.");
            }
            // ArrayIndexOutOfBounds 放在前面，不然会被 Throwable 代表，成为unreachable code
            // unreachable code is an error in Java
            catch (Throwable exc) { // 更抽象；是ArrayIndexOutOfBounds 的父类，以防万一有什么没有考虑到的
                System.out.println("Some exception occured.");
            }
            
        }
    }
}
