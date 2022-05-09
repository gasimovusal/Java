package day31_maps;

import java.util.*;

public class HashMap01 {

    /*
    Maps use key-value pairs structure
    Keys should be unique but values can be duplicate
    In maps, keys cannot be Null except in HashMap
    In HashMaps, you can use Null only once for keys but you can have multiple Nulls for values
    HashMap does not create elements in natural order thats why it is fast
    HashMap is not thread-safe, it is not synchronized
    When we use Maps, if we give key, it will always return the value
     */

    public static void main(String[] args) {

        HashMap<Integer, String> hm1 = new HashMap();
        hm1.put(100, "Ali");
        hm1.put(101, "Veli");
        hm1.put(102, "Aliye");
        hm1.put(103, "Veliye");
        hm1.put(null, "Mary");
        hm1.put(null, "Kemal");
        hm1.put(104, null);
        hm1.put(105, null);
        hm1.put(106, "");
        System.out.println(hm1);

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(87, "X");
        hm2.put(88, "K");
        hm2.put(89, "L");
        hm1.putAll(hm2); // puting all elements of hm2 to hm1
        System.out.println(hm1);
        //when we merge elements of a Map to another, we have to use same data types

        hm1.putIfAbsent(102, "Z"); // if you dont 102 key, create 102 wtih new value, if you have 102, ignore it
        hm1.putIfAbsent(110, "Vusal");

        String value = hm1.get(101);
        String value1 = hm1.get(121); // null
        System.out.println(value);
        System.out.println(value1); // null

        String value2 = hm1.getOrDefault(999, "Key does not exists"); // creating custom message if key does not exist
        System.out.println(value2);

        Set<Integer> myKeys = hm1.keySet(); // keySet method returns a Set for all keys, Set is used for unique keys
        System.out.println("Keys:     " + myKeys);

        Collection<String> myValues = hm1.values(); // will return collection for all values, you can store unique and duplicate values in Collection
        System.out.println("My values: "+ myValues);
        //collection is super-parent of Set, its an interface, and it can have duplicate values





    }
}
