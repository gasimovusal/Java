package day17_multi_dimensional_split;

import java.util.ArrayList;

public class List02 {

    public static void main(String[] args) {

        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(11);
        al1.add(12);
        al1.add(5);

        //Note: add() method put the elements in ArrayList according to the insertion order

        al1.add(1, 99);
        System.out.println(al1);// output [11, 99, 12, 5]

        //how to get number of elements in an ArrayList
        int numOfElements = al1.size();

        System.out.println(numOfElements);

        ArrayList<Integer> al2 = new ArrayList<>();

        System.out.println(al2.size());

        //note: when tou talk about the number of elements in an Array, tell "Array length"
        //note: when tou talk about the number of elements in an ArrayList, tell "List size"

        //how to check if an ArrayList is empty or not
        //1st way
        if (al2.size() ==0){
            System.out.println("empty");
        }else{
            System.out.println("not empty");
        }

        //2nd way:
        if(al1.isEmpty()){
            System.out.println("Is empty");
        } else {
            System.out.println("Is not empty");
        }






    }
}
