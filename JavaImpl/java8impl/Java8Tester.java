package java8impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**Class: to diffrentiate between Java 7 & 8*/
public class Java8Tester {
    public static void main(String args[]){
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("Sam");
        arrayList1.add("Tom");
        arrayList1.add("Jerry");
        arrayList1.add("Silky");

        ArrayList<String> arrayList2=new ArrayList<>();
        arrayList2.add("Sam");
        arrayList2.add("Tom");
        arrayList2.add("Jerry");
        arrayList2.add("Silky");

        Java8Tester java8Tester=new Java8Tester();
        System.out.println("Sort using JAVA 7 syntax:");
        java8Tester.sortViaJava7(arrayList1);
        System.out.println(arrayList1);

        Java8Tester java8Tester1=new Java8Tester();
        System.out.println("Sort via JAVA 8 syntax:");
        java8Tester1.sortViaJava8(arrayList2);
        System.out.println(arrayList2);
    }

    /**@method: Sorting via java7 syntax*/
    private void sortViaJava7(ArrayList<String> arrayList1) {
        Collections.sort(arrayList1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
    }

    /**@method: Sorting via java8 syntax*/
    void sortViaJava8(ArrayList<String> arrayList2){
        Collections.sort(arrayList2,((s1,s2) -> s1.compareTo(s2)));
    }
}
