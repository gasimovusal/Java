package day14_ststic_arrays_foreachloop.questions;

public class Q04Try {
    public static void main(String[] args) {
    }

    public static void m1(float x) {
        System.out.println("Method 1");
    }

    public static void m1(int x, double y) {
        System.out.println("Method 2");
    }
}

//m1(33.3); prints Method 1 on the console ==>false
//m1(33.3, 44); prints Method 2 on the console ==>error
//m1(33); prints Method 1 on the console ==true
//m1(33, 44); prints Method 2 on the console
