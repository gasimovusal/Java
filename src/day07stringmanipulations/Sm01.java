package day07stringmanipulations;

import java.util.Scanner;

public class Sm01 {

    public static void main(String[] args) {

        // print the first and last character of the given string on the console.
        // "Java is easy" ==> Jy
        //to get character from a String one by one we have 2 ways:
        // 1) using charAt

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = scan.nextLine(); // use nextLine because user will enter multiple words

        //if you use 0 inside the charAt() method, you will get first character in a string
        char firstChar = str.charAt(0);
        System.out.println(firstChar);

        // Ali 123 - index number of the character is 1 less - i is 3 index number of i is 3-1=2
        // finding index character ==> str.length()-1

        //If you use str.length()-1 inside the charAt method, you will get last character in a string
        //chartAt is used to gt just 1 character
        char lastChar = str.charAt(str.length()-1); //str is name of the character
        System.out.println(lastChar);

        /* 2) Using substring()
                a. you may want to get all characters starting from specific character:
                str.substring(2) ==> (2) means starting from 2nd character, or starting from 3rd letter
                b. if you want to get specific part from the middle, use:
                str.substring(1, 6) ==>
                ==> 1 is inclusive, it means it will get 1st character/2nd letter, 6 is exclusive, it means it will get 5th character/6th letter
         */

        String firstCharacter = str.substring(0, 1); //==>its for first character
        System.out.println(firstCharacter);

        String lastCharacter = str.substring(str.length()-1, str.length());
        System.out.println(lastCharacter);

        String afterThirdChar = str.substring(3); //==> will print all character after 3rd character including 3rd character
        System.out.println(afterThirdChar);




    }
}
