package day14_ststic_arrays_foreachloop.questions;

public class Test1 {

    int y = 5; //instance variable
    static int x = 7; //static variable

    public static void main(String[] args) {

        Test1 t1 = new Test1(); //==> y=5
        Test1 t2 = new Test1(); //==> y=5

        t1.x = 17; //==> x changed from 7 to 17
        t1.y = 15; //==> y changed to 15

        System.out.print(t1.x + " "); // x is 17 because it was changed from 7 to 17
        System.out.println(t2.x); // x is 17 because it was changed from 7 to 17

        System.out.print(t1.y + " "); // y is 15
        System.out.println(t2.y); // y is 5

        //output is: 17 17
        //           15 5


    }
}
