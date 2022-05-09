package day31_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice {

    public static void main(String[] args) {

        HashMap<String, Integer> idCards = new HashMap<>();
        idCards.put("Vusal", 1001);
        idCards.put("Firudin", 1002);
        idCards.put("Leman", 1003);

        idCards.put("Lamiye", 1004);
        idCards.putIfAbsent("Firudin", 200);
        System.out.println(idCards);

        Integer ssn = idCards.get("Vusal");
        System.out.println(ssn);

        Set<Map.Entry<String, Integer>> setForm = idCards.entrySet();

        for(Map.Entry<String, Integer> w : setForm){

            System.out.println(w);
        }

    }
}
