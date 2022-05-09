package day17_multi_dimensional_split;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {

        // multidimensional array ==> array inside the array

        // [ [3, 5], [11, 9], [7, 12] ] ==> 2 dimensional array ==> we will use it most
    //index   0  1    0   1    0  1
    // index    0,      1,      2
        //[ [[1], [2]], [[3], [4]] ] ==> 3 dimensional array

        //if elements of an array are array its called multidimensional array

        //1) if you use arrays as elements in an array, it is called multidimensional array

        //how to create multidimensional array ==> [ [11, 9], [5, 4], [1, 21] ]
        int mda1[][] = new int[3][2];
        //inner array must have same
        //first [] type number of outer array, second [] type number ofinner array

        //how to print multidimensional array on the console ==> deepToTring
        System.out.println(Arrays.deepToString(mda1));

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



    }
}
