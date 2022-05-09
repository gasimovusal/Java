package day04_scanner_ifstatement;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String [] args) {
        /*get the first name, middle name, last name, SSN from user then print them like the following
        Ali Mert Can
        123456789
         */

    Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name ... ");
        String firstName = scan.next();

        //nextLine () takes all the String, next() takes just the first word
        System.out.println("Enter your middle name ... ");
        String middleName = scan.next();

        System.out.println("Enter your last name ... ");
        String lastName = scan.next();

        System.out.println("Enter your SSN ... ");
        String ssn = scan.next();
        //we will not do any mathematical operation with SSN, that's why we used string instead of int

        System.out.println(firstName + " " + middleName + " " + lastName);

        System.out.println(ssn);


    }
}
