package day15_arrays_foreachloop.practicequestions;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {


        int arr[] = {11, 12, 13, 14};

        //Which one is false for the given array?

//a)
        System.out.println(arr[1]);
        //Prints 11 on the console.
        //false - prints 12

//b)
        for(int i=0; i<4; i++) {
            System.out.print(arr[i] + " ");
        }
        //Prints 11 12 13 14 on the console. - true

//c)
        System.out.println(arr[arr.length-2]);
        //Prints 13 on the console. - true

//d)
        System.out.println(Arrays.toString(arr));
        //Prints [11, 12, 13, 14] on the console. - true
    }
}
