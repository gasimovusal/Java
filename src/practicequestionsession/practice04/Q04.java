package practicequestionsession.practice04;

import java.util.Arrays;
import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {

         /*
      Ask user to enter an integer, and create a squared multidimensional Array
Example: If user enters 3 ==> [[3, 3, 3],[3, 3, 3],[3, 3, 3]]
         If user enters 4 ==> [[4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4], [4, 4, 4, 4]]
   */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to create a squared multidimensional Array");
        int length = scan.nextInt();

        if(length<0){
            System.out.println("Please enter positive number");
        } else{

            int array [][] = new int [length][length];

            for(int i=0; i<length; i++){

                for(int j=0; j<length; j++){

                    array[i][j] = length;
                }
            }
            System.out.println(Arrays.deepToString(array));
        }



    }
}
