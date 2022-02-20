package day07stringmanipulations;

import java.util.Scanner;

public class Sm02 {

    public static void main(String[] args) {

        //type code to get initials of first name and last name Vusal Gasimov ==> VG

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first and last name");

        String str = scan.nextLine();
        String firstInitial = str.substring(0, 1);

        /* how to find an index of a space character
        1. find the index of space: indexOf(" ")
        2. increase the index of space by 1 and it will give you next index after space which will be initial of last name
         */

        int indexOfLastName = str.indexOf(" ") + 1;
        String initialOfLastName = str.substring(indexOfLastName, indexOfLastName+1);
                                                //this

        System.out.println(firstInitial + initialOfLastName);

    }
}
