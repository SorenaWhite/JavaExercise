package L8Strings;
//坐标：index

public class Strings {
    public static void main (String [] args) {
        String str = "Hello world."; //定义字符串
        System.out.println(str); //输出字符串
        str += " This is a nice world."; //字符串的合并（合并生成了新字符串，而非在原先的上面修改）
        System.out.println(str); 
        System.out.printf("Length of string: %d \n" , str.length()); //新 str 的长度，像数组一样
        System.out.printf("Character at index 3: %c \n" , str.charAt(3)); //find 字符 at 0 坐标

        System.out.println();
        System.out.println("Reflected string: ");
        for (int i = str.length()-1; i >= 0; i--) //倒着打印字符串，因为开头坐标是0所以从-1开始
        {
            System.out.printf("%c", str.charAt(i));
        }
        System.out.println();
        System.out.println();

        //找到一个词的坐标
        System.out.printf("the index of nice: %d\n", str.indexOf("nice"));
        //自n坐标之后，一个词的坐标
        System.out.printf("the index of nice from 24: %d\n", str.indexOf("nice", 24));
        System.out.println();

        /*String target = "world"; //如果有重复的词怎么办？
        int i = 0; //从坐标0开始
        int p = str.indexOf(target, i); //从i坐标开始，“world”的坐标 —— 可以更改
        while (p != -1)
        {
            System.out.printf("%d ", p); //从0开始
            i = p + target.length(); //越过目前这个target（开始的地方+自己的长度）
            p = str.indexOf(target, i); //打印下一个target出现的位置。可以优化：和26行重复
        }*/
        //优化版本 
        String target = "world";
        int i = 0;
        System.out.print("Indices of world from left to right: ");
        while (str.indexOf(target, i) != -1)
        {
            int p = str.indexOf(target, i);
            System.out.printf("%d ", p);
            i = p + target.length();
        }
        System.out.println();
        //第35行：倒着数坐标。坐标是固定的，不会因为你倒着数就改变。可以用来验算。
        System.out.printf("First index of world from right to left: %d\n", str.lastIndexOf("world"));
        //如果倒着数也要列出全部的话，如下：
        /*System.out.printf("Last indices of world: ");
        while (str.lastIndexOf(target, i) != -1)
        {
            int p = str.lastIndexOf(target, i);
            System.out.printf("%d ", p);
            i = p - target.length();
        }
        System.out.println();*/

        System.out.println();
        System.out.println("Invoking string == target: " + str.equals(target)); //boolean: print true/false
        //str 是 invoking string。第36行：str的字符串 是否等于 target 的字符串
        str = "world"; //因为前面应该是不等于，所以改 invoking string 使其和 target ==
        System.out.println("Invoking string == target: " + str.equals("world")); //invoking string == target, 因此 true
    }
}
