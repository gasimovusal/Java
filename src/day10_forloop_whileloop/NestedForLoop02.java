package day10_forloop_whileloop;

import java.util.Scanner;

public class NestedForLoop02 {

    public static void main(String[] args) {


        //Example: write java program to print rectangle star pattern using for loop

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int rows = scan.nextInt();
        System.out.println("Enter the number of columns");
        int columns = scan.nextInt();

        for (int l = 1; l < rows + 1; l++) { // rows+1 because if user enters 5 row, l must be l<6

            for (int k = 1; k < columns + 1; k++) {

                System.out.print("*"); // * must print in same line, so we do not put ln
            }
            System.out.println(); //we put empty sout because after printing firs *, we should go to next line
        }


// IMPORTANT: REVIEW!!
        /* Example: Type code to get the output like
                        1
                        1 2
                        1 2 3
                        1 2 3 4
                        1 2 3 4 5
            */


        Scanner rowsNumber = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int numOfRows = rowsNumber.nextInt();

        for(int i=1; i<numOfRows+1; i++){

            for(int n=1; n<=i; n++){ //n<=i because ex: while i is 2 I need 2 vale, i is 3 I need 3 value
                System.out.print(n);
            }
            System.out.println();
        }

    }

}
