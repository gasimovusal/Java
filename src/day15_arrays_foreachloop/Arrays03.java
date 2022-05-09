package day15_arrays_foreachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //WRONG WAY of solving problem

        //check if the Array elements are in natural order. "A", "B", "C" ==>true ; "A", "C", "B" ==>false
        String urr[] = {"Ali", "Ceyhan", "Beyhan"};
        System.out.println(Arrays.toString(urr));

        //if you assign an array into another array they will use same reserved area, do not forget!!!
        //it will create 2 addresses in stack memory that will point same reserved area
        String mrr[] = urr;

        Arrays.sort(mrr);

        if(Arrays.equals(urr, mrr)){
            System.out.println("Array elements are in natural order");
        }else{
            System.out.println("Array elements are not in natural order");
        }

    }
}
