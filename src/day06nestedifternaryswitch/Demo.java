package day06nestedifternaryswitch;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number ...");
        int dayNumber = scan.nextInt();

        switch(dayNumber) {

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;

        }

    }
}
