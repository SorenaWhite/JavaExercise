package L7Array;

// 2023 November 5

public class JiuGongGe {
    public static void main (String [] args) {
        int[][] jiuGongGe = {{4, 9, 2},
                            {3, 5, 7}, 
                            {8, 1, 6}};

        //行的和
        for (int i=0; i<jiuGongGe.length; i++) {
            int rowSum = 0;
            for (int j=0; j<jiuGongGe[0].length; j++) {
                System.out.printf("%d ", jiuGongGe[i][j]);
                rowSum+=jiuGongGe[i][j];
            }
            System.out.printf("\t sum of row is %d \n", rowSum);
        }
        System.out.println();


        //列的和
        for (int column=0; column<jiuGongGe[0].length; column++) {
            int columnSum=0;
            for (int row=0; row<jiuGongGe.length; row++) {
                System.out.printf("%d ", jiuGongGe[row][column]);
                columnSum+=jiuGongGe[row][column];
            }
            System.out.printf("\t sum of column is %d \n", columnSum);
        }
        System.out.println();

        //对角线的和
        /* i=0, j=jiuGongGe[0].length-1
         * i=1, j=jiuGongGe[0].length-2
         * i=2, j=jiuGongGe[0].length-3
         * i=0; i<jiuGongGe.length-1; i++  j=jiuGongGe[0].length; j>0; j--
         * 
         * i=
         */
        // for (int i=0; i<jiuGongGe.length-1; i++) {
        //     for (int j=jiuGongGe[0].length-1; j>0; j--) {
        //         System.out.printf("%d ", jiuGongGe[i][j]);
        //     }
        // }
        int diagonalSum = 0;
        int row = 0;
        int column = jiuGongGe[0].length-1;
        while ((row < jiuGongGe.length) && (column >= 0)) {
            System.out.printf("%d ", jiuGongGe[row][column]);
            diagonalSum+=jiuGongGe[row][column];
            row++;
            column--;
        }
        System.out.printf("\t sum of diagonal is %d \n", diagonalSum);



        diagonalSum = 0;
        row = 0;
        column = 0;
        while ((row < jiuGongGe.length) && (column < jiuGongGe[0].length)) {
            System.out.printf("%d ", jiuGongGe[row][column]);
            diagonalSum+=jiuGongGe[row][column];
            row++;
            column++;
        }
        System.out.printf("\t sum of diagonal is %d ", diagonalSum);
    }
}
