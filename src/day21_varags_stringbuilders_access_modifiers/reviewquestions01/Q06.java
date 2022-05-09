package day21_varags_stringbuilders_access_modifiers.reviewquestions01;

public class Q06 {

    public static void main(String[] args) {

        int a[] = {1, 2};

        int b[] = {3, 2, 1};



        for(int w : a) { // 1, 2

            for(int m : b) { // 3, 2, 1

                System.out.print(w + m + " ");
                //               1 + 3 = 4
                //               1 + 3 = 4
                //               1 + 3 = 4
                //               1 + 3 = 4
                //               1 + 3 = 4

            }

        }
    }
}
