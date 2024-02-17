package L7Array;

public class ArrayDemo {
    public static void main (String [] args) throws Exception {
        //1D Array
        int [] sample = new int[10];
        for (int i=0; i<10; i++)
        {
            sample [i]=i;
        }

        for (int i=0; i<10; i++) {
            System.out.println("sample[" + i + "] = " + sample[i]);
        }

        char [] data = new char[26];
        for (int j=0; j<=25; j++) {
            data [j] = (char)('a'+j);
        }

        for (int j=0; j<=25; j++) {
            System.out.println("data[" + j + "] = " + data[j]);
        }

        // 2D Array
        int[][] table = {
            {2, 4, 7, 2, 3, 9},
            {4, 4, 71, 2, 4, 90},
            {9, 24, 7, 2, 3, 32} // 每行大小可以不一样
        };

        for (int i=0; i < table.length; i++) // i是行的下标
        {
            int total = 0;
            for (int j=0; j < table[i].length; j++) // j是列的下标. each row (a 1D array) is an object
            {
                System.out.printf("%d ", table[i][j]); // print each row
                total = total + table [i][j]; // find sum of each row
            }
            System.out.println();
            System.out.println(total);
        }

        for (int i=0; i < table[0].length; i++) // 每行都有相同的列
        {
            int total = 0;
            for (int j=0; j < table.length; j++)
            {
                total += table[j][i]; // "+="  自身的值加上后面的值
            }
            System.out.printf("%d ", total);
        }



        

    }
}
