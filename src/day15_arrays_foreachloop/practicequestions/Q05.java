package day15_arrays_foreachloop.practicequestions;

public class Q05 {

            static int a = 11;

            public static void main(String[] args) {

                int b = 12; // it will print 12 second because static values print first
                System.out.println(b);
            }

            static{ // it will print 13 first because static values print first
                a = 13;
                System.out.println(a);
            }

        //What is the output?

// a)   12
//      13

// b)   11
//      13

// c)   11
//      12

// d)   13    correct answer
//      12


    }

