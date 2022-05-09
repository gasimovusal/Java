package day18_arraylists.reviewquestions;

import java.util.ArrayList;

public class Q07 {
    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<Character>(); // [        ] empty list

        for (char i = 'a'; i <= 'e' ; i++) {

            list.clear(); // clear method will clear the list, it will be empty list every time when you add any value/letter
            list.add(i);
            // adding i , value of i will be [a] - than [b] - than [c] - than [d] - than [e] - loop will be broken after reaching e
        }
        System.out.println(list); // [e]

    }
}
