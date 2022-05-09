package day06_nestedif_ternaryswitch;

import java.util.Scanner;

public class SwitchStatement04 {

    public static void main(String[] args){

        // ask user to enter country name among "America, Turkey, Azerbaijan, England"
        // type code to print abbreviation of the countries "US, TR, AZ, UK"

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the country name: America, Turkey, Azerbaijan, England");

        //if you want switch statement work with case insensitive, use "toLowerCase()" and type in lower case

        String country = scan.next().toLowerCase();
         switch(country){

             case "america":
                 System.out.println("US");
                 break;
             case "turkey":
                 System.out.println("TR");
                 break;
             case "azerbaijan":
                 System.out.println("AZ");
                 break;
             case "england":
                 System.out.println("UK");
                 break;
             default:
                 System.out.println(country + "Please enter valid country");
         }
    }
}
