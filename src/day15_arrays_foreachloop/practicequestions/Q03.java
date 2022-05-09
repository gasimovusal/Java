package day15_arrays_foreachloop.practicequestions;

import java.util.Arrays;

public class Q03 {
    public static void main(String[] args) {

        char arrCh[] = {'a', 'C', 'c', 'A', 'b'};

        Arrays.sort(arrCh);

        System.out.println(Arrays.toString(arrCh));

        //What is the output?

//a) [A, a, b, C, c]

//b) [a, C, c, A, b]

//c) [A, C, a, b, c] ==> this is true because ascii value of capital letter are smaller

//d) [a, b, c, A, C]
    }
}
