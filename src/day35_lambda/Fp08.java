package day35_lambda;

import java.util.ArrayList;
import java.util.List;

public class Fp08 {

    public static void main(String[] args) {

        /*
        In functional programming we use lambda expression, but when we use method reference, lamba expression will not be recommended
        When we use method reference, we have "class name :: method name"
        be careful about parenthesis () ->
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

        printElementsFunctional(l);
        System.out.println();
        printEvenElementsFunctional(l);
        System.out.println();
        getNumMoreThan8(l);
        System.out.println();
        printSquareOfOddElements(l);
        System.out.println();
        printCubeOfElement(l);
    }

    //Create a method to print the list elements on the console in the same line with a space
        public static void printElementsFunctional (List<Integer> list){

                   //before we were typing t -> t + " "
            list.stream().forEach(Utils :: printInSameLine);
        }


    //Create a method to print the even list elements on the console in the same line with a space

    public static void printEvenElementsFunctional(List<Integer> list){
        list.stream().filter(Utils :: checkIfEven).
                forEach(Utils :: printInSameLine);
        //instead of typing     t -> t % 2 ==0           t -> System.out.print(t + " ")
    }

    //create method that prints number more than 8 in the console
    public static void getNumMoreThan8 (List<Integer> list){ // it does not make sense to create another method in utility

        list.stream().filter(Utils :: checkIfMoreThan8).
                forEach(Utils :: printInSameLine);
    }

    //create method to print square of add list elements on the concole in same line with space

    public static void printSquareOfOddElements (List<Integer> list){

        list.stream().filter(Utils :: checkToBeOdd).
                map(Utils :: getSquare).
                forEach(Utils :: printInSameLine);
    }

    //4)Create a method to print the cube of distinct odd list elements on the console in the same line
    //  with a space between two consecutive elements.

    public static void printCubeOfElement(List<Integer> list){

        list.stream().distinct().
                filter(Utils :: checkToBeOdd).
                map(Utils ::getCube).
                forEach(Utils :: printInSameLine);
    }


}
