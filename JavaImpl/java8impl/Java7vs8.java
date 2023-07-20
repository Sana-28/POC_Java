package java8impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Java7vs8 {
    public static void main(String args[]){
        ArrayList<String > nameList7 = new ArrayList<>();
        nameList7.add("David");
        nameList7.add("Alex");
        nameList7.add("Jolly");
        nameList7.add("Sweety");

        ArrayList<String > nameList8=new ArrayList<>();
        nameList8.add("David8");
        nameList8.add("Alex8");
        nameList8.add("Jolly8");
        nameList8.add("Sweety8");

        Java7vs8 java7vs8=new Java7vs8();
        System.out.println("Sorting via java 7:");
        java7vs8.sortViaJava7(nameList7);
        System.out.println(nameList7);
        System.out.println("Sorting via java 7:");
        java7vs8.sortViaJava8(nameList8);
        System.out.println(nameList8);

    }

    private void sortViaJava7(ArrayList<String> nameList7) {
        Collections.sort(nameList7, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    /**sortUsingJava8() method uses sort function with a lambda expression
     *  as parameter to get the sorting criteria.*/
    private void sortViaJava8(ArrayList<String> nameList8) {
        Collections.sort(nameList8,((s1,s2)->s1.compareTo(s2)));
    }
}
