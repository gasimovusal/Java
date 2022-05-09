package day09_forloop_whileloop;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        //Type code to print 5 times "Hello!" on yhe console
        /* typing same code 5 times is not the right way in java, repetition is not good
        Java created 4 different ways for repetition/loop structure: 1. for-loop 2. while-loop 3. do-while-loop 4. for-each-loop
        1. for loop - for(int=start from 1; stop when reaching to 5; increase by 1)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word");
        String word = scan.nextLine();

        for(int i=word.length()-1; i>-1; i-=1){
            System.out.print(word.charAt(i));
        }





    }
}

