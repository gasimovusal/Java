package day19_pass_byvalue_datetime_classes.reviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Q07 {

    public static void main(String[] args) {

        int arr[] = {3, 4, 5, 6};

        List<Integer> list1 = new ArrayList<>();

        for(int w : arr) { // {3, 4, 5, 6} element will be in w

            list1.add(w); // 3, 4, 5, 6

        }

        System.out.println(list1.get(2)); // 5 ==> second index

    }
}
