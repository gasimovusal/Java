package day16_split_array;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int arr1 [] = {5,12,32};
        int arr2 [] = {5,12,34,};

        //Find out if array values are the same or different
        //arr1 5  arr2 5 12 12 32 32
        boolean flag = false;

            for(int i=0; i< arr1.length ; i++){
                if(arr1[i] != arr2[i]){
                    flag = true;
                    break;
                }
            } if(flag){
                System.out.println("The array values are different");
            }else{
                System.out.println("Array values are the same");
            }



        //second way of checking array values:
        boolean isSame = Arrays.equals(arr1, arr2);

        if(isSame){
            System.out.println("Arrays are the same");
        }else{
            System.out.println("Arrays are different");
        }
    }
}
