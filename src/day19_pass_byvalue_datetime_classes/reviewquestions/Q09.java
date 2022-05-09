package day19_pass_byvalue_datetime_classes.reviewquestions;

import java.util.ArrayList;
import java.util.List;

public class Q09 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(21);
        list.add(22);
        list.add(23);

       // Which ones of the followings are true?
//A
        int count = 0;

        for(int w : list) {

            count++; // counter=1; counter=2; counter=3;
            // if "if loop" is TRUE, it will continue next one, it will not print ; if "if loop" is FALSE, it will continue and print on the console

            if(count==2) { // 1==2 false ; 2==2 ; 3==2 false

                continue;
            }
            System.out.print(w + " "); // 21 23
        }
//                  Prints 21 23 on the console     TRUE

//B
        int count1=0;

        for(int w : list) {

            count1++; //  1 ; 2 ; 3

            if(count1<3) { // 1<3 ; 2<3 ; 3<3 false

                System.out.print(w + " "); // 21 22
            }
        }
//                  Prints 21 22 on the console     TRUE

//C
        int count2 = 0;

        for(int w : list) {

            System.out.print(w + " "); // 21 22

            count2++; // 1 ; 2 ; 3

            if(count2==2) { // 1==2 ; 2==2 true

                break;
            }
        }
        //      Prints 21 22 on the console     TRUE
    }
}
