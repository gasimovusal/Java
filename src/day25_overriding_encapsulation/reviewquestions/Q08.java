package day25_overriding_encapsulation.reviewquestions;

public class Q08 {

    public class School {

        String name = "School";

        public void grade() {

            System.out.println("S");

        }

    }



    public class Room extends School {

        String name = "Class";

        public static void main(String[] args) {

//         *********************
//
//            obj1.grade();

        }

        public void grade() {

            System.out.println("C");

        }

    }

//    Which ones are true if the followings are typed instead of *********************
//
//    A
//    School obj1 = new School();
//
//    The output is S
//
//    B
//    School obj1 = new School();
//
//    The output is C
//
//    C
//    Room obj1 = new Room();
//
//    The output is C
//
//    D
//    Room obj1 = new Room();
//
//    The output is S
}
