package day17_multi_dimensional_split.practicequestions;

import java.util.Arrays;

public class Q05 {

    public static void main(String[] args) {

        String s = "I liked to move it move it";

//        Which ones are true for the given String?

String arr1[] = s.split("move");

        System.out.println(arr1[1]); //output is [I like to, it, it]

       // Prints  it on the console (Note: Before and after it there is 1 space) index number of IT is 1  TRUE

String arr2[] = s.split("it");

        System.out.println(Arrays.toString(arr2)); //output [I liked to move, move]

        //Prints [I liked to move ,  move ] on the console    TRUE

String arr4[] = s.split(" ");  //(Note: There is space between double quotes)

        System.out.println(arr4.length); //output will be [I, liked, to, move, it, move, it]

        //Prints 7 on the console TRUE


    }
}
