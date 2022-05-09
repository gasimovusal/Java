package day17_multi_dimensional_split;

import java.util.Arrays;

public class MultiDimensionalArray02 {

    public static void main(String[] args) {

        //how to create multidimensional array ==> [ [11, 9], [5, 4], [1, 21] ]
        int mda1[][] = new int[3][2];

        //how to assign values
        mda1[0][1] = 9;
        mda1[0][0] = 11;
        mda1[1][0] = 5;
        mda1[1][1] = 4;
        mda1[2][1] = 21;
        mda1[2][0] = 1;
        System.out.println(Arrays.deepToString(mda1));

        //how to create multidimensional array in short way

        int mda2[][]= {{2,3}, {12}, {21, 34, 56}, {4}};
        System.out.println(Arrays.deepToString(mda2));

        //how to print a specific inner array on the console
        System.out.println(Arrays.toString(mda2[2])); // 22, 34, 56


        //hot to find the number of elements in a multidimensional array?

        int sum = 0;

        for(int[] w: mda2){
            sum = sum + w.length;
        }
        System.out.println(sum);
    }
}
