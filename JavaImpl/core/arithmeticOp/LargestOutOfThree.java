package core.arithmeticOp;

public class LargestOutOfThree {
    public static void main(String args[]){
        int a=10;int b=30;int c=5;
        if(a>b && a>c){
            System.out.println("A is largest");
        } else if (b>a && b>c) {
            System.out.println("B is largest");
        } else {
            System.out.println("C is largest");
        }
    }
}
