package day11_dowhile_constructors.reviewquestions;

public class Q02 {

    public static void main(String[] args) {


    //Which ones of the followings print 2 4 6 8  on the console?

//a) this will give result 2,4,6,8
    int k = 1;

while(k<=8) {

    if (k % 2 == 0) {

        System.out.print(k + " ");

    }

    k++;
}

//b) this will give result 2,4,6,8

        for(int i=1; i<=8; i++) {

            if(i%2==0) {

                System.out.print(i + " ");

            }

        }

//c) this will give result 2,4,6,8

        int l = 1;

        while(l<5) {

            System.out.print(2*l + " ");

            k++;

        }

//d) this will give result 2,4,6,8

        for(int m=2; m<=8; m=m+2) {

            System.out.print(m + " ");

        }


    }
}
