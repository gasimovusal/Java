package day15_arrays_foreachloop.practicequestions;

import java.util.Arrays;

public class Q10 {

    public static void main(String[] args) {

        char arr[] = new char[4];

        arr[0] = 'A';
        arr[2] = 'E';
        arr[3] = 'M';

        System.out.println(Arrays.toString(arr));

//      What is the output?

// a)   [A, 0, E, M]

// b)   Gives Compile Time Error

// c)   [A, , E, M] ==> correct answer

// d)   [A, E, M]

    }
}
