package day18_arraylists.reviewquestions;

import java.util.ArrayList;

public class Q02 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");              // [A, B, C, D]


        list.remove(3);  // element at index 3 D will be removed
        list.remove("A");   // element A will be removed [B, C]
        System.out.println(list); // [B, C]

    }
    }

