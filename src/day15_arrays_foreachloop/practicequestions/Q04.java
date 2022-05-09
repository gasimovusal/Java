package day15_arrays_foreachloop.practicequestions;

import java.util.Arrays;

public class Q04 {
    public static void main(String[] args) {


        int arr[] = {2, 11, 0, 23, 7};

        Arrays.sort(arr); // sorts from low to high

        for(int i=4; i>=0; i--) {
            System.out.print(arr[i] + " "); // output will be high to low
        }

        //What is the output?

//a) 2 11 0 23 7

//b) Gives Compile Time Error

//c) 23 11 7 2 0

//d) 0 2 7 11 23

    }
}
