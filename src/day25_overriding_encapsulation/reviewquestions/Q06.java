package day25_overriding_encapsulation.reviewquestions;

public class Q06 {

    public class C {

        public int x = 11;

        public void m() {

            System.out.println("Good");
        }
    }

    public class B extends C {

        public int x = 12;

        public void m() {

            System.out.println("Bad");
        }
    }

    public class A extends B {

        public static void main(String[] args) {

//            B b = new B(); ==> B is data type, B() is a constructor
//
//            b.m(); => m() is  method
//            ==> when you call a method you should focus on constructor, which is B()
//
//            System.out.println(b.x); ==> x is variable
//            ==> when you call a variable, you should focus on data type of the object, which is B
//
//
//
//            C c = new B();
//
//            c.m();
//
//            System.out.println(c.x);
//
//
//
//            C d = new C();
//
//            d.m();
//
//            System.out.println(d.x);

        }
    }
}
