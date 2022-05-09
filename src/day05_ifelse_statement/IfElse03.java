package day05_ifelse_statement;

import java.util.Scanner;

public class IfElse03 {

    public static void main(String[] args){

        //ask user to type the weather condition

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type the weather condition");
        String weather = scan.next();

        if(weather.equalsIgnoreCase("sunny")){
            System.out.println("You can go to picnic");
        } else{
            System.out.println("You cannot go to picnic");
        }

    }
}
