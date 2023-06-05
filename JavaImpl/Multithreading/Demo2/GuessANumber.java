package Multithreading.Demo2;

public class GuessANumber extends  Thread{
    int number;
    public  GuessANumber(int number){
        this.number=number;
    }
    public void run(){
        int counter=0;
        int guess=0;
       do {
           double v = Math.random() * 100 + 1;
           guess= (int) v;
           System.out.println(this.getName() + " guesses " + guess);
           counter++;
       } while (guess!=number);{
            System.out.println("** Correct!" + this.getName() + "in" + counter + "guesses.**");

        }
    }
}
