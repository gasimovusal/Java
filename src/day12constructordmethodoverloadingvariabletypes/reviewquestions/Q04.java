package day12constructordmethodoverloadingvariabletypes.reviewquestions;

public class Q04 {

    public static void main(String[] args) {

        int numA=4;

        while(numA<3) { //4<3 so it will not print anything

            System.out.print(numA);

            numA++;

        }



        int numB=4;

        do {

            System.out.print(numB); // will print 4

            numB++; //4+1=5

        }while(numB<3); //5<3 is false
    }
}
