package day19_pass_byvalue_datetime_classes.reviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Q06 {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();

        list1.add(21);
        list1.add(22);
        list1.add(23);
        list1.add(24);

        for (int w : list1) {

            if (w % 2 == 0) { //21 % 2 == 0 F ; 22 % 2 == 0 T ; 23 % 2 == 0 F ; 24 % 2 == 0 T

                continue;
                // if "if loop" is TRUE, it will continue next one, it will not print ; if "if loop" is FALSE, it will continue and print on the console
            }
            System.out.print(w + " "); // 21 23
        }



    }
}
