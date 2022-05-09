package day31_maps;

import java.util.*;

public class HashMap02 {

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

        Set<Map.Entry<Integer, String>> setForm = hm1.entrySet(); // use this code if you need both values and keys ; splitting all the keys and values into peaces

        for(Map.Entry<Integer, String> each: setForm){ // putting setForm to each ; using inner data type, which is Map.Entry<Integer, String> ; splitting set into Integer(key) and String(value)

            System.out.println(each); // this gives a whole key value pair

        }for(Map.Entry<Integer, String> each: setForm){ // you can also type the code, completely separating keys and values

            System.out.print(each.getKey() + " : " + each.getValue()); //this gives key and value separately
        }

        List <List<String>> allList = new ArrayList<>();

        for(List<String> w: allList){

            System.out.println(w);
        }


    }
}
