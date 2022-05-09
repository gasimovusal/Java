package day25_overriding_encapsulation.reviewquestions02;

public class Q10 {

    public class A extends B{

        int age = 11;

        public static String sing(){

            return "fa";

        }

        public static void main(String[] args){

//            //A a = new A();
//
//            B b = new B();
//
//            System.out.println(a.sing() + " " + b.sing());
//
//            System.out.println(a.age + " " + b.age);

        }

    }

    class B {

        int age = 12;

        public static String sing(){

            return "la";

        }

    }

    //What is output?
}
