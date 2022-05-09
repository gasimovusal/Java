package day30_collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class LinkedHashSet01 {

    public static void main(String[] args) {

        /*
        differences between LinkedList and LinkedHashSet:
        LinkedHashSet is taking unique elements
        LinkedList is taking unique and duplicate elements
         */

        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        lhs1.add(12);
        lhs1.add(23);
        lhs1.add(10);
        lhs1.add(32);
        lhs1.add(5);
        lhs1.add(5); // it will be ignored, duplication is not allowed
        System.out.println(lhs1); // adding without order [12, 23, 10, 32, 5]

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(5);
        list.add(3);
        System.out.println(list); // [5, 3, 2, 5, 5, 3]

        //Interview question: display all arrayList elements at once on the console
        //I can use Set to get unique elements
        //I can also loop through to give unique elements
        LinkedHashSet<Integer> lh2 = new LinkedHashSet<>();
        lh2.addAll(list);
        System.out.println(lh2); // [5, 3, 2]

        /*
        How much would you rate yourself out of 10 in Java?
        I know Core Java:
        String manipulations
        Data structures ( Collections and Maps)
        OOP Concept
        Exceptions
         */

    }
}
