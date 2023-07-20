package core.object;

import java.util.Date;

public class DateTest {
    public static void main(String args[]) {
        Date date1 = new Date(); //Calling default constructor
        Date date2 = new Date(17, 4, 1995); //Calling parameterize constructor
        System.out.println("Default constructor"+date1);
        System.out.println("Parameterize constructor:"+date1);
    }
}
