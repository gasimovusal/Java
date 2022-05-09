package day17_multi_dimensional_split;

import java.util.ArrayList;
import java.util.List;

public class List04 {

    public static void main(String[] args) {

        //crete an Integer, add 5 elements into it, remove a specific element
        ArrayList<Integer> al6 = new ArrayList<>();
        al6.add(12);
        al6.add(13);
        al6.add(7);
        al6.add(32);
        al6.add(1);
        System.out.println(al6); // [12, 13, 7, 32, 1]

        al6.remove(1);
        // when you have Ingeters to remove, you have to use remove method with index, remove method with element cannot be used
        System.out.println(al6); // [12, 7, 32, 1]

        //how to remove a specific integer element from an integer list

        //1) create an Integer wrapper class object by using the value which you want to remove
        Integer el = Integer.valueOf(32);
        //2) use the created integer object inside the remove()
        al6.remove(el);
        System.out.println(al6);

        //when you see line  ......

        //create a String ArrayList, add 5 elements info it, remove the elements whose length are less than 5

        List<String> al7 = new ArrayList<>();
        al7.add("Ali");
        al7.add("Ahmet");
        al7.add("Mehmet");
        al7.add("Can");
        al7.add("Seljan");
        System.out.println(al7);

        //clone the al7 and use the cloned ArrayList inside the loop
        List<String> clonedAl17 = new ArrayList<>(al7);
        for(String x : clonedAl17){
            if(x.length()<5){
                al7.remove(x);
            }
        }
        System.out.println(al7);



    }
}
