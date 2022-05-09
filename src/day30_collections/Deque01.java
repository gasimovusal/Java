package day30_collections;

import java.util.Deque;
import java.util.LinkedList;

public class Deque01 {

    public static void main(String[] args) {

        /*
        Deque - Last In-First Out
        Queue - First In-First Out (for examples bank, last customer is taking care of most)
         */

        Deque<String> dq1 = new LinkedList<>();

        dq1.add("A");
        dq1.addFirst("B"); // adding B beginning of the list
        System.out.println(dq1);

        dq1.addFirst("C"); // adding C beginning of the list
        dq1.addLast("D"); // adding D end of the list
        dq1.add("X"); // adding E end of the list
        System.out.println(dq1);
    }
}
