package core.wrapper;

public class Utility {
    public static void main(String args[]){
        /*Convert string into integer primitive.*/
        int x = Integer.parseInt("25");
        System.out.println(x);

        /*➢ Convert string into integer object.*/
        Integer obj = Integer.valueOf("25");
        System.out.println(obj);

        /*➢ Finding greater number*/
        int maxNo = Integer.max(12, 25); //25
        System.out.println(maxNo);

        /*➢ Finding smaller number.*/
        int minNo = Integer.min(12, 25); //12
        System.out.println(minNo);
    }
}
