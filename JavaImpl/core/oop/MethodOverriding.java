package core.oop;

class MethodOverridingPoint{
    int draw(){
        return 0;
    }
    public static void main(){
        MethodOverridingPoint methodOverridingPoint[]=new MethodOverridingPoint[3];
        methodOverridingPoint[0] =new MethodOverridingPoint();
        methodOverridingPoint[1] =new CircleMo();
        methodOverridingPoint[2] =new CylinderMo();
        for (int i=0;i<methodOverridingPoint.length;i++){
            Object area = methodOverridingPoint[i];
            System.out.println("Area:"+ area);
        }
    }
}
class CircleMo extends MethodOverridingPoint{

}
class CylinderMo extends  MethodOverridingPoint{

}
