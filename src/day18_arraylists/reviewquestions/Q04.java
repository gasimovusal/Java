package day18_arraylists.reviewquestions;

import java.util.ArrayList;

public class Q04 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");          // [A, B, C, D]

        for (int i = 0; i < list.size(); i++) { //loop starts from 0

            System.out.print(list.get(i) + " ");    //A B C D
            //                       0      A
            //                       1      B
            //                       2      C
            //                       3      D

        }

    }
}
