import java.util.Scanner;

public class FoodWaste {
    public static void main (String [] args) {
        Scanner reader = new Scanner (System.in);
        // Convert
        System.out.println("How much food, in kilograms, do you waste each day? Please input a decimal.");
        double kilo = reader.nextDouble();
        double waste = kilo*1000;
        double quotient = waste/1816.0*3.0;
        int meal = 0;
        meal = (int) (quotient+0.5);
        System.out.println("The wasted food can be turned into more than " + meal + " meals.");
        // if ((quotient%1) < 0.5) { // 这里可以优化，直接+0.5，而不是用 if-else 判断
        //     System.out.println("The wasted food can be turned into more than " + meal + " meals.");
        // }
        // else {
        //     System.out.println("The wasted food can be turned into almost " + meal + " meals.");
        // }
        
/* 用户可以选择，如想要 calculation 输入“3”就能达到想要的效果 (用户的界面是不是足够友好，如 user interface)
 * 一般是让用户点击选择，而不是输入具体字符串
 */
        // Print: actions & calculations
        System.out.println("Please input 'action' to take actions, 'calculation' for the calculated process, and 'end' if you would not like to continue.");
        String response = reader.next();
        while (!response.equals("end") || !response.equals("End")) {
            if (response.equals("action") || response.equals("Action")) {
                System.out.println();
                System.out.println("Below are the steps you may take.");
                System.out.println("1. Understand that every bit of food wasted has devastating implications.");
                System.out.println("2. Eat fewer snacks before mealtime, so you are ready to consume your food when mealtime arrives.");
                System.out.println("3. Only line up to take food that you are 100%  sure of eating. Come back for more if needed.");
                System.out.println("4. Actively tell the Chartwells staff when you think you already have enough of one dish.");
                System.out.println("5. Try turning wasted food into compost for the plants.");
                System.out.println();
                System.out.println();
            }
            else if (response.equals("calculation") || response.equals("Calculation")) {
                System.out.println("Here are the steps of calculating the inputted kilograms of wasted food into the number of wasted meals.");
                System.out.println("1) According to the MyPlate website of the US Department of Agriculture, we consume about 1816 grams of food per day.");
                System.out.println("2) The inputted number is then first multiplied by 1000 to change is units to grams.");
                System.out.println("3) Then, it is divided by 1816 to show how many days it may be converted to.");
                System.out.println("4) Since there are three meals per day, the quotient is multiplied by 3");
                System.out.println("5) The product is rounded to its nearest integer, and printed out to output the number of meals wasted.");
                System.out.println();
            }
            else if (response.equals("End") || response.equals("end")) {
                reader.close();
                System.out.println("Thank you.");
                return;
            }
            else System.out.println("Please input again: ");
            System.out.println("Please input 'action' to take actions, 'calculation' for the calculated process, and 'end' if you would not like to continue.");
            response=reader.next();
        }


        reader.close();
    }
}