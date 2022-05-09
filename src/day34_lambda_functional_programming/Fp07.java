package day34_lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp07 {

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

        sumOfTheSquares(l);
        productOfCubes(l);
    }

    //Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfTheSquares (List<Integer> list){

        Integer sum = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.println(sum);
    }

    // Create a method to calculate the product of the cubes of distinct even elements

    public static void productOfCubes (List<Integer> list){

        Integer sumCubes = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t*u);
                                                                    // if you type 0 instead of 1, your answer always will be 0 because anything multiplied by 0 gives 0
        System.out.println(sumCubes);
    }

}
