package day11dowhileconstructors.reviewquestions;

public class Q10 {

    public static void main(String[] args) {

        int m = 10;
        int n = 2;
        int sum = 0;

        while(m > n) {

            m--;              //9  ; 8         ; 7
            n = n + 2;        //4  ; 4+2=6     ; 6+2=8
            sum = sum + m + n;//13 ; 13+8+6=27 ; 27+7+8=42
        }

        System.out.println(sum); //output will be 42

    }
}
