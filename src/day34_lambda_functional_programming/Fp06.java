package day34_lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp06 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<>();
        l.add(8);
        l.add(9);
        l.add(131);
        l.add(10);
        l.add(9);
        l.add(10);
        l.add(2);
        l.add(8);
        l.add(15);

        getHalfOfDistinctElementsInReversedOrder(l);

    }

    // Create a method to find the half of the elements which are distinct and greater than 5 in reverse order in the list.
    //distinct, half of the element, greater than 5, reverse, list

    public static void getHalfOfDistinctElementsInReversedOrder(List<Integer> list){

        List <Double> newList = list.stream().
                                    distinct().
                                    filter(t -> t > 5).
                                    map(t -> t / 2.0).
                                    sorted(Comparator.reverseOrder()).
                                    collect(Collectors.toList());
        System.out.println(newList);
    }
}
