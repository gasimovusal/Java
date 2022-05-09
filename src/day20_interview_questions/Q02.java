package day20_interview_questions;

import java.util.Scanner;

public class Q02 {

    //Write a Java program to swap two numbers
    public static void main(String[] args) {

        //1st way
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 number to swap");

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();

        System.out.println("Before swapping: " + n1 + ", " + n2);

        //      10    10
        int temp = n1;
      //20   20
        n1 = n2;
      //10   10
        n2 = temp;

        System.out.println("After 1st swap: " + n1 + ", " + n2);


        //2. way
      //10   10   20
        n1 = n1 + n2;
      //10   30 - 20
        n2 = n1 - n2;
      //20   30 - 10
        n1 = n1 - n2;

        System.out.println("After 2nd swap: " + n1 + ", " + n2);
    }
}
