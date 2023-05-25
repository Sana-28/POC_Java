package java8impl.lamda;

interface Sayable{
    String say();
}
public class WithLamdaExpNoParam {
    public static void main(String args[]){
        Sayable sayable=()->{
          return "I have something to say";
        };
        System.out.println(sayable.say());
    }
}
