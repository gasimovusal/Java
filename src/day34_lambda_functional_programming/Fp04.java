package day34_lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp04 {

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

        getMaxElement01(l);
        getMaxElement02(l);

    }

    // Create a method to find the maximum value from the list elements
    // 1. way

    public static void getMaxElement01 (List<Integer> list){

        Integer maxValue = list.stream().distinct().reduce(Integer.MIN_VALUE,(t, u) -> t > u ? t : u);
        System.out.println(maxValue);
        // t -> 0, u -> 8 ; t -> 8 ; t -> 9 ; t -> 9 ; t -> 131; .....
        // t > u ? t : u ==> is t is bigger than u keep t ; if t is not bigger than u, take u
        // reduce method ==> sum, avg, max, min
    }

    // 2. way

    public static void getMaxElement02 (List<Integer> list){

        Integer maxValue = list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u) -> u);
        System.out.println(maxValue);
    // u always will be the bigger one, because we sorted
    // t -> -2b, u -> 2 ;  t -> -2, u -> 8 ;  t -> -28, u -> 9 ;  t -> 9, u -> 10 ;  t -> 10, u -> 15 ; t -> 15, u -> 131 ; u -> 131 is last element
    }

}
