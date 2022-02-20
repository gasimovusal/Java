package practicequestionsession.practice02;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

    /*
Ask user to enter a name and a character,
      then check how many times the character is repeated
      in the name by using for loop(make code case-sensitive)
     Example:
     INPUT      :char ch1= 'a' ;
                 String name ="John came late";
     OUTPUT :  a is repeated 2 times in this String
*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a name:");
        String name = scan.nextLine();
        System.out.println("Please enter a character:");
        char ch = scan.nextLine().charAt(0);

        int counter =0;
        for (int i=0;i<name.length();i++){
            if (name.charAt(i)==ch){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(ch+" is repeated "+counter+" times in this string");
        }

    }
}
