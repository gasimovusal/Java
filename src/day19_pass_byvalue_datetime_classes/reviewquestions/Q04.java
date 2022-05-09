package day19_pass_byvalue_datetime_classes.reviewquestions;

public class Q04 {

    public static void main(String[] args) {

        int arr[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

        for (int[] w : arr) {

            for (int z : w) { // { 1, 2 }, { 3 }, { 4, 5, 6 }

                System.out.print(z + " "); // 1 2 3 4 5 6

            }
        }

    }
}
