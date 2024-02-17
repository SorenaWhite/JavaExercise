package L6Class;
/* Try This 5-3
 * page 180
 * A class that displays the binary representation of a value
 */

// low-order bits 是什么

class ShowBits {
    int numbits; 
    
    ShowBits(int n) { //几位
        numbits=n; 
    }

    void show(long val) { //long 是64-bit signed integer
        long mask = 1; //mask 的 initialisation
        
        // left-shift a 1 into the proper position — 这个 left-shift 是要把1移到哪里……？
        mask <<= numbits-1; // << 左移, >>> 右移

        int spacer = 0; //spacer 的 initialisation — spacer: 空格，视觉上更好看数字
        for(; mask != 0; mask >>>= 1) { // 这里前面打;是因为 mask 已经初始化了
            if ((val & mask) != 0) 
            {
                System.out.print("1");//&：并且，需要同时满足
            } 
            else
            { 
                System.out.print("0");
            }
            
            spacer++; //spacer = spacer+1;
            if ((spacer % 8) == 0) { // 每隔8位加一个空格
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}

//Demo
class ShowBitsDemo {
    public static void main (String [] args) {
        ShowBits b = new ShowBits(8); //有8位
        ShowBits i = new ShowBits(32); //有32位
        ShowBits li = new ShowBits(64); //有64位

        System.out.println("123 in binary: ");
        b.show(123);

        System.out.println("\n87987 in binary: ");
        i.show(87987);

        System.out.println("\n237658768 in binary: ");
        li.show(237658768);

        // you can also show low-order bits of any integer
        System.out.println("\nLow order 8 bits of 87987 in binary: ");
        b.show(87987);
    }
}

// 打印出来的数字为什么会自动换行……因为你用的是 println，而书上用的是 print ：）