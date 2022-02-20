package day04scannerifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args){
        /*ask user to enter an integer, then
        print "Even" if the integer is even
        print "Odd" if the integer is odd
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check if its even or odd ... ");
        int num = scan.nextInt();

        /*In java, we have "modulus" operator. for modulus operation, we use "%"
        Modulus" operation gives you the remainder in a division operation
         */
        // "!true" means false      "!false" means true     "!!true" means true
        if(num%2==0){
            System.out.println("Even");
        }
        if(num%2!=0){
            System.out.println("Odd");
        }
    }
}
