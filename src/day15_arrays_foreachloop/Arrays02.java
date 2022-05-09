package day15_arrays_foreachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {


        //check if the Array elements are in natural order. "A", "B", "C" ==>true ; "A", "C", "B" ==>false
        String srr[] = {"Ali", "Ceyhan", "Beyhan"};
        System.out.println(Arrays.toString(srr));

        //create a new array and put the elements into the new array
        String trr[] = new String[3];  //output [null, null, null]
        //if you want to keep original array same, transfer the elements one by one

            for(int i=0; i<3; i++){
                trr[i] = srr[i];
            }

        System.out.println("Before sort: " + Arrays.toString(trr));

        Arrays.sort(trr); //sort will put elements in alphabetical order
        System.out.println("After sort: " + Arrays.toString(trr));


        if(Arrays.equals(srr, trr)){
            System.out.println("Array elements are in natural order");
        }else{
            System.out.println("Array elements are not in natural order");
        }

    }
}
