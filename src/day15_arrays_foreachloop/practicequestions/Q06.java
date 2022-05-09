package day15_arrays_foreachloop.practicequestions;

public class Q06 {

        static int a = 11;

        public static void main(String[] args) {

            int b = 12;
            System.out.println(b);
        }

        static{
            int c = 13;
            System.out.println(c);
        }

        static{
            a = 14;
            System.out.println(a);
        }

    }

    //What is the output?

// a)   12
//      14
//      13

// b)   13  correct answer
//      14
//      12

// c)   13
//      11
//      12

// d)   12
//      13
//      14
