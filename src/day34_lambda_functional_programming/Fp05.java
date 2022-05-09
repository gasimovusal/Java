package day34_lambda_functional_programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Fp05 {

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

        getMinGreaterThanSeven01(l);
        getMinGreaterThanSeven02(l);
        getMinGreaterThanSeven03(l);
    }

    // Create a method to find the minimum value which is greater than 7 and even from the list
    // more than 7, even, minvalue

    //1. way
    public static void getMinGreaterThanSeven01 (List<Integer> list){

        Integer minValue = list.stream().distinct().filter(t -> t % 2 ==0).filter(t -> t >7).reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(minValue);

    }

    //2. way
    public static void getMinGreaterThanSeven02 (List<Integer> list){

        Integer getDivSeven = list.stream().
                                   distinct().
                                   filter(t -> t >7).
                                   filter(t -> t % 2 ==0).
                                   sorted(Comparator.reverseOrder()).
                                   reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(getDivSeven);
    }

    //3. way
    public static void getMinGreaterThanSeven03 (List<Integer> list){

        Integer getDivSeven = list.stream().
                                   distinct().
                                   filter(t -> t > 7).
                                   filter(t -> t % 2 == 0).
                                   sorted().
                                   findFirst().
                                   get();
        System.out.println(getDivSeven);
    }
}
