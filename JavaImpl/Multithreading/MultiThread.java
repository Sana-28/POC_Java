package Multithreading;

public class MultiThread {
    public static void main(String args[]){
        int n=8; //no of threads
        for(int i=0;i<n;i++){
            MultithreadingDemo multithreadingDemo=new MultithreadingDemo();
            multithreadingDemo.start();
        }
    }
}
