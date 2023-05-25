package collection.differences;

import java.util.ArrayList;
import java.util.HashMap;

/**AL implements List interface, HM implements Map interface
 * AL use add method, HM uses put method
 * AL allows null values HM allows null key and values
 * AL maintains insertion order while HM does not maintain
 * AL consumes less memory as compared to HM, because AL stores the elements as values & maintains internally indexing for every element while HM stores elements with key and value pair
 * SIMILARITIES:
 * AL and HM both are non synchronized
 * AL and HM both traversed using Iterator
 * AL and HM both uses .get() method
 * */
public class ArrVsMap {
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<>();
        // Adding object in ArrayList
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        // Invoking ArrayList object
        System.out.println("ArrayList: " + list);

        HashMap<Integer,String> hm=new HashMap<>();
        // Adding object in HashMap object created above
        // using put() method
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        System.out.print("Hash Map: " + hm);
    }
}
