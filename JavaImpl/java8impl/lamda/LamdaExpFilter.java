package java8impl.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LamdaExpFilter {
    public static void main(String args[]){
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "HP", 25000));
        list.add(new Product(2, "Lenovo", 30000));
        list.add(new Product(3, "Apple", 55000));
        list.add(new Product(4,"Keyboard",300f));
        list.add(new Product(1,"Samsung A5",17000f));
        list.add(new Product(3,"Iphone 6S",65000f));
        list.add(new Product(2,"Sony Xperia",25000f));
        list.add(new Product(4,"Nokia Lumia",15000f));
        list.add(new Product(5,"Redmi4 ",26000f));
        list.add(new Product(6,"Lenevo Vibe",19000f));

        Stream<Product> filterData= list.stream().filter(p-> p.price > 20000);
        System.out.println(filterData.toArray().length);
        /*filterData.forEach(
                product -> System.out.println(product.name+": "+product.price)
        );*/
    }
}
