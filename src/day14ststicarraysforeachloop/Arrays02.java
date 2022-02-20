package day14ststicarraysforeachloop;

import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        int myArray[] = new int[5];
        myArray[1]=11;
        myArray[3]=21;
        myArray[4]=1;
        myArray[0]=41;
        myArray[2]=31;
        System.out.println(Arrays.toString(myArray)); // [41, 11, 31, 21, 1]

        //print the sum of the first and last element in an array on the console
        int firstElement = myArray[0];
        int indexOfLastElement = myArray.length-1;
        int lastElement = myArray[indexOfLastElement];
        System.out.println(firstElement + lastElement); // output will be 42 ==> 41+1

        //find the sum of all elements in Array
        int sum = 0;
        for(int i=0; i<myArray.length; i++){
            sum = sum + myArray[i];
        }
        System.out.println(sum);

        //use for-each-loop. for-each-loop can be used with collections and arrays
        int sum2 = 0;
        for (int w : myArray){ // java understand that if elements end, loop will get broken
            sum2 = sum2 + w;
        }
        System.out.println(sum2);
    }
}
