package Practise;
import java.util.GregorianCalendar;

class MyDate {
    private int year;
    private int month=0;
    private int day;
    private int hour;
    private int minute;
    private int seconds;

    MyDate(){
        GregorianCalendar now = new GregorianCalendar();
        year = now.get(GregorianCalendar.YEAR);
        month = now.get(GregorianCalendar.MONTH);
        day = now.get(GregorianCalendar.DAY_OF_MONTH);
    }
    MyDate(int year, int month, int day) {
        this.year=year;
        this.month=month-1;
        this.day=day;
    }

    int getYear() {
        return year;
    }
    int getMonth() {
        return month+1;
    }
    int getDay() {
        return day;
    }
    int getHour() {
        return hour;
    }
    int getMinute() {
        return minute;
    }
    int getSeconds() {
        return seconds;
    }

    void setDate(long timePass) {
        GregorianCalendar now = new GregorianCalendar();
        now.setTimeInMillis(timePass);
        year = now.get(GregorianCalendar.YEAR);
        month = now.get(GregorianCalendar.MONTH);
        day = now.get(GregorianCalendar.DAY_OF_MONTH);
        hour = now.get(GregorianCalendar.HOUR);
        minute = now.get(GregorianCalendar.MINUTE);
        seconds = now.get(GregorianCalendar.SECOND);
    }
}

public class MyDateDemo {
    public static void main (String [] args) {
        MyDate today = new MyDate(2023, 3, 5);
        System.out.println("Today is " + today.getYear() + " " + today.getMonth() + " " + today.getDay());

        GregorianCalendar now = new GregorianCalendar();
        long nowMil = now.getTimeInMillis();
        System.out.println(nowMil);

        MyDate me = new MyDate();
        System.out.println(me.getYear() + " " + me.getMonth() + " " + me.getDay());
        me.setDate(57600000);
        System.out.println(me.getYear() + " " + me.getMonth() + " " + me.getDay());
        me.setDate(0);
        System.out.println(me.getYear() + " " + me.getMonth() + " " + me.getDay() + " " + me.getHour() + " " + me.getMinute() + " " + me.getSeconds());
    }
}
