package day01_variables;

public class Variables01 {

    public static void main(String[] args) {
        int age = 12;
        char initial = 'A';
        System.out.println(age);
        System.out.println(initial);

        int ch1=26, ch2=20;
        System.out.println(ch1);
        //sum of dob and name
        System.out.println(ch1+ch2);
        //concatenation operation - joining data together
        System.out.println("Joining data together " + ch1 + ch2);
        //adding ch1 and ch2 together
        System.out.println("The sum is " + (ch1 + ch2));
        //use less code inside ( )
        int sum = ch1 + ch2;
        System.out.println("This is shorter sum " + sum);
        //multiplying ch1 and ch2, you dont need to  puy ( ), java will calculate multiplication first
        System.out.println("The multiplication is " + ch1*ch2);


    }

}
