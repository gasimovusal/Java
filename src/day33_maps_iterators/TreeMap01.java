package day33_maps_iterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

    public static void main(String[] args) {

        HashMap<String,Integer> tm1 = new HashMap<>();

        tm1.put("Ali", 3000);
        tm1.put("Tom", 500);
        tm1.put("Alexandra", 12000);
        tm1.put("Mark", 500);
        tm1.put("Walker", null);
        tm1.put("Talker", null);
        tm1.put("Angelina", 23000);

        TreeMap<String, Integer> tm2 = new TreeMap<>(tm1);
        System.out.println(tm2);


    }
}
