package day12constructordmethodoverloadingvariabletypes.reviewquestions;

public class Q03 {

    public static void main(String[] args) {


        //Which output is same with the given program's output?
        int num = 1;

        do {

            System.out.print(num + " "); //==> will print 1

            num++;

        } while (num < 2); //will not print anything

//output is 1

//a)
        int a=1;

        while(a<=1) {

            System.out.print(a + " "); //will print 1

            a++;

        }

        //output is 1

//b)
        int b=1;

        while(b<2) {

            System.out.print(b + " "); //will print only 1

            b+=1;

        }

        //output is 1

//c)

        for(int i=1; i<2; i++){

            System.out.print(i + " "); // will print 1

        }

        //output is 1

    }
}
