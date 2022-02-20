package day11dowhileconstructors.reviewquestions;

public class Q04 {

    public static void main(String[] args) {

        int i=1;

        int product=1;

        while(i<=4) {

            product = product * i; //1*1=1; 1*2=2; 2*3=6, 6*4=24

            i++; // i=2; i=3, i=4; i=5

            System.out.println(product); // output 1; 2; 6, 24

        }

        //What is the output of the given code?
        //1, 2, 6, 24


    }
}
