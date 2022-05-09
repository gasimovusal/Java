package day19_pass_byvalue_datetime_classes;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {

    public static void main(String[] args) {

        Integer arr[] = {3, 4, 5, 6};

        //when you create a list from array by using "asList()", the list will be fixed in length
        List<Integer> list = Arrays.asList(arr);

        /*
        try to remove an element from list ==> you cannot remove element because length will change and you cannot change the length

        list.remove(1);
        System.out.println(list);

        try to add element into the list ==> you cannot add element because length will change and you cannot change the length
        list.add(7);
        System.out.println(list);

        try to delete all elements from the list ==> you cannot delete all element because length will change and you cannot change the length
        list.clear();
        System.out.println(list);
         */
    }
}
