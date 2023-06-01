package collection.list.nonsync;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**Implements list
* Duplicates allowed
* Maintain insertion order
* non synchronised
* Elements can be accessible sequentially
* Faster as compared to arraylist
* Consumes more memory as compared to linkedList
* Manipulation is faster compared  to Arraylist
 */
public class LinkedListImpl {
    public static List<String> linkedList=new LinkedList<String>();

    public static void  main(String args[]){
        linkedList.add("Tom");
        linkedList.add("Tom");
        linkedList.add("Tom");
        linkedList.add("Joy");
        linkedList.add("Any");
        linkedList.add("Grey");
        linkedList.add("Mack");
        Iterator<String> iterable=  linkedList.iterator();
        System.out.println(iterable.hasNext());
        while (iterable.hasNext()){
            System.out.println("Elements"+":"+ iterable.next());
        }



    }
}
