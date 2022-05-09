package day06_nestedif_ternaryswitch;

import java.util.Scanner;

public class NestedIfStatement01 {

    public static void main (String[] args){

        /*      Ask user to enter  password

        If the intial of the password is uppercase then check if it is "A" or not.
        If it is a "A" the output will be "Void Password"
        otherwise the output will be "Invalid Password"
        For example: Ali ==> valid password  ali ==> invalid password  Mark. ==> invalid

        if the initial of the password is lowercase then check if it is 'z' or not.
        If it is a 'z' the output will be "valid password"
        otherwise the output will be "invalid password"
        for example: zoe ==> valid password  Zoe ==>invalid   john ==> invalid

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password");
        String pwd = scan.nextLine();

        //how to get first character from a String
        System.out.println(pwd.charAt(0));
        if(pwd.charAt(0)>='A' && pwd.charAt(0)<='Z'){

            if(pwd.charAt(0)=='A'){
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid password");
            }
        }
    }
}
