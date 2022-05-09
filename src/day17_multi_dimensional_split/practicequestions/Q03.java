package day17_multi_dimensional_split.practicequestions;

import java.util.Arrays;

public class Q03 {

    public static void main(String[] args) {

        int arr[] = {12, 23, 13, 2, 3};

        Arrays.sort(arr);   //[2, 3, 12, 13, 23]

        System.out.println(Arrays.binarySearch(arr, 12)); // 12 exists so you get index number - 2

/*        What is the output? ==>2



 */
    }
}
