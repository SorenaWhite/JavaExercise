package L8Strings;

public class StringsCompare {
    public static void main (String [] args) {
        String s1 = "1234";
        String s2 = "2345";
        s1 = "abc";
        s2 = "ABC";
        int compare = s1.compareTo(s2);
        int noCase = s1.compareToIgnoreCase(s2);
        System.out.println(compare + " " + noCase);

        s1 = "abcdefg";
        s2 = "efg";
        Boolean end = s1.endsWith(s2);
        System.out.println(end);

        s1 = "123456";
        String sub = s1.substring(2, 5); //遵循半闭半开的 [  )
        System.out.println(sub);
    }
}
