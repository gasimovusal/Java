package practicequestionsession.practice02;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {

        /*
 Print numbers from given number till the next multiple of 10. e.g.,
 if input is 5 it should print 5, 6, 7, 8, 9, 10 or
 if input is 27 it should print 27, 28, 29, 30 or
 if input is 40 then it should print 40.
 Use while loop..
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int n = scan.nextInt();

        while(n%10!=0){
            System.out.print(n + " ");
            n++; // it will calculate the number until reaching number that is divisible to 10
        }
        System.out.println(n); //this will show last result, number that divisible to 10



    }
}
