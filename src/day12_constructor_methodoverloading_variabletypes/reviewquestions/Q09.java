package day12_constructor_methodoverloading_variabletypes.reviewquestions;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

       // Ask user to enter password, if the password is "password" print "true" on the console,
       // otherwise print "false" and "Enter your password" on the console.

        Scanner scan = new Scanner(System.in);

        String password = "";
 //a)
        do {
            System.out.println("Enter your password"); //user will enter password
            password = scan.nextLine(); //user will entered password

            if(!(password.equals("password"))) { //password.equals("password") is true; ! is false so result will be false
                System.out.println("false"); //will not execute test because it was false
            }
        }while(!(password.equals("password"))); //password.equals("password") is true; ! is false so result is false adn it will not print in console

        System.out.println("true"); //it will print true

//b)
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter your password"); //user saw messaged and enter password
        String password1 = scan1.nextLine(); //entered password

        while(!(password1.equals("password"))) { //password1.equals("password") is true ! is false so it will be false
            System.out.println("false"); //loop is broken is because output was false before
            System.out.println("Enter your password"); //loop is broken is because output was false before
            password1 = scan1.nextLine(); //loop is broken is because output was false before
        }
        System.out.println("true"); //it will print true

//c)
        Scanner scan2 = new Scanner(System.in);
        String password2 = "";

        do {
            System.out.println("Enter your password");
            password2 = scan2.nextLine();

            if(password2.equals("password")) {
                System.out.println("true");
            }else {
                System.out.println("false");
            }

        }while(!(password2.equals("password")));




    }
}
