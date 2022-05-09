package day18_arraylists.reviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Q06 {

        List<String> list1 = new ArrayList<String>(); // [    ] empty at the beginning

        public static void main(String[] args) {

            Q06 obj1 = new Q06();
// list is outside the main method, my method is outside. to access something outside the main method, you need to create an object, you are accessing to non-static
//if you create something outside the main method, you have 2 options: static or non-static
            obj1.myMethod(obj1.list1); // calling the method, it will put [x, y] tp the list

            obj1.list1.add("z"); //adding z to list [x, y, z]
            obj1.list1.add("t"); //adding t to list [x, y, z, t]

            System.out.println(obj1.list1);
        }

        public List<String> myMethod(List<String> list1) {

            list1.add("x");
            list1.add("y");

            return list1;

        }

    }

