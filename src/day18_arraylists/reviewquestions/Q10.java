package day18_arraylists.reviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Q10 {
    public static void main(String[] args) {

        int arr[] = {2, 4, 6, 8}; // [2, 4, 6, 8]

        List<Integer> list = new ArrayList<>(); // [        ]

        int i = 0;

        do {
            list.add(arr[i]); // i is index number; index 0 is 2, 1 is 4, 2 is 6, 3 is 8,
            i++; // i = 0, 1, 2, 3

        } while (i < arr.length); // 0<4, 1<4, 2<4, 3<4, 4<4,

        System.out.println(list); // Converting an array to a list [2, 4, 6, 8]

    }
}
