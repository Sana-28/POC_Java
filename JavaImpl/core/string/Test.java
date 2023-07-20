package core.string;

import java.util.Arrays;
import java.util.Collections;

public class Test {

    public static void  main(String args[]){
     String s="i a boy";
     String str[]=s.split(" ");
     Collections.sort(Arrays.asList(str));
     System.out.println(String.join(" ", str));
    }
}
