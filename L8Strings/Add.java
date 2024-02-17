package L8Strings;

public class Add {
    public static void main (String [] args) {
        if (args.length < 2) {
            System.out.println("Please give a value for b");
            return;
        }
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.println(a+b);

        /* 两种运行方法
         * 第一种
         * 1. Click "run"
         * 2. Click "up" key
         * 3. 在terminal 输入 a 和 b 的值
         * 
         * 第二种，在 terminal 
         * 进入文件夹："cd" + 文件夹名称
         * 1. 输入 "javac " + 文件夹名称 + "/" + 程序名字.java
         * 2. 输入 “ls ” + 程序名字.class (看一眼当前文件夹中有什么)
         * 3. 输入 "java " + 文件夹名称 + “/” + 程序名字 + a 和 b 的值
         * 推出文件夹："cd .." (退到上一级目录)
         * 查找当前位置/目录层级：输入"pwd"
         */

         /* Terminal
         ls：查找目录里面的文件
         wc：查找一个文件里有多少行和多少个字符
         ls | wc：查找一个目录里有多少个文件
         mkdir：创建文件夹
         rmdir：删除文件夹
          */
    }
}
