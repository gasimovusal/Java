package day34_lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp02 {

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

        printEvenElementStructured(l);
        System.out.println();

        printEvenElementFunctional(l);

    }

    //Create a method to print the even list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)

    public static void printEvenElementStructured (List<Integer> list) {

        for (Integer w : list) {

            if (w % 2 == 0) {

                System.out.print(w + " ");
            }

        }
    }

        //Create a method to print the even list elements on the console in the same line with a space
        //  between two consecutive elements.(Functional)

        public static void printEvenElementFunctional (List<Integer> list){

            list.stream().filter( t -> t % 2 == 0).forEach( t -> System.out.print(t + " "));
        }


}
