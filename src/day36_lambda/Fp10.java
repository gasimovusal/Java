package day36_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Fp10 {

    public static void main(String[] args) {

        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mark");
        l.add("Amanda");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Benjamin");

//        printUpperCase(l);
//        System.out.println();
//        printUpperCase01(l);
//        System.out.println();
//        printByLength(l);
//        System.out.println();
//        printReversedOrderByLength(l);
//        System.out.println();
//        printDistinctElementByLastChar(l);
//        System.out.println();
//        printByLengthAndFirstChar(l);
//        System.out.println();
//        removeLengthMoreThan5(l);
//        removeIfLengthBetween8to10OrEndingO(l);
        System.out.println(checkTheLengthIfLessThan12(l));
        System.out.println(checkInitialNotX(l));
        System.out.println(checkEndsWithR(l));

    }
    //Create a method to print all list elements in uppercase
    //1. way

    public static void printUpperCase(List<String> list) {

       list.stream().map(String::toUpperCase).forEach(Utils::printInSameLine);
    }

    //2.way
    public static void printUpperCase01(List<String> list){

        list.replaceAll(String::toUpperCase);
        System.out.println(list);

    }

    //Create a method to print the elements after ordering according to their lengths
    public static void printByLength(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length)).forEach(Utils :: printInSameLine);
    }

    //Create a method to print the elements after ordering according to their lengths (In reverse order)
    public static void printReversedOrderByLength(List<String> list){

        list.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(Utils :: printInSameLine);
    }

    //Create a method to sort the distinct elements by using their last characters
    public static void printDistinctElementByLastChar(List<String> list){

        list.stream().distinct().sorted(Comparator.comparing(Utils::getLastChar)).forEach(Utils::printInSameLine);
    }

    // Create a method to sort the elements according to their lengths then according to their first character
    public static void printByLengthAndFirstChar (List<String> list){

        list.stream().sorted(Comparator.comparing(String::length).thenComparing(t -> t.charAt(0))).forEach(Utils::printInSameLine);
    }

    // Remove the elements if the length of the element is greater than 5
    public static void removeLengthMoreThan5(List<String> list){

        list.removeIf(t -> t.length()>5);
        System.out.println(list);
    }

    // Remove the elements if the length is between 8 and 10 or ending with 'O'
    public static void removeIfLengthBetween8to10OrEndingO(List<String> list){

       // Predicate<String>  checkCondition = t -> t.length()>7 && t.length()<11 || t.endsWith("O");
        list.removeIf(t -> t.length()>7 && t.length()<11 || t.endsWith("o"));
        System.out.println(list);
    }

    // Create a method to check if the lengths of all elements are less than 12
    public static boolean checkTheLengthIfLessThan12(List<String> list){

        return list.stream().allMatch(t -> t.length()<12);
        //allMath() will check all the values without exception
    }

    // Create a method to check if the initial of any element is not ‘X’
    public static boolean  checkInitialNotX(List<String> list){

        return list.stream().noneMatch(t -> t.startsWith("X"));
    }

    // Create a method to check if at least one of the elements ending with “r”
    public static boolean  checkEndsWithR(List<String> list){

        return list.stream().anyMatch(t -> t.endsWith("r"));
    }
}
