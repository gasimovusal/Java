package day19_pass_byvalue_datetime_classes.reviewquestions;

public class Q05 {

    public static void main(String[] args) {

        int arr[][] = { { 1, 2 }, { 3 }, { 4, 5, 6 } };

        int x = 0;

        for (int[] w : arr) {

            for (int z : w) { // [ 1, 2 ], { 3 }, { 4, 5, 6 }

                x = x + z; // 0+1=1 ; 1+2=3 ; 3+3=6 ; 6+4=10 ; 10+5=15 ; 15+6=21

            }
        }
        System.out.println(x); // 21

    }
}
