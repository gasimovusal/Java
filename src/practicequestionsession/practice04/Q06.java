package practicequestionsession.practice04;

import java.util.ArrayList;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {

        /*
             Remove duplicates from ArrayList.
             Logic:
             Create a new list, then transfer the elements
              i) if they are not repeated
              ii) if an element is repeated transfer it just once
              [2, 3, 2, 2, 5] ==>  [2, 3, 5]
         */

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(2);
        list1.add(2);
        list1.add(5);
        System.out.println(list1); // [2, 3, 2, 2, 5]

        List<Integer> list2 = new ArrayList<>();

        for ( Integer w : list1){ // 2, 3, 2, 2, 5

            if(!list2.contains(w)){ // if list 2 does not contain 2 = T; 3 = T, 2 = F; 2 = F; 5 = T
                 list2.add(w); //

            }
        }
        System.out.println(list2); // [2, 3, 5]






    }
}
