package day14_ststic_arrays_foreachloop.questions;

public class StaticDemo {

    int num1 = 5;
    static int num2 = 7;

    public static void main(String args[]) {

        StaticDemo s1 = new StaticDemo();
        StaticDemo s2 = new StaticDemo();

        s1.num1 = 13; //num1 is changed from 5 to 13
        s1.num2 = 23; //num2 is changed from 7 to 23, and then it changed 23 to 43

        s2.num1 = 33; //num1 is changed from 5 to 33
        s2.num2 = 43;//num2 is changed from 23  to 43

        System.out.println(s1.num1 + " " + s1.num2 + " " + s2.num1 + " "+ s2.num2);
        //                   13             43              33              43

    }
}
