package L12Recursion;
// 从.substring(0, 最后一个)到 .substring(0, 倒数第二个)
// 1 2 3 4
// 1 2 3 => 先打印4
// 1 2 
// 1

// class 要改个名字，不然会和之前的冲突
class Backward3 {
    public String back(String in) {
        if (in.length()==1 || in.length()==0) return in;
        else {
            String r = back(in.substring(0, in.length()-1));
            // -1: 取倒数第二个，并非最后一个
            return in.substring(in.length()-1, in.length()) + r;
        }
    }
}

public class BackwardDemo3 {
    public static void main (String [] args) {
        Backward3 text = new Backward3();
        System.out.println(text.back("hello"));
    }
}

/* 1. 先打印
 * 2. 再 return
 * 用桥梁
 */