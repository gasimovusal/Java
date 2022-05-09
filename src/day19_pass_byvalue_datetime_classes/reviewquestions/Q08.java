package day19_pass_byvalue_datetime_classes.reviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Q08 {

    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 6};

        List<Integer> list1 = new ArrayList<>();

        for(int w : arr) {

            list1.add(w);

        }

        /*

        which one of the following does the same things with the given code snippet?

A)        List<Integer> list1 = asList(arr); FALSE asList in Arrays class

B)        List<Integer> list1 = Arrays.toList(arr); FALSE toList method does not exist

A)        List<Integer> list1 = toList(arr); FALSE toList method does not exist

A)        List<Integer> list1 = Arrays.asList(arr); TRUE

         */


    }
}
