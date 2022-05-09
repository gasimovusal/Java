package day16_split_array;

import java.util.Arrays;

public class MaxElementOfArray {

    public static void main(String[] args) {

        int [] array = {12, 23, 9, 34, 3, 29};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array)); // [3, 9, 12, 23, 29, 34]
        int max = array[array.length-1];
        System.out.println("Max element is: " + max); // Max element is: 34

        int max1 = array[0];
        for(int i=0; i< array.length; i++){
            if(max1<array[i]){
                max1 = array[i];
            }
        }
        System.out.println("Max number is: " + max);
    }
}
