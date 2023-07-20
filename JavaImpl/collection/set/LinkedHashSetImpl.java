package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;
/**SET: Java.util package provides the Set interface
 *  Set is implemented by extending the collection interface
 * DOES NOT ALLOW DUPLICATE elements & DOES NOT maintain INSERTION order
 * Internal working of SET:
 * * */
public class LinkedHashSetImpl {
    public static void main(String args[]){
        /*LinkedHashSet impl. via Set*/
        Set<String> marvel_movies=new LinkedHashSet<String>();
        marvel_movies.add("Captain Marvel");
        marvel_movies.add("Captain Marvel");

        marvel_movies.add("Thor: Ragnarok");
        marvel_movies.add("Captain America: The Winter Soldier");
        marvel_movies.add("Ant-Man and the Wasp");
        marvel_movies.remove("Thor: Ragnarok");
        System.out.println("Set size:"+marvel_movies.size());
        System.out.println("Movies:"+marvel_movies);
    }
}
