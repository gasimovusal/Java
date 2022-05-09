package day34_lambda_functional_programming;

import java.util.ArrayList;
import java.util.List;

public class Fp01 {

    public static void main(String[] args) {

        /*
        Lambda is a functional programming
        Lambda functional programming was created Java 8
        functional programming focuses on "what to do"
        structured programming we focus on "how to do"
        functional programming is used just with collection and with arrays
        we cannot use Maps directly in functional programming but we can convert sets and use them
        we can use entrySet()
         */

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

        printElementsStructured(l);
        System.out.println();

        printElementsFunctional (l);
    }

    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Structured)

    public static void printElementsStructured(List<Integer> list){

        for(Integer w : list){

            System.out.print(w + " ");
        }
    }

    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)

    public static void printElementsFunctional(List<Integer> list){

        list.stream().forEach(t -> System.out.print(t + " "));
        // in stream, data stored from top to bottom
    }



}
