package day34_lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp03 {

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

        printSquareOddElements(l);
        System.out.println();

        printCubeDistinctElements(l);
        System.out.println();

    }

    // Create a method to print the square of odd list elements on the console in the same line with a
    //  space between two consecutive elements.(Functional)

    public static void printSquareOddElements (List<Integer> list){

        list.stream().filter(t -> t % 2 !=0).map(t -> t * t).forEach(t -> System.out.print(t + " "));

    }

    // Create a method to print the cube of distinct (unique) odd list elements on the console in the same line
    //  with a space between two consecutive elements.
    // 1) element should be distinct - unique ; 2) should be odd ; 3) print as cube

    public static void printCubeDistinctElements (List<Integer> list){

        list.stream().distinct().filter(t -> t % 2 !=0).map(t -> t*t*t).forEach(t -> System.out.print(t + " "));
        //distinct() is getting unique elements
    }


}
