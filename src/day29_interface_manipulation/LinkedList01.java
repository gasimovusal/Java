package day29_interface_manipulation;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();
        ll1.add("Ali");
        ll1.add("Can");
        ll1.add("Mark");
        ll1.add("Tom");

        System.out.println(ll1);
        String firstElement = ll1.element(); //return first element fo the list (copy + paste)
        System.out.println(firstElement); //printing first element
        System.out.println(ll1);

        System.out.println("==========================");

        String firstElement2 = ll1.poll(); // returns first element but removing the element from the list (cut + paste)
        System.out.println(firstElement2);
        System.out.println(ll1);

        System.out.println("==========================");

        String firstElement3 = ll1.peek(); // returns the first element without removing the element (copy + paste)
        System.out.println(firstElement3);
        System.out.println(ll1);

        LinkedList<String> ll2 = new LinkedList<>();

        System.out.println(ll2.peek()); // return null (returning string value)

        try{
            System.out.println(ll2.element()); // return NoSuchElementException
        } catch(NoSuchElementException e){
            System.out.println(e.getMessage());
        }

        System.out.println(ll2.poll()); // null



    }
}
