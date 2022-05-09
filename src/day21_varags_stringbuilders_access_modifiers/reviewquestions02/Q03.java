package day21_varags_stringbuilders_access_modifiers.reviewquestions02;

public class Q03 {

    public static void m3(String x, int... y) {

        int p = 1;

        for(int w: y) {

            p = p * w;

        }

        System.out.print(x);

        System.out.println(p);

    }

    //Which one is false?

//A
//    m3("Result: ",  2,  2.5); ==> you cannot put 2.5 to int, 2.5 is double
//
//    Prints Result: 5 on the console ==> FALSE

//B)
//    m3("Result: "); ==> y will be 0 x will be empty ; because y is e
//
//    Prints Result: 1 on the console ==> TRUE

//C)
//    m3("Result: ", 2);
//
//    Prints Result: 2 on the console ==> TRUE

//D)
//    m3("Result: ",  2,  3,  4);
//
//    Prints Result: 24 on the console


}
