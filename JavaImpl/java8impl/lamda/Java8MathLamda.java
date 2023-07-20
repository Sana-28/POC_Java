package java8impl.lamda;

import java8impl.lamda.inter.MathOperation;

public class Java8MathLamda {
    public static void main(String args[]){
        Java8MathLamda java8MathLamda=new Java8MathLamda();

        /**With type declaration*/
        MathOperation subtraction= (int a, int b) -> a-b;

        /**Without type declaration*/
        MathOperation addition=(a,b) -> a+b;

        /**With return along with curly braces*/
        MathOperation multiplication=(a,b) -> {return (a*b);};

        /**Without return and curly braces*/
        MathOperation division=(a,b) ->  (a/b);

        System.out.println("10+5 ="+java8MathLamda.operate(addition,10,5));
        System.out.println("10-5 ="+java8MathLamda.operate(subtraction,10,5));
        System.out.println("10*5 ="+java8MathLamda.operate(multiplication,10,5));
        System.out.println("10/5 ="+java8MathLamda.operate(division,10,5));
    }
    private int operate(MathOperation mathOperation, int a, int b){
        return mathOperation.operation(a,b);
    }
}
