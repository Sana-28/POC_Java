package java8impl.lamda;

interface Sayable1{
    String say(String name);
}
/**Lamda expression example with single param
 * **/
public class WithLamdaExpSingleParam {
    public static void main(String[] args) {

        Sayable1 sayable=(name)->{
            return "Hello" +" "+name;
        };
        System.out.println(sayable.say("Sana"));


        /**You can omit function parenthesis*/
        Sayable1 sayable1=name->{
            return "Hello" +" "+name;
        };
        System.out.println(sayable1.say("Sana"));
    }


}
