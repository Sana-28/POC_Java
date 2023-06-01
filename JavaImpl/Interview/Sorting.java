package Interview;

import java.util.ArrayList;
import java.util.List;

/**Sort array without sort method*/
public class Sorting {
    public static int arr[]={10,9,8,7,6,5,4,3,2,1};
    public static  void main(String args[]){

        for(int i=0; i < arr.length; i++){
            System.out.println("Before sorting:"+arr[i]);

            for(int j=i+1; j< arr.length;j++ ){
                int temp=0;
                if(arr[i] > arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=arr[i];
                }
            }
        }
        for(int i=0;i< arr.length; i++){
            System.out.println("Sorted list:"+arr[i]);
        }
    }
}
