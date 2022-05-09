package day33_maps_iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Iterator03 {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Ali");
        set.add("Veli");
        set.add("Ayse");

        Iterator iter = set.iterator();

        while (iter.hasNext()){
            iter.next();
            iter.remove(); // removing all
        }
        System.out.println(set);




    }
}
