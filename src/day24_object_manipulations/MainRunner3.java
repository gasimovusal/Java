package day24_object_manipulations;

import java.util.Scanner;

public class MainRunner3 {

    /* Ask user to their first and last anem
       then generate and email for them
       concatenate first name and last name
       add @gmail.com, then print email for the user on the console
        */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter you first and last name");


        Person person = new Person(scan.next(), scan.next());

        generateEmail(person); // person is parameter

    }

    public static void generateEmail(Person person) {

        System.out.println(person.name + person.lastName + "@gmail.com");


    }
}
