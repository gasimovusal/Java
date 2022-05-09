package day18_arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {

    public static void main(String[] args) {

        //INTERVIEW QUESTION
        //Find the closest 2 integers in the given list [12, 15, 10, 21]

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(10);
        list.add(11);
        System.out.println(list);

        //if you want to use list element, use the following code:
        Collections.sort(list); // [10, 12, 15, 21]
        System.out.println(list);

        int minDiff = Integer.MAX_VALUE; // if you want to work with minimum value, make initial value maximum

        //if you need to use consecutive indexes in a loop, make the starting value 1 and use "i-1" and "i" as indexes
        //if you use starting value as 0 and indexes "i+1" and "i", you will get error.
        for(int i=1; i< list.size(); i++){

            minDiff = Math.min(minDiff, list.get(i) - list.get(i-1)); // min will select the smallest one between 2 values, it will compare with 1000
            //                  1000             12 - 10 = 2      it will compare 1000 with 2 and select smallest one ==> minDiff=2
            //                   2               15 - 12 = 3      min function will compare 2 and 3 and will select smallest one

        if(list.get(i) - list.get(i-1) == minDiff) {
            //        12 - 10            == 2
            // if difference does not equal to 2, it will not print

            System.out.println(list.get(i) + " and " + list.get(i - 1));
            //                          12     and      10
        }



            }
        }



    }

