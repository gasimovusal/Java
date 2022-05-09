package practicequestionsession.practice08;

import java.util.Arrays;
import java.util.Scanner;

public class Q05 {

    /*
   Ebay Interview Question
   Create an array and get elements of array from user
   Put all zeros to end in an integer array
   {3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
   {0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please ener the length of array");
        int length = scan.nextInt();

        int arrray [] = new int[length];
        System.out.println("Please enter the elements of array");

        for(int i = 0; i<length; i++){

            arrray[i] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arrray));

        int brr [] = new int[length];

        int idx = 0;

        for(int i=0; i<length; i++){

            if(arrray[i] !=0){

                brr[idx] = arrray[i];
                idx++;
            }
        }

        System.out.println(Arrays.toString(brr));


    }
}
