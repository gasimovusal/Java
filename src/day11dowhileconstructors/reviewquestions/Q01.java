package day11dowhileconstructors.reviewquestions;

public class Q01 {

    public static void main(String[] args) {

        int j=1;

        while(j<=10) {

            System.out.print(j + " "); //output will give 1 2 3 4 5 6 7 8 9 10

            j++; //it will increase j by one

        }

        //Which one of the followings has the same output with the given code?

        // this code is the same, will give same output
        int a=1;

        while(a<11) {

            System.out.print(a + " ");

            a++;

        }

        //this wil give result from 10 to 1 not 1 to 10
        int b=10;

        while(b>=1) {

            System.out.print(b + " ");

            j--;

        }

        /*
        int j=1;

        while(j<=10) {

            System.out.print(j + " "); // this code will give infinite result

         */

    }


}
