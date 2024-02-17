package L9M_C;
// FIFO: first in first out
// Header: get out of the queue
// Tail: add more element

class Queue {
    private char [] q; //队列q里面是字符
    private int frontp; //the current position of element in front of the queue
    private int tailp; //next position for new element

    Queue(int size) {
        q = new char[size]; //创建新的队列
        frontp = tailp = 0; //队列里面现在是空的，没有元素
    }

    Queue() {
        frontp = tailp = 0;
        q = new char[255];
    }

    Queue(int size, char first) {
        q = new char[size];
        q[frontp] = first;
        tailp = 1;
    }

    public void push(char c) { //放入新的元素
        if(tailp == q.length) {
            System.out.println("--Queue is full--");
            return;
        }
        q[tailp++]=c; //先使用，后增加 q[tailp] = c;    tailp++;
    }

    public char front() { //找到最前面的元素
        if(frontp == tailp) {
            System.out.println("Queue is empty"); //就像前胸贴后背的肚子一样 => 空的
            return (char) 0;
        }
        return q[frontp];
    }
    
    public void pop() { //推掉最前面的元素
        if(frontp == tailp) {
            System.out.println("Queue is empty");
            return;
        }
        frontp++;
    }

    public int size() { //找到queue的length
        return tailp - frontp;
        //不需要-1，因为开头第一个就是0，不是1
    }

    public char back() { //找到最后面的元素
        if (frontp == tailp) {
            System.out.println("Queue is empty");
            return (char) 0;
        }
        return q[tailp-1];
    }
}

class QueueDemo {
    public static void main (String [] args) throws Exception{
        Queue newq = new Queue();

        char ch;
        int i;

        System.out.println("store newq");
        for (i=0; i<26; i++) {
            newq.push((char) ('A'+i));
        }

        for (i=0; i<newq.size(); i++) {
            ch = newq.front();
            newq.pop();
            if(ch != (char) 0) {
                System.out.printf("%c ", ch);
            }
        }


        Queue trial = new Queue(26, 'a');
        for (i=1; i<26; i++) {
            trial.push((char) ('a'+i));
        }

        // for (i=0; i<trial.size(); i++) {
        //     char front = trial.front();

        // }



        // Queue bigQ = new Queue(100);

        // char ch;
        // int i;

        // System.out.println("using bigQ to store the alphabet.");
        // for (i=0; i<26; i++) {
        //     bigQ.push((char) ('A'+i)); //将A到Z的字母存到 bigQ 队列内
        // }

        // System.out.println("Contents of bigQ: " + bigQ.size());
        // for (i = 0; i < 50; i++) {
        //     ch = bigQ.front();
        //     bigQ.pop();
        //     if(ch != (char) 0) { //0用来判断是否为有效字符
        //         System.out.printf("%c ", ch);
        //     }
        // }
        // System.out.println("\n");
    }
}

/*应用：银行业务
    平均十秒钟处理一个
    客户随机，从1到20
    队列最多能排多少人？
    模拟：一开始队列很多很多人，每次新增加一个客户
    持续一个小时，看一下当前size是多少，然后打擂台
*/