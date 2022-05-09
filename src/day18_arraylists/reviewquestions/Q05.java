package day18_arraylists.reviewquestions;

import java.util.ArrayList;

public class Q05 {
    public static void main(String[] args) {

        int arr[] = new int[5]; // [0, 0, 0, 0, 0]
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i <= arr.length; i++) { // loop starts from 1 and ends in 5

            list.add(i); // i will be 1, 2, 3, 4, 5

        }
        System.out.println(list); // [1, 2, 3, 4, 5]

    }
}
