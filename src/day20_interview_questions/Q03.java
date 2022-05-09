package day20_interview_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {

    /*	 	Create a function that takes an array and
            returns the difference between the biggest and the smallest numbers.
            Ask user to enter array elements.	*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len = scan.nextInt();
        int[] arr = new int[len];

        System.out.println("Please type the array elements");

        for(int i=0; i<len; i++){

            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr); // 1, 3, 12, 34, 42

//                             42   -  1 = 41
        int difference = arr[len-1] - arr[0];
       System.out.println("Difference between biggest value and smallest value of the array is: " + difference);




        System.out.println("Difference between biggest value and smallest value of the array is: " + getDifference(arr));
        //this code is call outside the main method

    }


    public static int getDifference(int [] arr){

        Arrays.sort(arr); // now I have an array elements in sorted order

        return arr[arr.length - 1] - arr[0];

    }

}
