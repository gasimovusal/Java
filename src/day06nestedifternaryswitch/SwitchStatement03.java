package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement03 {

    public static void main(String[] args){

        // create a sample calculator which does addition, subtraction, multiplication, division, percentage calculation

        Scanner scan = new Scanner(System.in);
            System.out.println("Enter first number");
         double firstNumber = scan.nextDouble();

        System.out.println("Enter second number");
        double secondNumber = scan.nextDouble();

        System.out.println("Select operation: +, -, *, /, %");
        //to get a single character from user we type ==> scan.next().charAt(0);
        char operation = scan.next().charAt(0);

        switch(operation){

            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '%':
                System.out.println(firstNumber * secondNumber/100);
                break;
            default:
                System.out.println("Invalid operation for this calculator");
        }

        /* in switch method parenthesis you can use just the following data types;
            int, byte, short, char, String

          in switch method parenthesis you can not use just the following data types;
            long, float, double, boolean

         */
    }


}
