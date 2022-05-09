package day21_varags_stringbuilders_access_modifiers.reviewquestions01;

public class Q05 {
    public static void main(String[] args) {


        for (int i = 1; i < 4; i++) {

            for (int k = 3; k > 1; k--) {

                System.out.println(i + "==>" + k);

            }

        }

        /* output is :
        1==>3
        1==>2
        2==>3
        2==>2
        3==>3
        3==>2
         */
    }
}
