package L6Class;



class YearTest {
    public static void main (String [] args)
    {
        Year testYear = new Year();
        testYear.year=2000;
        System.out.println(testYear.isLeap());
        System.out.println(testYear.toString());
    }
}