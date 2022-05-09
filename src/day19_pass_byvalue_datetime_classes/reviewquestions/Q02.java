package day19_pass_byvalue_datetime_classes.reviewquestions;

public class Q02 {

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 7, 9 };

        for (int w : arr) {

            if(w<4) { // 1<4 T ; 3<4 T ; 5<4 F ; 7<9 F ; 9<4 F

                continue;
      // if "if loop" is TRUE, it will continue next one, it will not print ; if "if loop" is FALSE, it will continue and print on the console
            }
            System.out.print(w + " "); // 5 7 9
        }

    }
}
