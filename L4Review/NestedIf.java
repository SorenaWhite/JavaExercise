package L4Review;
import java.util.Scanner;


public class NestedIf {
    public static void main (String [] args)
    {
        Scanner reader = new Scanner (System.in);
        System.out.println ("What is your filing status?");
        System.out.println ("0: single; 1: married jointly or qualified widow(er); 2: married separately; 3: head of household");
        int status = reader.nextInt();
        System.out.println ("What is your taxable income?");
        int income = reader.nextInt();
        double total;
        switch (status)
        {
            case 0:
                if (income <= 8350)
                {
                    total = 0.1*income;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 33950)
                {
                    double fifteen = (income-8350)*0.15;
                    total = 8350*0.1 + fifteen;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 82250)
                {
                    double twentyFive = (income-33950)*0.25;
                    total = 8350*0.1 + 33950*0.15 + twentyFive;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 171550)
                {
                    double twentyEight = (income-82250)*0.28;
                    total = 8350*0.1 + 33950*0.15 + 82250*0.25 + twentyEight;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 372950)
                {
                    double thirtyThree = (income-171550)*0.33;
                    total = 8350*0.1 + 33950*0.15 + 82250*0.25 + 171550*0.28 + thirtyThree;
                    System.out.println ("Your personal income tax is " + total);
                }
                else
                {
                    double thirtyFive = (income-372950)*0.35;
                    total = 8350*0.1 + 33950*0.15 + 82250*0.25 + 171550*0.28 + 372950*0.33 + thirtyFive;
                    System.out.println ("Your personal income tax is " + total);
                }
                break;
            case 1:
                if (income <= 16700)
                {
                    total = income*0.1; 
                    System.out.println ("Your personal income tax is " + total);
                } 
                else if (income <= 67900)
                {
                    double fifteen = (income-16700)*0.15;
                    total = 16700*0.1 + fifteen;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 137050)
                {
                    double twentyFive = (income - 67900)*0.25;
                    total = 16700*0.1 + 67900*0.15 + twentyFive;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 208850)
                {
                    double twentyEight = (income - 137050)*0.28;
                    total = 16700*0.1 + 67900*0.15 + 137050*0.25 + twentyEight;
                    System.out.println("Your personal income tax is " + total);
                }
                else if (income <= 372950)
                {
                    double thirtyThree = (income - 208850)*0.33;
                    total = 16700*0.1 + 67900*0.15 + 137050*0.25 + 208850*0.28 + thirtyThree;
                    System.out.println("Your personal income tax is " + total);
                }
                else
                {
                    double thirtyFive = (income-372950)*0.35;
                    total = 16700*0.1 + 67900*0.15 + 137050*0.25 + 208850*0.28 + 372950*0.33 + thirtyFive;
                    System.out.println ("Your personal income tax is " + total);
                }
                break;
            case 2:
                if (income <= 8350)
                {
                    total = 0.1*income;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 33950)
                {
                    double fifteen = (income-8350)*0.15;
                    total = 8350*0.1 + fifteen;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 68525)
                {
                    double twentyFive = (income-33950)*0.25;
                    total = 8350*0.1 + 33950*0.15 + twentyFive;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 104425)
                {
                    double twentyEight = (income-68525)*0.28;
                    total = 8350*0.1 + 33950*0.15 + 68525*0.25 + twentyEight;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 186475)
                {
                    double thirtyThree = (income-104425)*0.33;
                    total = 8350*0.1 + 33950*0.15 + 68525*0.25 + 104425*0.28 + thirtyThree;
                    System.out.println ("Your personal income tax is " + total);
                }
                else
                {
                    double thirtyFive = (income-186475)*0.35;
                    total = 8350*0.1 + 33950*0.15 + 68525*0.25 + 104425*0.28 + 186475*0.33 + thirtyFive;
                    System.out.println ("Your personal income tax is " + total);
                }
                break;
            case 3:
                if (income <= 11950)
                {
                    total = 0.1*income;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 45500)
                {
                    double fifteen = 0.15*(income-11950);
                    total = 0.1*11950 + fifteen;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 117450)
                {
                    double twentyFive = 0.25*(income-45500);
                    total = 0.1*11950 + 0.15*45500 + twentyFive;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 190200)
                {
                    double twentyEight = 0.28*(income-117450);
                    total = 0.1*11950 + 0.15*45500 + 0.25*117450 + twentyEight;
                    System.out.println ("Your personal income tax is " + total);
                }
                else if (income <= 372950)
                {
                    double thirtyThree = 0.33*(income-190200);
                    total = 0.1*11950 + 0.15*45500 + 0.25*117450 + 0.28*190200 + thirtyThree;
                    System.out.println ("Your personal income tax is " + total);
                }
                else
                {
                    double thirtyFive = 0.35*(income-372950);
                    total = 0.1*11950 + 0.15*45500 + 0.25*117450 + 0.28*190200 + 0.33*372950 + thirtyFive;
                    System.out.println ("Your personal income tax is " + total);
                }
                break;
        }
        reader.close();
    }
}
