package core.oop;

/**Method Overriding:
 * method name should be same with different params
 *  return type should be different*/
public class Shape {
    public float getArea(float radius) {
        //calculates circle area
        return (float) ((3.14)*radius*radius);
    }
    public int getArea(int length, int breadth) {
        //calculates rectangle area
        return length*breadth;
    }
    public static void main(String args[]) {
        Shape shape = new Shape();
        System.out.println("Area of Rect:" + shape.getArea(5, 2));
        System.out.println("Area of Circle:" + shape.getArea(5));
    }
}
