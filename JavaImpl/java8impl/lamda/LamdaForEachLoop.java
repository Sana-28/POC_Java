package java8impl.lamda;


import java.util.ArrayList;
import java.util.List;

public class LamdaForEachLoop {
    public  static void main(String args[]){
        List<String> list= new ArrayList<>();
        list.add("Ana");
        list.add("Elsa");
        list.add("Tom");
        list.add("Jerry");
        list.add("Bella");
        list.forEach((n)->System.out.println(n));
    }
}
