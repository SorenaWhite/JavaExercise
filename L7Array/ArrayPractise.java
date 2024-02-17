package L7Array;
// throws Exception 的作用是什么

public class ArrayPractise {
    public static void main (String [] args)
    {
        String[] strings = new String[100];
        for (int i=0; i<100; i++)
        {
            strings [i] = ""; //这里要是在“”里面再打双引号，系统就会报错……
        }
        
        int[] prime = {2, 3, 5, 7, 11, 13};

        String[] authors = {"Games Gosling", "Bill Joy", "Guy Steele"};

        //know length
        System.out.println(strings.length);
        System.out.println(prime.length);
        System.out.println(authors.length);
    }
}
