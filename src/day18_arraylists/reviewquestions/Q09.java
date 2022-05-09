package day18_arraylists.reviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Q09 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);            // [3, 5, 7, 9]

        int i = 0;
        int x = 0;

        while(i<list.size()) { //0<4, 1<4, 2<4, 3<4, 4<4

            x = x + list.get(i); //i is index number: 0+3=3; 3+5=8; 8+7=15; 15+9=24
            i++; // i = 1 ; i = 2 ; i = 3 ; i = 4 ;
        }
        System.out.println(x); // 24

    }
}
