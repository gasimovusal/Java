package practicequestionsession.practice08;

import java.util.Arrays;

public class Q06 {

    /*
      Create an array and create a  method to find the number of positive numbers and sum of
   the non-positive numbers
   Return type must be int array
   [a,b]
    */

    public static void main(String[] args) {

        int arr[] = {2, 6, 1, -9, -7, -2}; // [num of positive --> 3, sum of negative --> -18]

        System.out.println(Arrays.toString(countPositiveAddNonPositive(arr)));

    }

    public static int[] countPositiveAddNonPositive(int arr[]) {

        int numOfPositive = 0;
        int sumOfNonPositive = 0;

        for (int w : arr) {

            if (w > 0) {

                numOfPositive++;
            } else{
                sumOfNonPositive = sumOfNonPositive +w;
            }
        }

        int result [] = {numOfPositive, sumOfNonPositive};
        return result;

    }
}
