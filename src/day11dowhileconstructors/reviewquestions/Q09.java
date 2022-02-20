package day11dowhileconstructors.reviewquestions;

public class Q09 {

    public static void main(String[] args) {

        int x = 1, y = 15;

        while (x < 4) {

            y--; //14 ; 13 ; 12
            x++; //2  ; 3  ; 4

        }

        System.out.println(x + ", " + y);
        //                     4,12
    }
}
