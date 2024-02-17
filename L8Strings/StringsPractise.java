package L8Strings;
import java.util.Scanner;
// 2023-01-19课堂练习

public class StringsPractise {
    public static void main (String [] args) {
        Scanner reader = new Scanner(System.in);

        //make a copy of a string: make a new string with the same value as the original one
        String s1 = "this is the original string";
        String s2 = s1; // 这样不算一个新的字符串
        s2 = new String(s1); //这样才算形成新的字符串
        System.out.println(s2 == s1); //应该输出 false


        //remove the first and last character of a string
        String s3 = reader.next();
        int end = s3.length();
        System.out.println(s3.substring(1, end-1)); // [ )


        //把字符串前面和后面的空格删掉， 如“ abc ef ” 变成 "abc ef"
        String s4 = " acd ef ";
        System.out.println(s4.trim());

        //check if a given string is empty — 这个经常和 trim() 组合在一起使用
        System.out.println("Type: ");
        String s5 = reader.nextLine();
        s5 = s5.trim();
        System.out.println(s5.isEmpty());


        //get the last n characters of a string
        String s6 = reader.nextLine();
        int n = reader.nextInt();
        System.out.println(s6.substring(s6.length()-n));


        //capitalise the first letter of the string
        //version 1
        String s7 = reader.next();
        char c = s7.charAt(0);
        if (c >= 'a' && c <= 'z') {
            System.out.println((char) (c-'a'+'A'));
        }
        else System.out.println("No need to capitalise");
        
        //version 2
        String s8 = reader.next();
        String first = s8.substring(0, 1);
        System.out.println(first.toUpperCase());

        //version 3
        String s9 = reader.next();
        char a = s9.charAt(0);
        System.out.println(String.valueOf(a).toUpperCase()); //valueOf：各种类型转换成字符串


        //split a string into words
        String s10 = reader.nextLine();
        String [] split = s10.split(" "); //参数是用来作为分割的字符，如这里用空格来分割
        for (String word : split) System.out.println(word);

        //join the elements in an array — 和split是相反的操作，经常一起用，先摘开变成数组，再转换成一个特殊的字符串
        System.out.println(String.join("-", split)); //参数：连接，数组
        
        /*valueOf 和 join 是 String 这个类的方法，而 split 是 String 生成的对象的方法
        * 所以它们不是一个层级的
        * 生成类的方法前面加 static，不受对象影响，用类来调用
        */


        //convert string to int
        String s11 = "1000";
        int convert = Integer.parseInt(s11, 2); //参数：字符串，几进制。按照这个进制读取
        System.out.println(convert+1); //以十进制的形式打印

        reader.close();
    }
}
