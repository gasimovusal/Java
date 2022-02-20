package day10forloopwhileloop;

import java.util.Scanner;

public class NestedForLoop01 {

    public static void main(String[] args) {

        //nested loop used when we have loop inside the loop

        //1.Example: Type 3 times Hello1 for 1, 3 times Hello2 for 2, 3 times Hello3 for 3, 3 times Hello4 for 4 on the console

        for(int i=1; i<5; i++){ //t

            for(int k=1; k<4; k++){ // this code is for repiting 3 time
                System.out.println("Hello"+i);
            }
        }


        // Example:

        for(int i=1; i<4; i++) {

            System.out.println("Week: " + i);

            for (int k = 1; k < 8; k++) {

                System.out.print("Day " + k);
            }
        }









    }
}
