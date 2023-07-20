package core.object;

public class VarArgs {
    static void test(int ...v){
        System.out.println("Number of arguments :"+v.length +" Contains:");
        for (int x:v){
            System.out.println(x+" ");
        }
    }
    public static void main(String args[]){
        test(10);
        test(1,5,10);
        test();
    }
}
