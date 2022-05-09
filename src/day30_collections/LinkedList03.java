package day30_collections;

import java.util.LinkedList;

public class LinkedList03 {

    /*
    Arrays - I have 10 people names in data
    List - I have unknown number of people that are in same class
    Sets - I need to have just unique SSN
    Maps - I need to have people names and last names as key value pairs
     */

    public static void main(String[] args) {

        LinkedList<Integer> ll3 = new LinkedList<>();
        ll3.add(0, 12);
        ll3.add(1, 13);
        ll3.add(2, 10);
        ll3.add(3, 11);

        System.out.println(ll3);

        Integer first1 = ll3.remove(); // retrieve the fist element and will remove it from the list
        System.out.println(first1);
        System.out.println("==================");

        Integer first2 = ll3.remove(2);
        System.out.println(first2);
        System.out.println("==================");

        ll3.add(13);
        ll3.add(10);
        ll3.add(13);
        System.out.println(ll3);
        ll3.removeFirstOccurrence(13);
        System.out.println(ll3);
        System.out.println("==================");

        ll3.removeLastOccurrence(13);
        System.out.println(ll3);
        System.out.println("==================");

        LinkedList<Integer> ll4 = new LinkedList<>();

        ll4.add(3);
        ll4.add(12);
        ll4.add(13);

        System.out.println(ll4);
        System.out.println("==================");

        ll3.removeAll(ll4);
        System.out.println(ll3);
        System.out.println("==================");

        System.out.println(ll4);
        ll4.addAll(ll4);
        System.out.println(ll4);
        System.out.println("==================");

        ll4.addAll(1, ll3);
        System.out.println(ll4);
        System.out.println("==================");

        ll4.addFirst(100);
        ll4.addLast(900);
        System.out.println(ll4);
        System.out.println("==================");

        ll4.set(4, 200); // replace index 4 with 200
        System.out.println(ll4);
        System.out.println("==================");






    }
}
