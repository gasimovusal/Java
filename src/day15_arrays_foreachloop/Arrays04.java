package day15_arrays_foreachloop;

import java.util.Arrays;

public class Arrays04 {

    public static void main(String[] args) {

        //check if the Array elements are in natural order. "A", "B", "C" ==>true ; "A", "C", "B" ==>false
        String mrr[] = {"Ali", "Ceyhan", "Beyhan"};
        System.out.println(Arrays.toString(mrr));

        //if you want to keep original array same, use the copyOf() method
        //by using copyOf() method you will have same elements in 2 different reserved area
        String nrr[] = Arrays.copyOf(mrr, 3);
        Arrays.sort(nrr);

        if(Arrays.equals(mrr, nrr)){
            System.out.println("Array elements are in natural order");
        }else{
            System.out.println("Array elements are not in natural order");
        }

    }
}
