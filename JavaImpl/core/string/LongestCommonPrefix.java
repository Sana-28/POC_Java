package core.string;

public class LongestCommonPrefix {
    public static void main(String args[]){
        String[] input = {"geeksforgeeks", "geeks", "geek", "geezer"};
        longestCommonPrefix(input);
    }

    static String longestCommonPrefix(String[] input) {
        int n=input.length;
        // take temp_prefix string and assign first element of arr : a.
        String result= input[0];
        // take temp_prefix string and assign first element of arr : a.
        for(int i=1;i<n;i++){
            // .indexOf() return index of that substring from string.
            while (input[i].indexOf(result) != 0){
                // update matched substring prefix
                result=result.substring(0, result.length()-1);
                if(result.isEmpty()){
                    return "-1";
                }
            }
        }
        return result;
    }
}
