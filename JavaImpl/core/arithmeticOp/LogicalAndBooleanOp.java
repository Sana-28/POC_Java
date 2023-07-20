package core.arithmeticOp;

public class LogicalAndBooleanOp {
    public static void main(String args[]){
        if(getConnection() && openFile()){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }

    private static boolean openFile() {
        System.out.println("opening file");
        return true;
    }

    private static boolean getConnection() {
        System.out.println("connecting...");
        return false;
    }
}
