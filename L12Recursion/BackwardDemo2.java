package L12Recursion;
// 返回，不打印

// class 要改个名字，不然会和之前的冲突
class Backward2 {

    public String back(String in) {
        // if (in.length()==1) return in;
        // else return print(in) + print(in.substring(0, in.length()-1));

        if (in.length()==1 || in.length()==0) return in;
        else {
            String r = back(in.substring(1, in.length()));
            return r + in.substring(0, 1);
        }
    }
}

public class BackwardDemo2 {
    public static void main (String [] args) {
        Backward2 text = new Backward2();
        System.out.println(text.back("hello"));
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