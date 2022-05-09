package day33_maps_iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class practice {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("d");
        list.add("e");

        ListIterator<String> listItr = list.listIterator();

        while (listItr.hasNext()) {

            Object obj = listItr.next();
            System.out.print(obj + " ");
        }
        System.out.println();

        while(listItr.hasPrevious()){

            Object obj = listItr.previous();
            System.out.print(obj + " " );
        }
    }
}
