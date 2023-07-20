package core.string;

public class StringMethods {
    public static void main(String args[]){
        String str="sana ";
        String str1="shaikh";
        String str3=new String("sana");
        String str4="its raining today";
        System.out.println("Length method:"+str.length());
        System.out.println("Concat method:"+str.concat(str1));
        System.out.println("Compare method:"+str.compareTo(str3));
        System.out.println("ToString method:"+str4.toString());
        System.out.println("To lower case method:"+str4.toLowerCase());
        System.out.println("To upper case method:"+str.toUpperCase());
        System.out.println("To char array method:"+str.toCharArray()); //doubtfull
        System.out.println("Replace method:"+str.replace("a", "z"));
        System.out.println("Split method:"+str4.split(" "));
        System.out.println("Trim method:"+str.trim());

    }
}
