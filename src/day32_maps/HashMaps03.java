package day32_maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps03 {

    public static void main(String[] args) {

        /*
Create a MAP that will have following keys and values
Math = 9
English = 8
Biology = 7
History = 6
French = 7
Then print all lessons and their scores that are more than 7
 */

        HashMap<String, Integer> hm1 = new HashMap<>();

        hm1.put("Math", 9);
        hm1.put("English", 8);
        hm1.put("Biology", 7);
        hm1.put("History", 6);
        hm1.put("French", 7);

        System.out.println(hm1.containsKey("Math"));

        Set<String> myKeys = hm1.keySet();
        System.out.println(myKeys.size());

        Collection<Integer> myValues = hm1.values();
        System.out.println(myValues.size());

//        int c = 0;

//        for(Integer w : myValues){
//            if(w>7){
//                System.out.println("Values is : " + w);
//            }
//            c++;
//        }

        Set<Map.Entry<String, Integer>> set = hm1.entrySet();

        for(Map.Entry<String, Integer> w : set){
            if (w.getValue()>7){
                System.out.println(w);
            }
        }
    }
}
