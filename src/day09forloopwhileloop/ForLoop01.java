package day09forloopwhileloop;

public class ForLoop01 {

    public static void main(String[] args) {

        //Type code to print 5 times "Hello!" on yhe console
        /* typing same code 5 times is not the right way in java, repetition is not good
        Java created 4 different ways for repetition/loop structure: 1. for-loop 2. while-loop 3. do-while-loop 4. for-each-loop
        1. for loop - for(int=start from 1; stop when reaching to 5; increase by 1)
         */
        for(int i=1; i<6; i+=1){
            System.out.println("Hello!");
        }

        //type all integers from 11 to 44 in the same line with a space between consecutive integers
        for(int i=11; i<45; i+=1){
            System.out.print(i + " "); //if you do not put ln it will print in same line
        }

        System.out.println(" ");//that's just extra code to seperate

        //type even integers from 11 to 44 in the same line with a space between consecutive integers
        for(int i=11; i<45; i+=1){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

        System.out.println(" ");

        //type odd integers from 11 to 44 in the same line with a space between consecutive integers
        for(int i=68; i>12; i-=1){
            if(i%2!=0){
                System.out.print(i + " ");
            }
            System.out.println(" ");

        //type all intehers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space between integers
        for(int k=120; k>10; k-=1){
            if(k%4==0 && k%6==0){
                System.out.print(k + " ");
            }
        }
        }
    }
}
