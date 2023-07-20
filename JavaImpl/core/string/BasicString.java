package core.string;
/**String is FINAL,IMMUTABLE(object once created cannot be changed)*/
public class BasicString {
    public static void main(String args[]){
        char[] ch={'s','a','n','a'};
        System.out.println(ch);
        String str=new String(ch);
        System.out.println(str);
        String str1="sana";
        System.out.println(str1);

    }
}
