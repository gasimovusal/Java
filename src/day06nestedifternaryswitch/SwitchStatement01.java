package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement01 {

    public static void main(String[] args){

        //get the number of days from user and print the name of the day
        // from example: 1==> Sunday, 2==>Monday etc

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter day number ...");
        int dayNumber = scan.nextInt();

        //1. Solve by using if-else-if statement
        if(dayNumber==1){
            System.out.println("Sunday");
        } else if(dayNumber==2){
            System.out.println("Monday");
        } else if(dayNumber==3) {
            System.out.println("Tuesday");
        } else if(dayNumber==4) {
            System.out.println("Wednesday");
        } else{
            System.out.println(dayNumber + " is not a day number. Day numbers are between 1 - 7.");
        }


        //2) Solve by using Switch Statement
        // when to use switch: if you have more than 3 options, Switch is preferable.

        switch(dayNumber){

            case 1:
                System.out.println("Sunday");
                break; //go outside of Switch statement, if you see the number, do not ready other remaining statement, go outside of switch statement
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println(dayNumber + " is not a day number. Day numbers are between 1 - 7.");

        }
    }
}
