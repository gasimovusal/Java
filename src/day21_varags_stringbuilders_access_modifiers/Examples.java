package day21_varags_stringbuilders_access_modifiers;

import java.util.ArrayList;
import java.util.Collections;

public class Examples {

    public static void main(String[] args) {

        //find the smallest positive integer and greatest negative integer in a given integer list

        ArrayList<Integer> list = new ArrayList<>();
        list.add(-12);
        list.add(18);
        list.add(-5);
        list.add(23);
        list.add(-2);
        System.out.println(list); // [-12, 18, -5, 23, -2]

        //1. do sorting
        Collections.sort(list); // [-12, -5, -2, 18, 23]

        //2. select minimum positive list.get(list.size()-1
        int minPositive = list.get(list.size()-1); //==> 23

        //3. select mac negative list.get(0)
        int maxNegative = list.get(0); // ==> -12

        //4. create loop work with positives, work with negatives
        for(Integer w : list){ // [-12, -5, -2, 18, 23]

            if(w>=0){

                minPositive = Math.min(minPositive, w);  // this will compare minPositive value with w and if minPositive is minimum
                                                         // 18 is min positive, 23 is not max positive compare to 18
            }
            if(w<0){
                maxNegative = Math.max(maxNegative, w); // -12 is max negative, -5 is max negative now, -2 is max negative now

            }
        }
        System.out.println(minPositive); // 18
        System.out.println(maxNegative); // -2


    }
}
