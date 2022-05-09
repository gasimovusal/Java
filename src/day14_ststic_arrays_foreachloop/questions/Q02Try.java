package day14_ststic_arrays_foreachloop.questions;

public class Q02Try {
    int a = 10;

    public static void main(String[] args) {

        Q02Try t1 = new Q02Try();
        Q02Try t2 = new Q02Try();


        t1.a = 12; //a changes from 10 to 12
        t2.a = 13;// a changes from 10 to 13

        System.out.println(t1.a); //12
        System.out.println(t2.a); //13
    }
}
