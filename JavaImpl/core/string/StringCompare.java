package core.string;
public class StringCompare {
    public static void main(String args[]){
        String s1="Hello";
        String s2="Hello";
        String s3=new String("Hello");
        if(s1.equals(s2)){
            System.out.println("O/p1:"+s1.equals(s2));
        }
        if(s1 == s3){
            System.out.println("O/p2: s1 & s3");
        }
        if(s1.equals(s3)){
            System.out.println("O/p3: s1 & s3");
        }

    }
}
