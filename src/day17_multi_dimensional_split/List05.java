package day17_multi_dimensional_split;

import java.util.ArrayList;

public class List05 {

    public static void main(String[] args) {

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(21);
        list1.add(18);
        list1.add(65);
        list1.add(4);
        list1.add(12);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(98);
        list2.add(99);

        list1.addAll(list2);
        System.out.println(list1);

        list2.addAll(list1);
        System.out.println(list2);

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(111);
        list3.add(222);

        list2.addAll(4, list3);
        System.out.println(list2); // [98, 99, 21, 18, 111, 222, 65, 4, 12, 98, 99]

        list2.removeAll(list1);
        System.out.println(list2); // [98, 99, 21, 18, 65, 4, 12, 98, 99] will be removed from [98, 99, 21, 18, 111, 222, 65, 4, 12, 98, 99]
        //output will [111, 222]

        boolean b1 = list1.contains(98);
        System.out.println("Is 98 exist?" + b1);

        list2.clear();
        System.out.println(list2);

        list1.set(5, 999);
        System.out.println(list1);


    }
}
