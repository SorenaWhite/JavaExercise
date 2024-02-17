package L15IO;

import java.io.IOException;

public class Read {
    public static void main (String [] args) throws IOException {
        int a;
        do {
            a = System.in.read();
            if (a!=-1) System.out.print(a);
        }
        while (a!=-1); // do-while loop: 条件不成立，循环结束
    }
}
// input CTRL + D in the terminal to finish
