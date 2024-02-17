package L8Strings;

public class StringBuilderTest {
    static public void main (String [] args) {
        // //constructor variable without parameter：一共有16个
        // StringBuilder str1 = new StringBuilder();
        // System.out.println("capaity: " + str1.capacity());

        // //容量构造函数：一共有64个
        // StringBuilder str2 = new StringBuilder(64);
        // System.out.println("capacity: " + str2.capacity());

        // //CharSequence
        // StringBuilder str3 = new StringBuilder("this is a char sequence");
        // System.out.println("capacity: " + str3.capacity());
        // System.out.println(str3);

        //参数为字符串
        String str = new String("0123456789");
        StringBuilder str4 = new StringBuilder(str);
        System.out.printf("str4 is: %s\n", str4.toString());

        str4.setCharAt(0, 'A'); //将下标为0的字符替换为 A
        System.out.printf("str4 is: %s\n", str4.toString()); // 打印 str4
        str4.append("\nthis is another string").append("\nOK");
        System.out.printf("after appending, str4 is: %s\n", str4.toString());
        str4.delete(0, 5); // [ )
        System.out.printf("after deleting, str4 is: %s\n", str4.toString());
        String sub = str4.substring(0, 9); // [ )
        System.out.printf("substr: %s\n", sub);
    }
}
