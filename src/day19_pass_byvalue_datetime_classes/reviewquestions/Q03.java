package day19_pass_byvalue_datetime_classes.reviewquestions;

public class Q03 {

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 7, 9 };

        for (int w : arr) {

            System.out.print(w + " "); // 1 3 5

            if(w>4) { // 1>4 ; 3>4 ; 5>4

                break; // after putting 5, it will be false and code will break
            }
        }



    }
}
