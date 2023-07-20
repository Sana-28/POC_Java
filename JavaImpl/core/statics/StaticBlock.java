package core.statics;

public class StaticBlock {
    static int[] arr =new int[5];
    StaticBlock(){
        System.out.println("Constructor");
    }
    static {
        System.out.println("Static Block");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        //StaticBlock staticBlock=new StaticBlock();
    }
}
