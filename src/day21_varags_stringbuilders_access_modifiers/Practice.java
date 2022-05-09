package day21_varags_stringbuilders_access_modifiers;

import java.util.ArrayList;
import java.util.Collections;

public class Practice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(3);
        list.add(544);
        list.add(-2);
        list.add(-5);
        list.add(235);
        list.add(-12135);

        Collections.sort(list);

        int maxPositive = list.get(list.size()-1);
        int minNegatife = list.get(0);

        for(Integer w : list){

            if(w>=0){
                maxPositive = Math.max(maxPositive, w);
            }
            if(w<0){
                minNegatife = Math.min(minNegatife, w);
            }
        }
        System.out.println(minNegatife);
        System.out.println(maxPositive);

    }

}
