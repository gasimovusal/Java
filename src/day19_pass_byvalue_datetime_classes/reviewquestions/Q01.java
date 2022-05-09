package day19_pass_byvalue_datetime_classes.reviewquestions;

public class Q01 {

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5 };

        int x = 0;

        for (int w : arr) {

            x = x + w * w; // 1*1=1 ; 1+9=10 ; 10+25=35
        }

        System.out.print(x); // 35

    }
}
