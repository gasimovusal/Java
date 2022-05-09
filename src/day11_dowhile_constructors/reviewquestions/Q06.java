package day11_dowhile_constructors.reviewquestions;

public class Q06 {

    public static void main(String[] args) {

        //Which ones of the followings print 0 on the console?
//a)
        int j=1;
        int sum=0;

        while(j==1) { //j=1; j cannot be equal to 2 so code will break

            sum = sum + j; //sum=0+1=1
            j++; //j=1+1=2
        }
        System.out.println(sum); // it will print 1
//b)
        int i=1;
        int product = 0;

        while(j<=4){
            product = product * i; //no matter what i is, 0*i will always be 0
            i++;
        }

        System.out.println(product); // outcome is 0
//c)
        int k=1;
        int num=0;

        while(k<1){ //code will not execute because 1<1 if false
            num=num + k;
            k++;
        }
        System.out.println(sum); //code will not execute so it will print sum which is 0








    }
}
