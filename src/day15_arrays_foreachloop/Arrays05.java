package day15_arrays_foreachloop;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

        //how to check an element if it exists in an array or not
        int arr[] = {32, 14, 2, 11};
        //1. WAY
        for(int w : arr){
            if(w==14){
                System.out.println(w + " exists");
                break; //after finding 3, no need to run the loop for other elements, we put break
            }
        }

        //2. way:
        /*binarySearch() method returns the index of existing element
        "NOTE": to use binarySearch() method, you HAVE TO use sort() method otherwise the output will not be meaningful
        binarySearch() method returns the order number with negative sign for non-existing elements
        do not use binarySearch() method for repeated elements, it does not give correct answer every time.
         */
        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 14)); //result will be index number
        System.out.println(Arrays.binarySearch(arr, 8)); //result will be -2
    }
}
