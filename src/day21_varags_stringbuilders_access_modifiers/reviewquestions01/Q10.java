package day21_varags_stringbuilders_access_modifiers.reviewquestions01;

public class Q10 {

    public static void main(String[] args) {

        int[][] x = {{1, 2}, {3, 4, 5}};

        System.out.println(m(x));

    }

    public static int m(int[][] m) { // [[1, 2], [3, 4, 5]]

        int result = 3;

        for (int i = 0; i < m.length; i++) { // i<2 2 is length

            for (int j = 0; j < m[i].length; j++) {

                result += m[i][j];
                //   3 + m[0][0] ==> 3+1=4
                //   4 + m[0][1] ==> 4+2=6
                //   6 + m[1][0] ==> 6+3=9 .....

            }
        }
        return result;
    }


}
