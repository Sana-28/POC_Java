package Multithreading;

/**Multithreading is execution of two or more processes at the same time.
 * It's a feature in java which allows concurrent execution of two or more parts of program for max utilization of CPU.
 * Each part of program called thread, it is a light-weight processes within process
 */

/**Thread creation by extending the Thread class*/
public class MultithreadingDemo extends Thread {
    public void run(){
        try {
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }catch (Exception e){
            System.out.println("Exception is caught");
        }
    }
}
