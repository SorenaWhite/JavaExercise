package L12Recursion;

class Backward {
    public void print(String in) {
        // if (in.length()==1) return in;
        // else return print(in) + print(in.substring(0, in.length()-1));

        if (in.length()==1 || in.length()==0) System.out.print(in);
        else {
            print(in.substring(1, in.length()));
            System.out.print(in.charAt(0));
        }
    }
}

public class BackwardDemo {
    public static void main (String [] args) {
        Backward back = new Backward();
        back.print("");
    }
}

// hello
// olleh
/* int position is the index
 * If the index is the same as the last character of the string, return the character
 * 
 */

 /* Base case: 长度为一
  * "1 2 3 4" => "4" 直接打出来
  1 2 3 4
  2 3 4 .substring(1, length-1)
  3 4
  4
  */