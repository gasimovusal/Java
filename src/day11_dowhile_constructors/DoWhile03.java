package day11_dowhile_constructors;

import java.util.Scanner;

public class DoWhile03 {

    public static void main(String[] args) {

        /*
	 	Username ise “admin”, Password is “pwd123"
	 	Ask user to enter username and password
	 	User should see “Enter your username and password” message

	 	If he enters correct credentials he should get “You are in your account!” message

	 	Otherwise, he should see “Enter your username and password” message 3 times
	 	After 3 times he should get “Your account is blocked” message
	 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you username");
        String userName = scan.next();

        System.out.println("Enter you password");
        String passWord = scan.next();

        String username = "";
        String password = "";

        int counter = 0;
        do{
            if(counter==3){
                System.out.println("Your account is blocked!!");
                break;
            }
            System.out.println("Enter you username");
            username = scan.next();

            System.out.println("Enter you password");
            password = scan.next();

            if(username.equals("admin") && password.equals("pwd123")){
                System.out.println("You are in your account");
                break; //to break the loops you can type break, if you do not type break, it will ask you username again
            }

            counter++;

        }while(counter<4);




    }
}
