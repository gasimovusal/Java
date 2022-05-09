package day34_lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class practice {

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

        newList(l);

        getMax(l);
        getMax01(l);
        getGreater7(l);

    }

    public static void newList (List<Integer> list){

        list.stream().distinct().filter(t -> t%2!=0).map(t -> t*t*t).forEach(t -> System.out.println(t + " "));
    }

    // Create a method to find the maximum value from the list elements

    public static void getMax (List<Integer> list){

        Integer maxValues = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t>u ? t :u);
        System.out.println(maxValues);
    }

    public static void getMax01 (List<Integer> list){

        Integer maxValue = list.stream().distinct().sorted().reduce(Integer.MAX_VALUE, (t, u) -> u);
        System.out.println(maxValue);
    }

    //Create a method to find the minimum value which is greater than 7 and even from the list
    public static void getGreater7 (List <Integer> list){

        Integer getMinValue = list.stream().distinct().filter(t -> t>7).filter(t -> t % 2 ==0).reduce(Integer.MAX_VALUE, (t, u) -> t>u ? u : t);
        System.out.println(getMinValue);
    }
}
