package day07_string_manipulations.questions;

public class Q02 {

    public static void main(String[] args) {

        //a)
        String a1 = "Hello";
        String a2 = "HELLO";
        System.out.println(a1.equals(a2.toLowerCase()));
        /* a2.toLowerCase() is hello because its all lower case
        a1 is Hello
        Hello is not equal to hello, so it will print FALSE
         */

        //b)
        String b = "Java";
        System.out.println(b.replace('a', 'i'));
        //prints Jivi in the console

        //c)
        String c = "Java";
        System.out.println(c.replace('v', 'J'));
        //prints JaJa

        //d)
        String d = "Hello World!";
        System.out.println(d.toLowerCase().contains("world"));
        /* d.toLowerCase() will convert to hello world!
        contains("world") is true because after converting to lower case, it contains world
        will print true on console because it contains world
         */


    }
}
