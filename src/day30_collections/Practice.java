package day30_collections;

import java.util.*;

public class Practice {

    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(13);
        hs.add(7);
        hs.add(5);
        hs.add(3);
        hs.add(4);
        hs.add(12);
        hs.add(3);
        System.out.println("HashSet: " + hs);

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(13);
        lhs.add(7);
        lhs.add(5);
        lhs.add(3);
        lhs.add(4);
        lhs.add(12);
        lhs.add(3);
        System.out.println("LinkedHashSet: " + lhs);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(13);
        ts.add(7);
        ts.add(5);
        ts.add(3);
        ts.add(4);
        ts.add(12);
        ts.add(3);
        System.out.println("TreeSet: " + ts);


    }
}
