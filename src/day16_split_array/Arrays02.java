package day16_split_array;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        int [] arr = {34, 54, 12, 37, 29};

        int expectedElement = 12;

        int counter = 0;

        for(int i=0; i< arr.length; i++){
            if(arr[i] == expectedElement){
                counter++;
                break;
            }
        }
        if(counter>0){
            System.out.println("array contains expected value");
        }else{
            System.out.println("Array does not contain expected value");
        }


        Arrays.sort(arr); //sorting ascending order, from low to high
        System.out.println("Binary search result: " + Arrays.binarySearch(arr, expectedElement)); // we will get the value index number
    }
}
