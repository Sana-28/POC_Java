package org.example;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RevLinkedList {
    public static String previous= null;
    public static String next=  null;
    public static Node;


    public static void main(String args[]){
        List<Integer> list= new LinkedList<>();
        list.add(3);
        list.add(7);
        list.add(9);
        list.add(8);
        list.add(6);
        list.add(5);
        list.add(10);
        list.add(20);
        list.add(25);
        list.add(35);
        Iterator<Integer> iterator= list.iterator();
        while (iterator.hasNext()){
            System.out.println("List elements:"+iterator.next());
        }
        //Reversal of elements
        Collections.sort(list);
        System.out.println(list);

    }
}
