package day13statickeywordvariabletypes.reviewquestions;

public class Q09 {

    public class Test01 {

        public static void main(String s[]) {

            go();

            go(12);

            go(5 >= 5);

        }

        public static void go() {
            System.out.println("Bad"); //==> output is Bad
        }

        public static void go(double i) { //=> i wil 12 double can be 12
            System.out.println("Good"); //it will print Good

        }

        public static void go(boolean b) { // b is true

            if (b) { //b is true

                System.out.println("The best");

            } else {

                System.out.println("The worst");

            }

        }

    }

    //If the methods are in the same class what is the output?
    //Bad
    //
    //Good
    //
    //The worst
}
