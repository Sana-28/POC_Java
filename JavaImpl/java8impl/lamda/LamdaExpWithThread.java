package java8impl.lamda;

public class LamdaExpWithThread {
    public  static void main(String args[]){
        /**Thread example with lamda */
        Runnable runnable= new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 is running...");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

        /**Thread example with lamda exp */
        Runnable runnable1=()->{
            System.out.println("Thread2 is running...");
        };
        Thread thread1=new Thread(runnable1);
        thread1.start();
    }
}
