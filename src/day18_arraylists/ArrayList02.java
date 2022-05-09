package day18_arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {

    public static void main(String[] args) {

        /*
        Ask user to enter a letter
        If the letter exists in list1 convert it to “Got it”
        otherwise add the element which user entered into the list
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter");
        String letter = scan.next();

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("K");
        list.add("R");
        list.add("S");

        if(list.contains(letter)) {

            list.set(list.indexOf(letter), "Got it");
            }else{
                list.add(letter); // if letter does not exist, we will add
            }
        System.out.println(list);






    }
}
