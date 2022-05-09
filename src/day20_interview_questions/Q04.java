package day20_interview_questions;

import java.util.Scanner;

public class Q04 {

        /*
            Ebay Interview Questions
   Get a String and a character from user
   Count the number of characters between the first occurence and the last occurence of the given character in the String
   Do not count the space characters
   If the character which user selected is displayed just once in the String return -1
   If the character which user selected does not exist in the String return -1
   For example; "Java is easy" - 'a' ==> 5
                "Java is easy" - 'w' ==> -1
                "Java is easy" - 'e' ==> -1
*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string value");

        String str = scan.nextLine();

        System.out.println("Please enter a character");
        char ch = scan.next().charAt(0);

        int firstOccIndex = str.indexOf(ch); // first index
        int lastOccIndex = str.lastIndexOf(ch); // second index
        int counter = 0; // this is used to count number of character inbetween first and last accurance

        if(firstOccIndex == lastOccIndex){

            System.out.println(-1);

        } else{

            for(int i=firstOccIndex+1; i<lastOccIndex; i++){

                if(str.charAt(i) != ' '){ // if you find space dont count
                    counter++;
                }
            }
        }
        System.out.println("Number of characters accuring inbetween given chars:  " + ch);




    }
}
