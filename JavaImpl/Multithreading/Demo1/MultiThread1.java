package Multithreading.Demo1;

public class MultiThread1 {
    public static void main(String args[]){
        int n=8;
        for(int i=0;i<n;i++){
           Thread thread= new Thread(new MultithreadingDemo1());
           thread.start();
        }
    }
}
