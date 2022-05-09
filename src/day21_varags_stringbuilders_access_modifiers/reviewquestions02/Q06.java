package day21_varags_stringbuilders_access_modifiers.reviewquestions02;

public class Q06 {

    static void m2(String str, int... a) {

        System.out.println(str);

        for (int i : a) {

            System.out.print(i + " ");

        }

        System.out.println();

    }

    public static void main(String args[]) {
// *********************************

//        Which ones are true if you type the following codes instead of ********** ?
//
//        A
//        m2(100, 101, "102");
//
//        Gives Compile Time Error
//
//        B
//        m2("Java", 101, 102);
//
//        The output is Java
//
//        101 102
//
//        C
//        m2(100, 101, 102);
//
//        The output is 100
//
//        101 102
//
//        D
//        m2(101, 102);
//
//        The output is 101 102
    }
}
