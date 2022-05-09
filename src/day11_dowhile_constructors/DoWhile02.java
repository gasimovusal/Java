package day11_dowhile_constructors;

import java.util.Scanner;

public class DoWhile02 {

    public static void main(String[] args) {

        /*
	 	  Ask user to enter an integer.
		  If the integer is less than 100, tell user “Won!”
		  Otherwise tell user “Lost!”
		  user should see Won until types 100
	 */

        Scanner scan = new Scanner(System.in);

        int n = 0;
        //if you do not type this code, every time when user enters number, reserve area in stack memory will be created for each number
        //you can put anything for n, n=1
        //int n = 0 will only creat 1 reserved area in stack memory
        //every time when user enters data, it will delete previous data in stack memory reserve area and put new number

        do{
            System.out.println("Enter an integer"); //we put his inside loop because process will repeat until typing 100
            n = scan.nextInt();

            if(n<100){
                System.out.println("Won!");
            }

        } while (n<100);

        System.out.println("Lost!");

    }
}
