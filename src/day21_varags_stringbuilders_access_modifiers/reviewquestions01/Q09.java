package day21_varags_stringbuilders_access_modifiers.reviewquestions01;

public class Q09 {


        public static void main(String[] args) {

            int[][] x = {{2, 1}, {1, 7, 1}};

            System.out.println(m(x[1])); // will print first index [1, 7, 1]
        }

        public static int m(int[] m) { // [1, 7, 1]

            int result = 0;

            for (int i = 0; i < m.length; i++){

                result += m[i];

            }
            return result;
        }



    }

