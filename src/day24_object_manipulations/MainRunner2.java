package day24_object_manipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner2 {

    /*
     type a program that asks user their 2 first name and 2 last name, then create an email for the user
     concatenate the name and lastname then add @gmail.com
     */

    public static void main(String[] args) {

        List<String> names = new ArrayList();

        List<String> lastnames = new ArrayList();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 2 names");

        names.add(scan.nextLine());
        names.add(scan.nextLine());

        System.out.println("Please enter 2 last names");
        lastnames.add(scan.nextLine());
        lastnames.add(scan.nextLine());

        System.out.println("User names: " + names);
        System.out.println("User last names: "+ lastnames);

        System.out.println("email ids: " + generateEmail(names, lastnames));
    }

    public static List<String> generateEmail (List<String> names, List<String> lastnames) {

        List<String> emails = new ArrayList<>();
        /* 1. way
        //Ali ==> 0               Can ==> 0
        emails.add(names.get(0) + lastnames.get(0) + "@gmail.com");
        //Veni ==> 1               Han ==> 1
        emails.add(names.get(1) + lastnames.get(1) + "@gmail.com");
         */

        //2. way
        for(int i=0; i< names.size(); i++){
            emails.add((names.get(i) + lastnames.get(i) + "@gmail.com").toLowerCase());
        }

        return emails;
    }
}
