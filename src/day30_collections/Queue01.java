package day30_collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

    public static void main(String[] args) {

        Queue<String> q1 = new LinkedList<>();
        q1.add("A"); // this method can give you exception if your data is full and cannot accept new element
        System.out.println(q1.offer("B"));
        // adding element this way is more preferable because this will show you "tru" or "false" and you will know if new element is added to memory or not
        System.out.println(q1);

        // if your memory is full, "add" method will trow exception, but "offer" method will give you "false"

        //this will be learnt while Lambda instructions
        Queue<String> q2 = new PriorityQueue<>();
    }
}
