package L15IO;

import java.io.*;

public class ShowFile {
    public static void main (String [] args) {
        int i;
        FileInputStream fin;

        // 1: make sure file has been specified
        if (args.length!=1) {
            System.out.println("Usage: ShowFile File");
            return;
        }

        try {
            fin = new FileInputStream(args[0]); //open the file
        } catch (FileNotFoundException exc) {
            System.out.println("File Not Found" + exc);
            return;
        }

        try {
            // read byte until EOF is encountered
            do {
                i=fin.read(); //read from the file
                if (i!=-1) System.out.print((char) i);
            } while (i!=-1);
        } catch (IOException exc) {
            System.out.println("Error reading file.");
        }

        try {
            fin.close(); //close the file
        } catch (IOException exc) {
            System.out.println("Error closing file.");
        }
    }
}
