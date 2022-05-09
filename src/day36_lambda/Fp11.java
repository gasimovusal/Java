package day36_lambda;

import java.util.stream.IntStream;

public class Fp11 {

    public static void main(String[] args) {

        System.out.println(getSumFrom7To100());
        System.out.println(getSumFrom7To100Second());
        System.out.println(multiply2to11());
        System.out.println(getFactorial(-89));

    }

    //Create a method to find the sum of integers from 7 to 100
    //1. way
    public static int getSumFrom7To100(){
        // IntStream does same action as for loop does in structured programming
        return IntStream.range(7, 101).reduce(0, Math::addExact);
                //7 inclusive, 101 exclusive, addExact will get sum of he values
    }

    //2. way
    public static int getSumFrom7To100Second(){
        // when you use rangeClosed last number is included
        return IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
        //7 inclusive, 100 inclusive, addExact will get sum of he values
    }

    //Create a method to find the multiplication of the integers from 2(inc) to 11(inc)
    public static int multiply2to11(){

        return IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
    }

//    //Create a method to calculate the factorial of a given number.(5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)
    public static Object getFactorial(int x){ // we use Object for both int and string

        return x>=0? IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact): "do not use negative numbers";
        //         ? is used to check the condition
    }


}
