package day11dowhileconstructors.reviewquestions;

public class Q07 {

    public static void main(String[] args) {

        for(int i=1; i<=5; i++) {

            for(int j=(5-i); j>1; j--) {

                System.out.print(i+j); //1+4=5; 1+3=4; 1+2=3
                                       //2+3=5; 2+2=4
                                       //3+2=5;

            }

            System.out.println();

        }

       /* What is the output? ==> 543
                                  54
                                  5

        */
    }
}
