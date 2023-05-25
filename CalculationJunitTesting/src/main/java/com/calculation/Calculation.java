package com.calculation;

import java.util.StringTokenizer;

public class Calculation {
    /**@method : returns maximum number*/
    public static int findMaxArray(int arr[]){//int max=0;//ArrayIndexOutOfBoundsException
        int max=arr[0];
        for(int i=1; i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

    /**@method : returns cube of number*/
    public static int findCube(int n){
        return n*n*n;
    }

    /**@method : returns reverse of a string*/
    public static String findReverseWord(String str){
        StringBuilder res=new StringBuilder();
        StringTokenizer stringTokenizer=new StringTokenizer(str,"");
        while (stringTokenizer.hasMoreTokens()){
            StringBuilder sb=new StringBuilder();
            sb.append(stringTokenizer.nextToken());
            sb.reverse();
            res.append(sb);
            res.append("");
        }
        return res.toString();
    }
}
