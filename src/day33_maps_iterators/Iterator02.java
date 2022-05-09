package day33_maps_iterators;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

    public static void main(String[] args) {

        List<String> list1 = new LinkedList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");

        ListIterator list2Itr = list1.listIterator();

        while(list2Itr.hasNext()){

            Object el = list2Itr.next();

            System.out.print(el + " ");
        }

        System.out.println();
        while(list2Itr.hasPrevious()){

            Object el = list2Itr.previous();

            System.out.print(el + " ");
        }



    }
}
