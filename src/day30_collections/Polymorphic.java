package day30_collections;

import java.util.LinkedList;
import java.util.List;

public class Polymorphic {
    public static void main(String[] args) {

        List<String> list1 = new LinkedList<>();
        list1.add("A");
        list1.add("B");

        List<String> list2 = new LinkedList<>();
        list2.add("A");
        list2.add("B");

        System.out.println(list1);
        System.out.println(list2);

    }
}
