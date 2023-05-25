package collection.list.nonsync;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/*Implements list
* maintain insertion order
* contains duplicate
* non synchronised
* Elements can be accessible randomly
* Slow as compared to linkedList
* Consumes less memory as compared to Linkedlist
* Manipulation is bit slower than LinkedList
*/
public class ArrayListImpl{

    //public static List<String>  list = (List<String>) new ArrayList<String>();
    public static void main(String args[]){
        List<String> list = new ArrayList<>();
        list.add("abc");
        list.add("xyz");
        list.add("123");
        list.add(String.valueOf(456));
        System.out.println("Priniting out element.");
        for(String str : list)
            System.out.println(str);
    }
    //Collections.synchronizedList();
}
