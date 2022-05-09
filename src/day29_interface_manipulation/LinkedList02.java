package day29_interface_manipulation;

import java.util.LinkedList;

public class LinkedList02 {

    public static void main(String[] args) {

        LinkedList <Integer> ll3 = new LinkedList<>();
        ll3.add(0, 12);
        ll3.add(1, 13);
        ll3.add(2, 10);
        ll3.add(3, 11);

        System.out.println(ll3);

        Integer first1 = ll3.remove(); // retrieve the fist element and will remove it from the list
        System.out.println(first1);
        System.out.println(ll3);
        System.out.println("==================");

        Integer first2 = ll3.remove(2);
        System.out.println(first2);
        System.out.println(ll3);

        ll3.add(13);
        ll3.add(10);
        ll3.add(13);
        System.out.println(ll3);
        ll3.removeFirstOccurrence(13);
        System.out.println(ll3);

        ll3.removeLastOccurrence(13);
        System.out.println(ll3);



    }
}
