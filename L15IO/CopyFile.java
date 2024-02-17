package L15IO;
// in terminal: "cp" + original file + new file name

import java.io.*;

public class CopyFile {
    public static void main (String [] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // First: make sure both files are specified
        if (args.length!=2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }
        
        //Copy a file
        try {
            //Attempt to open files.
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream (args[1]); //can create new while running

            do {
                i=fin.read(); //read bytes from one file
                if (i!=-1) fout.write(i); //write bytes to another
            } while (i!=-1);
        } catch (IOException exc) {
            System.out.println("I/O Error: " + exc);
        } finally {
            try {
                if (fin!=null) fin.close();
            } catch (IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if (fout!= null) fout.close();
            } catch (IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}
