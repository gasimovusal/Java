package day04scannerifstatement;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {
        /* Ask user to enter an integer, then
        print "Positive" on the console if the number is positive
        print "Negative" on the console if the number is negative
        print "Neuter" on the console if the number is zero
         */
        // If you want to run different code for different conditions you should use "if statement

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check its sign ... ");
        int num = scan.nextInt();

        if(num>0){
            System.out.println("Positive");
        }
        if(num<0) {
            System.out.println("Negative");
        }
        if(num==0){
            System.out.println("Neuter");
        }



    }
}
