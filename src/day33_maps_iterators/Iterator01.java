package day33_maps_iterators;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Iterator01 {

    public static void main(String[] args) {

        List<String> list1 = new LinkedList<>();

        list1.add("A");
        list1.add("B");
        list1.add("C");

        for(String w : list1){

            w = w + "EEE"; // you cannot add item

            //list.add(w + "AA" -> you cannot add item
        }
        System.out.println(list1 + " list not updated");

        ListIterator list1Iter = list1.listIterator();

        while(list1Iter.hasNext()){

            Object element = list1Iter.next(); // this code takes elements one by one instead of one whole list
            list1Iter.set(element + "EEE"); //when we use iterator, we can modify all element of list at same time
            // we cannot do modification with for each loop but we can read the data
        }

        System.out.println(list1);

        ListIterator list2Iter = list1.listIterator();

//        while(list2Iter.hasNext()){
//
//            Object element = list2Iter.next();
//
//            if(element.toString().equalsIgnoreCase("C")) {
//                list2Iter.remove();
//            }
//        }
//        System.out.println(list1);


        while (list2Iter.hasPrevious()){

            Object element = list2Iter.previous();
            System.out.println(element);
        }
    }
}
