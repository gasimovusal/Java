package practicequestionsession.practice01;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args){

         /*
            Ask user to enter his kid's name,
            if the name contains both "a" and "z"  output will be "This name contains 'a'"
            if the name contains "a"               output will be "This name contains 'a'."
            if the name contains "z"               output will be "This name contains 'z'."
            Otherwise, output will be             "This name contains neither 'a' nor 'z'."
        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your child's name");
        String name = scan.next().toLowerCase();


            if (name.contains("z") && name.contains("a")){
                System.out.println("This name contains 'a'.");
            } else if(name.contains("a")){
                System.out.println("This name contains 'a'.");
            } else if(name.contains("z")){
                System.out.println("This name contains 'z'.");
            } else{
                System.out.println("This name contains neither 'a' nor 'z'.");
            }


    }
}
