package day17_multi_dimensional_split;

import java.util.ArrayList;
import java.util.List;

public class List03 {

    public static void main(String[] args) {

        //how to check if an ArrayList has space in it

        List<String> al4 = new ArrayList<>();
        al4.add(" ");
        al4.add("a");

        for (String w : al4) {
            if (w.equals(" ")) {
                System.out.println("There is space");
                break;
            }
        }

            //create a string arraylist, add 5 elements into it, remove a specific element

            List<String> al5 = new ArrayList<>();
            al5.add("Ali");
            al5.add("Ahmet");
            al5.add("Mehmet");
            al5.add("Can");
            al5.add("Seljan");

            al5.remove("Ahmet"); // you are removing object, it will return boolean; true==>mission completed,; false==> mission failed
            System.out.println(al5);

            //how to remove an element by index
            al5.remove(1); // remove Mehmet // it will return the removed element to double check
            System.out.println(al5);


        }
    }

