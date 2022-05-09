package day30_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet01 {

    public static void main(String[] args) {

        /*
        List - unknown size of the elements
        Set - specific order and unique elements
        Maps - key value pairs
        Hash is technique to create unique for each data
        HashSet is a fast operation because they do not use any specific order for data
         */

        HashSet<String> hs1 = new HashSet<>();

        hs1.add("K");
        hs1.add("K");
        hs1.add(null);
        System.out.println(hs1); // output will be [null, K]

        HashSet<String> hs2 = new HashSet<>();

        hs2.add("K");
        hs2.add(null);
        System.out.println(hs1.equals(hs2)); //true, they are same (order does not matter)

        //Interview question: type a code to display arraylist elements only once

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(5);
        list.add(3);
        System.out.println(list);

        HashSet<Integer> hs3 = new HashSet<>();
        hs3.addAll(list);
        System.out.println("This is" + hs3);

        /*
        Set is Interface, HashSet is class
        you cannot create and object from Set, it will complain
        Set<String> set = new Set<>(); will complain
         */

        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("A");
        set.add(null);
        System.out.println(set);// [null, A]

    }
}
