package core.arithmeticOp;

public class DayOfWeekIfAndSwitchLoop {
    public static void main(String args[]){
        int dayOfWeek= Integer.parseInt("0");

        /**Via el-if ladder*/
        System.out.println("Via el-if ladder");
        if (dayOfWeek == 0)
            System.out.println("Sunday");
        else if (dayOfWeek == 1)
            System.out.println("Monday");
        else if (dayOfWeek == 2)
            System.out.println("Tuesday");
        else if (dayOfWeek == 3)
            System.out.println("Wednesday");
        else if (dayOfWeek == 4)
            System.out.println("Thursday");
        else if (dayOfWeek == 5)
            System.out.println("Friday");
        else if (dayOfWeek == 6)
            System.out.println("Saturday");

        /**Via switch case without break*/
        System.out.println("Via switch case without break");
        switch (dayOfWeek){
            case 0:System.out.println("Sunday");
            case 1: System.out.println("Monday");
            case 2: System.out.println ("Tuesday");
            case 3: System.out.println ("Wednesday");
            case 4: System.out.println ("Thursday");
            case 5: System.out.println ("Friday");
            case 6: System.out.println ("Saturday");
            default:System.out.println("ERROR!");
        }

        /**Via switch case with break*/
        System.out.println("Via switch case with break");
        switch (dayOfWeek){
            case 0:System.out.println("Sunday");break;
            case 1: System.out.println("Monday");break;
            case 2: System.out.println ("Tuesday");break;
            case 3: System.out.println ("Wednesday");break;
            case 4: System.out.println ("Thursday");break;
            case 5: System.out.println ("Friday");break;
            case 6: System.out.println ("Saturday");break;
            default:System.out.println("ERROR!");break;
        }
    }
}
