package day14_ststic_arrays_foreachloop.questions;

public class Q01Try {
    static int a = 10;

    public static void main(String[] args) {

        Q01Try t1 = new Q01Try();
        Q01Try t2 = new Q01Try();

        t1.a = a + 2; //10+2=12
        t2.a = a + 3; // 12+3=15

        System.out.println(t1.a); //15
        System.out.println(t2.a); //15

    }

}

