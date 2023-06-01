package collection.map.nonsync;

import java.util.*;

/**HASHMAP is non synchronised
 * */
public class HashMapImpl {
    public static void main(String args[]){

        HashMap<Integer,String> hm=new HashMap<>();
        // Adding object in HashMap object created above
        // using put() method
        hm.put(1, "A");
        hm.put(2, "B");
        hm.put(3, "C");
        hm.put(4, "D");
        System.out.print("Hash Map: " + hm);
        for (Map.Entry m: hm.entrySet()) {
            System.out.print("HM for loop: " + m.getKey()+"---"+m.getValue());
        }
        Set set= hm.entrySet();
        Iterator iterator=set.iterator();
        while (iterator.hasNext()){
            Map.Entry entry= (Map.Entry) iterator.next();
            System.out.print("HM while loop: " + entry.getKey()+"---"+entry.getValue());
        }
    }
}
