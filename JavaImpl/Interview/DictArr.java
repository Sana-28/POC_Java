package Interview;

import java.util.*;

/**I/P Dictionary: ["apple","bear","cat","car","jeep"]
 * INPUT: applebear
 * OUTPUT: apple, bear
 * */

public class DictArr {

    //["apple","bear","cat","car","jeep"]
    public static void main(String[] args) {
        Dictionary<String, Integer> dict = new Hashtable<>();
        dict.put("apple", 1);
        dict.put("bear", 2);
        dict.put("cat", 3);
        dict.put("car", 4);
        dict.put("jeep", 5);

        System.out.println("Enter the input: ");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.next();
        System.out.println("Input:" + userInput);
        //System.out.println("Input type:"+userInput.getClass().getSimpleName());

        Enumeration<String> enumeration = dict.keys();
        while (enumeration.hasMoreElements()) {
            String key = enumeration.nextElement();
            /*System.out.println("key type:"+key.getClass().getSimpleName());
            System.out.println("key:" + key.length() + ", vals:" + dict.get(key));
            System.out.println(dict.get(key).equals(userInput));*/
            if (userInput.length() != 0) {
                if (userInput.contains(key)) {
                    int resp= callStringCompare(userInput, key);
                    System.out.println("OUTPUT: "+key);
                }
            }
        }
    }

    private static int callStringCompare(String userInput, String key) {
        //System.out.println("ELEMENTS:" + userInput.contains(key));
        int sl1=userInput.length();
        int sl2=key.length();
        int lmin = Math.min(sl1,sl2);
        System.out.println("lmin:"+lmin);
        for (int i = 0; i < lmin; i++) {
            int str1 = userInput.charAt(i);
            int str2 = key.charAt(i);
            //System.out.println("str1:"+str1+" str2:"+str2);

            if (str1 != str1) {
                return str1 - str2;
            }
        }
        if(sl1 !=sl2){
            return sl1-sl2;
        } else {
            return 0;
        }
    }
}
