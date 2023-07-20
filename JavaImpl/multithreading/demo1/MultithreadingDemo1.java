package multithreading.demo1;

public class MultithreadingDemo1 implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running from Runnable interface");
        } catch (Exception e){
            System.out.println("Exception occured"+e);
        }
    }
}
