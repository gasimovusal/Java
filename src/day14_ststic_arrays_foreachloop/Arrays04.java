package day14_ststic_arrays_foreachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {

    //create an array by getting array element from user

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of elements you want to store inside the array");
        int len = scan.nextInt();

        String sArray[] = new String[len]; //len is the number that user entered
        System.out.println(Arrays.toString(sArray));

        for(int i=0; i<len; i++){ //use for loop for eindex number
            System.out.println("Enter a string");
            String el = scan.next(); //you do not need to create extra reserve area, you can delete this step
            sArray[i] = el; //you can just ytpe sArray[i] = scan.next();
        }
        System.out.println(Arrays.toString(sArray));


    }
}
