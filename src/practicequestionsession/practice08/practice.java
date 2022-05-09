package practicequestionsession.practice08;

import java.util.*;

public class practice {

    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Honda", 2021);
        map1.put("Toyota", 2018);
        map1.put("Porche", 2020);
        map1.put("Ferrari", 2017);
        map1.put("Mercedes", 2013);

        System.out.println(map1.keySet());
        System.out.println(map1.values());

        Set<Map.Entry<String, Integer>> set = map1.entrySet();

        for(Map.Entry<String, Integer> w : set){

            System.out.println("My make is: " + w.getKey() + " year is: " + w.getValue());
        }
    }
}
