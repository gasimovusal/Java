package day32_maps;

import java.util.*;

public class HashMap01 {

    public static void main(String[] args) {

        /*
        Create a HashMap and give key value pairs as following;
        Math = 8
        Java = 9
        SDLC = 9
        Api  = 7
         */

        HashMap<String, Integer> hm1 = new HashMap<>();

        hm1.put("Math", 8);
        hm1.put("Java", 9);
        hm1.put("SDLC", 9);
        hm1.put("API", 7);
        System.out.println(hm1);

        Set<String> set = hm1.keySet();

        for(String w : set){

            System.out.println(w);
        }

        Collection<Integer> values = hm1.values();
        for(Integer w : values){
            System.out.println(w);
        }

        Set<Map.Entry<String, Integer>> setForm = hm1.entrySet();

        for(Map.Entry<String, Integer> w : setForm){

            System.out.println(w.getKey() + " : " + w.getValue());
        }

        /*
        when we use maps, we can just print them on the console as a amp
        when we use maps, we can use keySet to have only keys of the map
        when we use maps, we can get all values using values()
        when we want to get a specific value for map, we use get()
        when we want to have all key value entries, we use entrySet
         */

        System.out.println("All keys: " + hm1.keySet()); // returns Set
        System.out.println("All values: " + hm1.values()); // collection
        System.out.println("All keys and values: " + hm1.entrySet()); // set<Map.Entry<K, V>
        System.out.println("One value of the map: " + hm1.get("Math")); // String

        int value = hm1.replace("SDLC", 10);
        System.out.println(value);
        if(value == 9){
            System.out.println("Older value: " + value); // ??????????????
        }

        //this method will take the key and value and it will check 2 conditions, it 2 conditions are true, then it will replace the value, otherwise it will not make changes
        boolean isTrue = hm1.replace("API", 8, 10);
        System.out.println(isTrue);

        //how to remove element from map
        int value2 = hm1.remove("SDLC"); // removing SDLC
        System.out.println("value: " + value2);

        //how to remove element base on keyvalue pair

        boolean isRight = hm1.remove("Math", 8);
        System.out.println(isRight);








    }
}
