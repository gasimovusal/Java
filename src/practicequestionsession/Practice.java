package practicequestionsession;

import java.util.Scanner;

public class Practice {

    public static void main(String arrg[]){

        double pennies = 0.01;
        double nickles = 0.05;
        double dimes = 0.1;
        double quarters = 0.25;
        int dollar = 1;

        Scanner scan = new Scanner(System.in);

        System.out.println("How many pennies?");
        int pennies1 = scan.nextInt();

        System.out.println("How many nickles?");
        int nickles1 = scan.nextInt();

        System.out.println("How many dimes?");
        int dimes1 = scan.nextInt();

        System.out.println("How many quarters?");
        int quarters1 = scan.nextInt();

        scan.close();

        double total = pennies*pennies1 + nickles*nickles1 + dimes*dimes1 + quarters*quarters1;


        if(total>dollar){
            System.out.println("You won $1!");
        }else {
            System.out.println("you lost!");
        }
    }
}
