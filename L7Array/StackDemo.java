package L7Array;
/*参考了QueueDemo.java。
*今天写作业的时候能基本看懂QueueDemo.java里面，Queue类的代码了。
*但是一放到自己写就开始迷茫。必须得写几行过去看一眼再接着写……*/

/*
 * Stack: FILO — first in last out
 */

class Stack {
    char[] s;
    //int frontp; //电脑是怎么知道 frontp 和 tailp 分别代表最前和最后的?
    //int tailp;
    int topP; //有什么成员变量根据逻辑来定，stack只有最上面的需要，所以不需要 front 和 tail
    // topP：下一个能放新元素的位置

    Stack(int size) //这一个是去看了Queue才想起来的步骤…… //构造函数
    {
        s = new char[size];
        //frontp = tailp = 0;
        topP = 0;
    }

    /*public void push(char c)
    {
        if (tailp == s.length)
        {
            System.out.println("STACK IS FULL.");
            return;
        }
        s[tailp] = c;
        s[tailp] = s[tailp+1];
    }*/

    public void push(char c) //put value at top of the stack
    {
        if (topP == s.length)
        {
            System.out.println("STACK IS FULL.");
            return;
        }
        s[topP] = c;//q[tailp++]=c;
        //s[topP] = s[topP+1]; //这里是把上面的值赋给 s[topP]，38行就没用了
        topP++; //不需要[]——访问数组里面的值的时候才需要。只需要修改下标（增加），所以不需要[]
    }

    /*public void pop()
    {
        if (tailp == frontp)
        {
            System.out.println("STACK IS EMPTY.");
            return;
        }
        s[frontp] = s[frontp+1]; 
        //这个是先自己想了，不太确定，然后又回去看了一下 Queue 的代码。
        //诶但是 Queue 里面为什么是直接 frontp++，没有放在[]里面和s后面，但是 tailp 就有
        //哦应该是因为 tailp 有一个先等于 c 的使用步骤，然后才是增加，所以不需要？//对的没错
    }*/

    public void pop()
    {
        if (topP == 0)
        {
            System.out.println("STACK IS EMPTY.");
            return;
        }
        topP--;
    }

    /*public char top()
    {
        if (tailp == frontp)
        {
            System.out.println("STACK IS EMPTY.");
            return (0); //原来这里必须要加一个0是因为任何情况下都需要返回一个 char
        }
        return s[frontp];
    }*/

    public char top()
    {
        if (topP == 0)
        {
            System.out.print("STACK IS EMPTY.");
            return (0);
        }
        return s[topP-1];
    }

    /*public char bottom() //一般没有这个接口，用来限制访问
    {
        if (tailp == frontp)
        {
            System.out.println("STACK IS EMPTY.");
            return (0);
        }
        return s[tailp-1];
    }*/

    /*public int size()
    {
        return tailp-frontp; 
        //不过tailp不是下一个增加元素的位置吗，要先减一再减 frontp 吗？
        //大聪明，第一个是0，不是1
    }*/

    public int size()
    {
        return topP;
    }
}
public class StackDemo {
    public static void main (String [] args) {
        Stack stack = new Stack(52);
        System.out.println(stack.top());

        for (int i=0; i<26; i++)
        {
            stack.push((char) ('A'+i));
        }
        System.out.println(stack.size());

        //拿出最上面的5个，每一个拿出来，打印出来，然后扔掉
        for (int i=0; i<5; i++)
        {
            System.out.println("The current top value is: " + stack.top());
            stack.pop();
        }
        System.out.println(stack.size());
    }
}
