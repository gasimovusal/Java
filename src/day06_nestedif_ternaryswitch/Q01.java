package day06_nestedif_ternaryswitch;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

        /* type code to check the password
            if it has more than 8 characters, initial should be 'i'
            if it has no more than 8 characters initial should be 'K' and last character should be '!'

            Solve the task by using nested-ternary
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the password");
        String password = scan.next();

        String isValid = (password.length()>8) ? (password.charAt(0)=='i' ? "Valid password" : "Invalid Password") : ( password.charAt(0)=='K'? "Valid password" : "Invalid Password");
        System.out.println(isValid);







    }
}
