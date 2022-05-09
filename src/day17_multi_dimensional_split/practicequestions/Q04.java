package day17_multi_dimensional_split.practicequestions;

import java.util.Arrays;

public class Q04 {

    public static void main(String[] args) {

        int arr[] = {12, 23, 12, 2, 3};

        Arrays.sort(arr); //[2, 3, 12, 12, 23]

        System.out.println(Arrays.binarySearch(arr, 5)); //5 does not exists, it would put after 3, result will be order number ==>-3

//        What is the output?


    }
}
