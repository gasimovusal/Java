package day14ststicarraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    /*Arrays structure is reserved area and inside the reserve are you can put many data
    you may store multiple data but they should be same data type
    you cannot store int, string, etc in Arrays because they are different data type
    to create an Array, you must inform Java about number of data you want to store in Array
    if you dont tell number of data to store Array, java will not create Array
     */

    public static void main(String[] args) {

        int myArray[] = new int[5];
        /* int [] my Array also works
        if you put [] java will understand ints not primitive, its an Array
        typing 5 inside [5], java will understand that you wll create 5 data
         */

        //how to print Array
        System.out.println(Arrays.toString(myArray)); //output will be [0, 0, 0, 0, 0]
        //           type Arrays .

        //how to assign a value to specific Array element: using index number
        myArray[1]=11;
        System.out.println(Arrays.toString(myArray)); //output will be [0, 11, 0, 0, 0]

        myArray[3]=12;
        System.out.println(Arrays.toString(myArray)); //output will be [0, 11, 0, 21, 0]

        myArray[4]=1;
        System.out.println(Arrays.toString(myArray)); //output will be [0, 11, 0, 21, 1]

        myArray[0]=41;
        myArray[2]=31;
        System.out.println(Arrays.toString(myArray));

        //how to print specific element on the console
        System.out.println(myArray[2]); //output is 31

        //how to get the number of elements in an array
        //note: we were using "length()" in String Class, we will use "length" in Arrays Class
        System.out.println(myArray.length); //output is 5

    }

}
