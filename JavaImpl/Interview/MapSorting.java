package Interview;

import java.util.*;

public class MapSorting {
    public static void main(String args[]){
        Map map=new HashMap();
        map.put(1,"bob");
        map.put(2,"kia");
        map.put(3,"sid");
        map.put(4,"ansh");
        System.out.println("Size map:"+map.size());


        Iterator iterator=map.keySet().iterator();
        while (iterator.hasNext()){
            int key= (int) iterator.next();
            System.out.println("Elem:"+map.get(key));
        }
    }
}
