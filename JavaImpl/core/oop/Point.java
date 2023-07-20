package core.oop;

/**Method overriding:
 * method name should be same with same params
 * Parent & child class return should be same*/
public class Point {
    public int draw() {
        //draws a point
        System.out.println("Draw point:");
        return 0;
    }
}
class Circle extends Point {
    public int draw() {
        //draws a circle
        System.out.println("Draw circle:");
        return 0;
    }
}