package practicequestionsession.practice08;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q02 {

    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Honda", 2021);
        map1.put("Toyota", 2018);
        map1.put("Porche", 2020);
        map1.put("Ferrari", 2017);
        map1.put("Mercedes", 2013);
        System.out.println(map1);

        /*Print all keys on the console
          Print all values on the console
          Print all key value pairs ==> My car is Honda and the year is 2021
         */

        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Set<Map.Entry<String, Integer>> valuePairs = map1.entrySet();

        for(Map.Entry<String, Integer> w : valuePairs){

            System.out.println("My make is " + w.getKey() + "  and year is " + w.getValue());
        }

    }
}
