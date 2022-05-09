package day10_forloop_whileloop;

public class WhileLoop01 {

    public static void main(String[] args) {

        //Example: type code to print "Hello" 5 times
        //1st way: for loop
        for(int i=1; i<6; i++){
            System.out.println("Hello");
        }

        //2nd way:
        int i=1;

        while(i<6){
            System.out.println("Hey");
            i++;
        }

        //Example:  type code to print odd integers from 12 to 67 in the same line with a space between them

        int a=12;

        while(a<68) {

            if (a % 2 !=0) {
                System.out.print(a + " ");
            }
            a++;
        }


        //Example: type code to find the sum of integers from 12 to 67

        int b = 12;
        int sum = 0;

        while(b<68){
            sum=sum+b;
            b++;
        }
    }
}
