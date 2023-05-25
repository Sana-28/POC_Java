package java8impl.lamda;

/**LAMDA: Its new feature implemented in Java 8.
 * It is very useful in collection framework,it helps to retrieve, filter, iterate data from the collection.
 * It is used to provide the implementation of "Functional interface".
 *
 * USAGE:
 * To provide the implementation of "Functional interface" & Less coding
 *
 * SYNTAX:
 * (argument list) -> {body}
 * */

@FunctionalInterface
interface Drawable1{
    void draw();
}

/**(with empty argument list lamda exp.)
 * A lambda expression can have zero or any number of arguments
 * */
public class WithLamdaExp {
    public static void main(String args[]){
        int width=10;
        Drawable1 drawable=() ->{
            System.out.println("Width:"+ width);
        };
        drawable.draw();
    }
}
