package day15_arrays_foreachloop.practicequestions;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {


        int arr[] = {2, 11, 0, 23, 7};

        //Which one of the followings prints the greatest element of the given array on the console?

//a)
        //Array.sort(arr); ==> this should be Arrays not array
        //System.out.print(arr[arr.length - 1]);

//B
        Arrays.sort(arr); //==> true answer, it will print 23
        System.out.print(arr[arr.length - 1]);

//c)
        Arrays.sort(arr);
        System.out.print(arr[arr.length]); //it will print element 5 which does not exist

//d)
        //Arrays.sort(); ==> there is not array not inside ()
        System.out.print(arr[arr.length - 1]);
    }
}
