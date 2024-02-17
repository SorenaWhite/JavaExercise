package L15IO;

import java.io.*;

public class CopyFileBetter {
    public static void main (String [] args) throws IOException {
        int i;

        //First: ensure both files are specified
        if (args.length!=2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        //Open + manage two files with try statement => no need to write close => shorter
        try (FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1])) 
            {
                do {
                    i = fin.read();
                    if(i!=-1) fout.write(i);
                } while (i!=-1);
            } catch (IOException exc) {
                System.out.println("I/O Error: "+ exc);
            }
    }
}
