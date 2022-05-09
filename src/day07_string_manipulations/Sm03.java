package day07_string_manipulations;

import java.util.Scanner;

public class Sm03 {

    public static void main(String[] args) {

        //check if any character exist in a string or not

        /*Vusal Gasimov
            str.indexOf('l'); ==> 4 ==> because l is 4th character
            str.indexOf('im') ==> 9 ==> because i is 9th character, it will look at first letter i
            str.indexOf("Gasimov") ==> 6 ==> because G is 6th character
            str.indexOf('x') ==> -1 ==> because x does not exist, for non-existing characters indexPf() returns -1
            str.indexOf("Bimov") ==> -1 ==> because first letter B does not exist
         */

        //First way:
    Scanner scan = new Scanner(System.in);
        System.out.println("Please type your name");
    String str = scan.nextLine();
    String characterToCheck = "x";

    int result = str.indexOf(characterToCheck);
    //if you type str.indexOf it will automatically show what the result will be and what variable it will need

    if(result==-1){ //-1 means character does not exist
        System.out.println("Character x does not exist");
    }else{
        System.out.println("Character x exists");
    }

    //Second way

    boolean isContain = str.contains("a");
    if(isContain){
        System.out.println("The character a exists");
    }else{
        System.out.println("The character a does not exists");
    }

    }
}
