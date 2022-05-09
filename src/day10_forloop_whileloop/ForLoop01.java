package day10_forloop_whileloop;

public class ForLoop01 {

    public static void main(String[] args) {

        // Example: Type code to find the sum of the integers from 231

        int sum = 0;
        for(int i=12; i<232; i++){

            sum = sum+i;

        }
        System.out.println(sum); //if you out sout at the end of the loop, you will see final answer,


        int sum1 = 0;
        for(int i1=12; i1<16; i1++){

            sum1 = sum1+1;
            System.out.println(sum1); //if you put sout inside of the loop, you will se sum of the value for every loop
        }


        // Example: type code to find multiplication of the integers from 3 to 5
        int prod = 1; //if you put 0, when you multiply by 0 result will be 0

        for (int i=3; i<6; i++){

            prod = prod*i;

        }
        System.out.println(prod);







    }

}
