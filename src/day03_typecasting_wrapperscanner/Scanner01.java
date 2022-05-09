package day03_typecasting_wrapperscanner;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

    //Scanner Class is used to get from user in Java
    //1)
    Scanner scan = new Scanner(System.in);

    //2) give message to user
        System.out.println("Enter Your Age");

    //3)get the data from user and put in memory
        byte age = scan.nextByte();

        System.out.println("The User's Age Is " + age);

    }
}
