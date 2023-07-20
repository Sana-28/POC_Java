package core.oop;

import java.util.Date;

public class DateTime extends Date {
    private int hours;
    private int minutes;
    private int seconds;
    public DateTime(int day, int month, int year, int hours, int minutes, int seconds){
        super(day, month, year); //Calling super class constructor
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public String toString() {
        return super.toString() + " " + hours +":"+ minutes + ":" + seconds;
//Calling super class method
    }
    public static void main(String args[]){
        DateTime dateTime=new DateTime(1,1,1999,2,30,30);
        System.out.println(dateTime);
    }
//    System.gc(); //explore
}
