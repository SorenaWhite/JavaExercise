package L6Class;

public class Year
{
    int year;

    public boolean isLeap() 
    {
        return (year%4==0 && year%100==0 || year%400==0);
    }

    public String toString()
    {
        if (isLeap())
        {
            return year + " is a leap year.";
        }
        else
        {
            return year + " is not a leap year.";
        }
    }
}