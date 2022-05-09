package day14_ststic_arrays_foreachloop;

import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5};
         int num [] = {4, 4, 1, 5, 3};

        Arrays.sort(array);
        Arrays.sort(num);

        if(Arrays.equals(array, num)){
            System.out.println("they are the same");
        }else{
            System.out.println("not same");
        }
    }
}
