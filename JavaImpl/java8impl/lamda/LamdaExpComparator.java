package java8impl.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class  Product{
    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class LamdaExpComparator {
    public static void main(String args[]) {
        List<Product> list = new ArrayList<Product>();
        list.add(new Product(1, "HP", 25000));
        list.add(new Product(2, "Lenovo", 30000));
        list.add(new Product(3, "Apple", 55000));
        list.add(new Product(4,"Keyboard",300f));

        System.out.println("Sorting on the basis of name...");
        Collections.sort(list,(p1,p2)->{
            return p1.name.compareTo(p2.name);
        });
        for (Product p:list) {
            System.out.println(p.name);
        }
    }
}
