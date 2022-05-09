package day25_overriding_encapsulation.reviewquestions02;

public class Q01 {
    public class A {

        int i = 11;

        public void display() {

            System.out.println(i);

        }

    }


    class B extends A {

        int i = 12;

        public void display() {

            System.out.println(i);

        }

    }

//    Which one is false?
//
//    A
    public class C {

        public void main(String args[]) {

            A obj3 = new A();

            obj3.display();

            System.out.println(obj3.i);

        }

    }

//    The output is 11
//
//            11
//
//    B
//    public class C {
//
//        public static void main(String args[]) {
//
//            B obj1 = new B();
//
//            obj1.display();
//
//            System.out.println(obj1.i);
//
//        }
//
//    }
//
//    The output is 12
//
//            12
//
//    C
//    class C {
//
//        public static void main(String args[]) {
//
//            B obj4 = new A();
//
//            obj4.display();
//
//            System.out.println(obj4.i);
//
//        }
//
//    }
//
//    The output is 11
//
//            11
//
//    D
//    public class C {
//
//        public static void main(String args[]) {
//
//            A obj2 = new B();
//
//            obj2.display();
//
//            System.out.println(obj2.i);
//
//        }
//
//    }
//
//    The output is 12
//
//            11
}
