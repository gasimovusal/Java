package day15_arrays_foreachloop.practicequestions;

import java.util.Arrays;

public class Q07 {

    public class Try {

        public static void main(String[] args) {

            int arr[] = new int[3];
            System.out.println(arr[1]); // output [0 ,0 ,0] will print 0

            arr[0] = 11;
            arr[1] = 12;
            System.out.println(Arrays.toString(arr)); //output [11, 12, 0]

        }

    }

//    What is the output?

// a) Gives Compile Time Error
//
// b) 0             corrent answer
//    [11, 12, 0]

// c) 0
//    [11, 12]

// d) [0, 0, 0]
//    11
//    12

}
