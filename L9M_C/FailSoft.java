package L9M_C;

class FailSoftArray {
    private int[] a;
    private int errval; // error value
    public int length;

    public FailSoftArray(int size, int errv) { //构造函数
        a = new int[size];
        errval = errv;
        length = size;
    }

    private boolean indexOk(int index) {
        if(index >=0 && index < length) return true;
        return false; // 把 else{} 省掉了
    }

    public int get(int index) {
        if(indexOk(index)) return a[index]; // indexOk(index) == true，进行了简化
        return errval;
    }

    public boolean put(int index, int val) {
        if(indexOk(index)) {
            a[index] = val;
            return true;
        }
        return false;
    }
}

public class FailSoft {
    public static void main (String [] args) {
        FailSoftArray fs = new FailSoftArray(5, -1);
        int x;
        System.out.println("Fail quetly.");
        for(int i=0; i < (fs.length*2); i++) {
            fs.put(i, i*10);
        }
        for(int i=0; i < (fs.length*2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.println(x + " " + i);
        }

        System.out.println("Fail with error reports");
        for(int i=0; i < (fs.length*2); i++) {
            if(!fs.put(i, i*10)) System.out.println("index " + i + " is out of range");
        }
        for(int i=0; i < (fs.length*2); i++) {
            x = fs.get(i);
            if(x != -1) System.out.println(x + " " + i);
            else System.out.println("index " + i + " is out of range");
        }
    }
}
