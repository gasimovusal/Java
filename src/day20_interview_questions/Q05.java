package day20_interview_questions;

public class Q05 {

    public static void main(String[] args) {



            int num = 10;
            do {
                System.out.print(num-- + " "); // 10 after printing 10 it will dicrease to 9

            } while (--num == 0); // 8 since it was 9 before it will print 8

            System.out.println(num); // 10 8
        }

    }

