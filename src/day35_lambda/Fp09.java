package day35_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp09 {

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

        getElementsOnSeparatelINE(l);
        getElementsWithStar(l);
        printCubeOfDistinctElements(l);
        System.out.println();
        sumOfSquareOfDistinctElements(l);
        System.out.println();
        productOfCubes(l);
        System.out.println();
        getMax(l);
        getMinGreater7(l);
        getHalfOfDistinctElements(l);
    }

    //create a method to print all elements on a separate line

    public static void getElementsOnSeparatelINE (List<Integer> list){

        list.stream().forEach(System.out :: println);
    }

    //create a method to print all elements on a separate line with star

    public static void getElementsWithStar (List<Integer> list){

        list.stream().forEach(Utils :: printElementsWithStar);
    }

    // Create a method to print the cube of distinct odd list elements on the console in the same line
//  with a space between two consecutive elements.
    public  static void  printCubeOfDistinctElements (List<Integer> list){

        list.stream().distinct().
                filter(Utils :: checkToBeOdd).
                map(Utils :: getCube).
                forEach(Utils :: printInSameLine);
    }

    // Create a method to calculate the sum of the squares of distinct even elements
    public static void sumOfSquareOfDistinctElements(List<Integer> list){

        Integer sum = list.stream().
                distinct().
                filter(Utils :: checkIfEven).
                map(Utils :: getSquare).
                reduce(0, Math :: addExact); // this is used to calculate sum of elements
        System.out.println("sum of the squares " + sum);
    }

    // create a method calculate the product of the cubes of distinct even elements

    public static void productOfCubes(List<Integer> list){

        Integer getCubes = list.stream().
                distinct().
                filter(Utils :: checkIfEven).
                map(Utils :: getCube).
                reduce(1, Math :: multiplyExact);
        System.out.println(getCubes);
    }

    //Create a method to find the maximum value from the list elements

    public static void getMax (List<Integer> list){

        Integer max = list.stream().
                distinct().
                reduce(1, Math :: max);
        System.out.println("maximum value " + max);
    }

    //Create a method to find the minimum value which is greater than 7 and even from the list

    public static void getMinGreater7 (List<Integer> list){

        Integer getGreater7 = list.stream().
                distinct().
                filter(Utils :: checkIfEven).
                filter(t -> t>7).
                reduce(Integer.MAX_VALUE, Math :: min);
        System.out.println(getGreater7);
    }

    //create a method to find the half of the elements which are distinct and greater than 5 in reverse order

    public  static void getHalfOfDistinctElements (List<Integer> list){

        List<Double> newList = list.stream().
                distinct().
                filter(t -> t>5).
                map(Utils :: getHalfElement).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(newList);
    }
}
