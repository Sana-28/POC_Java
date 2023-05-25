package collection.list.sync;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashtableImpl {
    public static Hashtable<Integer,String> hashtable=new Hashtable<>();

    public static void main(String args[]){
        hashtable.put(1,"tom");
        hashtable.put(1,"tom");
        hashtable.put(1,"tom");
        hashtable.put(2,"jerry");
        hashtable.put(2,"jerry");

        Set<Integer> set= hashtable.keySet();
        Iterator<Integer> iterator= set.iterator();
        while (iterator.hasNext()){
            System.out.println("HT key--"+iterator.next());
            Integer key=iterator.next();
            System.out.println("HT key with val--"+hashtable.get(key));

        }

    }
}
