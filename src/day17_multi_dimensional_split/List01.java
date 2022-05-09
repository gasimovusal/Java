package day17_multi_dimensional_split;

import java.util.ArrayList;
import java.util.List;

public class List01 {

    public static void main(String[] args) {

        /* 1) when you create an array you have to declare the length otherwise you cannot create an array
        2) after declaring the length it is impossible to stone more elements in it this is not good
        3) java created another structure to store multiple elements, it is called "ArrayLists".
            ArraysLists are flexible on length. it means while you create an ArrayList, no need to declare the length
            After creating ArrayList you may store any number of elements, three is no restriction about it.
            Array are fixed on length, ArrayList are flexible on length
        4) Arrays can contain "primitive data types and "reference" but Arraylist can contain just "non-primitive" data types
            int ==> Array but Integer ==> ArrayList
         */

        // how to create an ArrayList

        //1st Way
        ArrayList<Integer> al1 = new ArrayList<>();

        //2nd Way
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        //3rd Way
        List<Integer> al3 = new ArrayList<>();

        //how to print an ArrayList on console
        System.out.println(al1); // output []

        //how to add elements into a ArrayList
        al1.add(11);
        al1.add(12);
        al1.add(5);
        System.out.println(al1); // output [11, 12, 5]




    }
}
