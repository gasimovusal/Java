package day14_ststic_arrays_foreachloop;

import java.util.Arrays;

public class Arrays06 {

    public static void main(String[] args) {


        //how to creat an array and put elements in it in one line
        int a[] = {12, 7, 0, 32};
        System.out.println(Arrays.toString(a));

        int b[] = {12, 7, 0, 32};
        System.out.println(Arrays.toString(b));

        //if two arrays have same elements at the same indexes, then arrays are same.
        //how to check is two arrays are same or not

        boolean sameArrays = Arrays.equals(a, b);
        System.out.println(sameArrays);

        //type code to check if 2 arrays have same elements
        //first we need to sort order in ascending order, from low to high
        Arrays.sort(a); //[0, 7, 12, 32]
        Arrays.sort(b);
        if(Arrays.equals(a, b)){
            System.out.println("Same arrays");
        }else{
            System.out.println("Different arrays");
        }


    }
}
