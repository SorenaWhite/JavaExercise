package Practise;

public class Students {
    public static void main (String [] args) {
        //创建数组
        int[] scores = {96, 98, 95, 5, 65, 48, 89, 10, 58, 90, 94, 92, 99, 92, 95, 91, 94, 97, 97};
        String[] name = new String[19];
        for (int i=0; i<name.length; i++) {
            name[i] = "T" + i;
        }

        //绑定成绩和人名
        for (int i=0; i<name.length; i++) {
            System.out.println(name[i] + ": " + scores[i]);
        }

        //求最高成绩
        int c = 0;
        for (int i=0; i<name.length; i++) {
            if (scores[i] > c) c=scores[i];
        }
        System.out.println("Highest grade: " + c);

        //求成绩平均数
        double s = 0;
        for (int i=0; i<scores.length; i++) s=s+scores[i];
        double mean = s/scores.length;
        System.out.println("Mean grade: " + mean);

        //打印学生名字 Enhanced for loop
        for (String e: name) System.out.print(e + " ");
        System.out.println();

        //Duplicate scores[]
        int[] scores2 = new int[scores.length];
        for (int i=0; i<scores.length; i++) scores2[i]=scores[i];
        for (int e: scores2) System.out.printf("%d ", e);
    }
}
