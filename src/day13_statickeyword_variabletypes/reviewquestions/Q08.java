package day13_statickeyword_variabletypes.reviewquestions;

public class Q08 {

    public static void main(String[] args) {

        add(3.2, 4.8); //Output A

        System.out.println(add(5, 7.3)); //Output B

        System.out.println(add(5, 7)); //Output C

        add(5.3, 7); //Output D

    }



    public static void add(double n1, double n2) {

        System.out.println(n1 + n2);

    }

    public static double add(int n1, double n2) {

        return n1 + n2;

    }

    public static int add(int n1, int n2) {

        return n1 + n2;

        /*Output A is 8.0
        Output C is 12
        Output B is 12.3
         */

    }
}
