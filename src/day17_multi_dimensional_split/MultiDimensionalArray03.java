package day17_multi_dimensional_split;

import java.util.Arrays;

public class MultiDimensionalArray03 {

    public static void main(String[] args) {

        String arr1[][] = { {"learn", "java", "it"}, {"is", "easy"} };
        //Print the elements which have “a” from a 2 dimensional String array

        for(String[] w : arr1){ // w will be [learn, java, it] and [is, easy]

            for(String m : w){ //java will check learn, java, it and is, easy

                if(m.contains("a")){
                    System.out.print(m + " ");
                }
            }
        }

        //convert arr1 tp one dimensional array ==> { {"learn", "java", "it"}, {"is", "easy"} } ==> { "learn", "java", "it", "is", "easy" }

        //find the total number of elements in an array
        int sum = 0;

        for(String[] w : arr1){     //{"learn", "java", "it"} ==>3  ;  {"is", "easy"} ==>2
            sum = sum + arr1.length;  //sum = 0 + 3 = 3        ==>      sum= 3 + 2 = 5
        }
        //create a one-dimensional array whose length equals to the total number of elements in arr1
        String newArr[] = new String[sum];   // {null, null, null, null, null}

        //transfer elements from arr1 to newArr
        int idx = 0;
        for(String[] w: arr1){ // { {"learn", "java", "it"}, {"is", "easy"} }
            for(String m : w){  // { "learn", "java", "it", "is", "easy" }
                newArr[idx] = m;
                idx++; // idx=1; dix=1; dix=3; idx=4; idx=5
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
