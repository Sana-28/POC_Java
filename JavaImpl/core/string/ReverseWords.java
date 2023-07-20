package core.string;

import java.util.Arrays;
import java.util.Collections;

/**Problem Statement:
 * Input: s = “i like this program very much”
 * Output: s = “much very program this like i”
 * Time complexity: O(N2)*/
public class ReverseWords {
    public static void main(String args[]) {
        String s = "i like this program very much";
        String str[]= s.split(" ");
        Collections.reverse(Arrays.asList(str));
        System.out.println(s);
        System.out.println(String.join(" ", str));
    }
}
