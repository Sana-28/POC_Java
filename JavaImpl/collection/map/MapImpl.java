package collection.map;

import java.util.LinkedHashMap;
/***NOTE:override duplicate key, duplicate values allowed***/
/**MAP is an interface in order to use map we have to extend Collection interface.
 * Each object is stored in form of key value  pair, elements can be easily accessible as every object is
 * associated with unique-key.
 * MAP & SORTEDMAP are two INTERFACE.
 * TREEMAP,LINKED HASHMAP,HASHMAP are CLASSES of MAP.
 **If we need to TRAVERSE a MAP, we need to convert it into SET because MAP cannot be TRAVERSED.After converting
 * it can be traversed using entrySet(),keySet() methods */
public class MapImpl {
    public static void main(String args[]){
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        System.out.println("Example 1:");

        linkedHashMap.put("Sam",1);
        linkedHashMap.put("Sam",null);
        linkedHashMap.put("Sam",1);

        linkedHashMap.put("Bob",null);
        linkedHashMap.put("Any",null);
        linkedHashMap.put("Joy",1);
        System.out.println("Size of linked hash map:"+linkedHashMap.size());
        System.out.println("MAP elements:"+linkedHashMap);

        if(linkedHashMap.containsKey(1)){
           String name= String.valueOf(linkedHashMap.get(1));
           System.out.println(name);
        }
        System.out.println("Example 2:");
        /*Creating an empty Linked Hash Map*/
        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();
        /*Adding data to Linked Hash Map in key-value pair*/
        students.put(101, "Aaliyah");
        students.put(101, "Taylor");
        students.put(101, "Zayn");
        students.put(104, "Zayn");
        students.put(105, "Paul");
        /*Showing size and data of the Linked Hash Map*/
        System.out.println("The size of the Linked Hash Map is:- "+ students.size());
        System.out.println(students);
        /*Checking whether a certaint key is available or not*/
        if (students.containsKey(105)) {
            String name = students.get(105);
            System.out.println("The name of the student having Id 105 is:- " + name);
        }

    }
}
