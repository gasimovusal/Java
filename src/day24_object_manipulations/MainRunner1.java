package day24_object_manipulations;

import java.util.Scanner;

public class MainRunner1 {

    public static void main(String[] args) {

        /* type a program that asks user their name and last name, then create an email for the user
        concatenate the name and lastname then add @gmail.com
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you first name");
        String name = scan.nextLine();

        System.out.println("Please enter you last name");
        String lastname = scan.nextLine();

        System.out.println("Person name: " + name);
        System.out.println("Person last name: " + lastname);

        System.out.println("Peron's email: "+ getEmail(name, lastname));
    }

    public static String getEmail(String name, String lastname){

        return (name + "_" + lastname + "@gmail.com").toLowerCase(); // using tolowercase method here will be more dynamic
    }


}
