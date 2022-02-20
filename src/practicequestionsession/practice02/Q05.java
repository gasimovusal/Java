package practicequestionsession.practice02;

public class Q05 {

    public static void main(String[] args) {

        /*
Type a program to check if a positive number is perfect or not
For example if the number is 6, we should see because 6/1=6; 6/2=3; 6/3=2   1+2+3=6
Perfect Number
on the console.
(The factors of 6 are : 1,2,3,6
1+2+3=6  ==> it is perfect number )
*/

        /*1) find factors
        2) sum of factors
        3) sum == number
         */

        int num = 6;
        int sum = 0;
        for(int i=1; i<num; i++){

            if(num%i == 0){
                System.out.println(i + " ");
                sum = sum + 1;
            }
        }

        if(sum==num){
            System.out.println("perfect number");
        }else{
            System.out.println("not a perfect number");
        }


    }
}
