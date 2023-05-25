package java8impl.lamda;

interface Addable{
    int add(int a, int b);
}
public class LamdaExpWithMultiExp {

    public static void main(String args[]){

        Addable addable=(a, b) -> (a+b);
        System.out.println(addable.add(2,3));

        /**Multiple params with data type*/
        Addable addable1=(int a, int b) ->  (a+b);
        System.out.println(addable1.add(100, 200));

    }
}
