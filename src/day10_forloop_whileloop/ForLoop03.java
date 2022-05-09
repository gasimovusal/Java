package day10_forloop_whileloop;

import java.util.Scanner;

public class ForLoop03 {

    public static void main(String[] args){

        // Example: type code to find the sum of the digits of an integer ==> 753 =>7+5+3=15

        /* 1) I want to get last digit ==> 753%10 => answer is 75.3 and last digit is 3;  753/10=>75 - java removes decimal
        2) 75%10=>5 answer is 7.5 and last digit is 5;  75/10=7
        3) 7%10=>7 because answer is 0.7 ans last digit is 7;
        4) do addition sumOfDigits=3+5+7=15
         */

        int n = 753;
        int sumOfDigits = 0;

        for(int i=n; i>0; i=i/10){
            sumOfDigits = sumOfDigits + i%10;

        }
        System.out.println(sumOfDigits);



        // Example: type code to find sum of the unique digits of an integer

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int p = scan.nextInt();

        String pString = String.valueOf(p);
        //this code will convert integer to string so you can compare character of each number

        int sumOfUniqueDigits = 0;

        for(int i=0; i<pString.length(); i++){ //i=0 is starting index and

            char c = pString.charAt(i); //this code gets characters one by one
            //you can also type code as String pString = String.valueOf(p);

            // this code is for selecting unique character
            if(pString.indexOf(c)==pString.lastIndexOf(c)){

                sumOfUniqueDigits = sumOfUniqueDigits + Integer.valueOf(c + "");
                //if you put char inside the valueOf(), you will get ASCII value
                // valueOf(c) will give ascii value
            }
        }

        System.out.println(sumOfUniqueDigits);

    }
}
