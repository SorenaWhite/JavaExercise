package L11Arraylist;
import java.util.ArrayList;

public class Twitter {
    public static void main (String [] args) {
        ArrayList<String> longWords = new ArrayList<String>();
        longWords.add("today");
        longWords.add("is");
        longWords.add(" a  ");
        longWords.add("1");
        
        for (String e: longWords) System.out.printf("%s+", e);
        System.out.println();

        ArrayList<String> onlyLong = new ArrayList<String>();
        onlyLong = removeStopWords(longWords);
        for (String e: onlyLong) System.out.printf("%s+", e);
    }

    public static ArrayList<String> removeStopWords (ArrayList<String> arr) {
        ArrayList<String> arr2 = new ArrayList<String>();
        for (String e: arr) if (e.length() >3) arr2.add(e);
        return arr2;
    }
}
