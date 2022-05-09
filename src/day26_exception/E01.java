package day26_exception;

public class E01 {

    /*
    1) exceptions means un-expected issue in your codes
    2) there are 2 ways to work with exceptions
        a) exception handling: try-catch blocks
        b) throw exception
     */

    /*
    1) if you think any problem can occur for any line of code, put it inside the try-block, then create a catch-block
    2) inside the catch block parenthesis put the possible exception class
    3) by using e.getMessage() you can get technical message
    4) if you want you can put non-technical message to catch body
    5) if the code inside the try body works without any issue, catch block will not be executed
    6) after any exception occurred, next line of codes cannot be executed
     */

    public static void main(String[] args) { // static method needs everything inside static
        divide(12, 3);
        divide(0, 3);
        divide(12, 0); // no answer in math
    }

    public static void divide (int a, int b){

        try{
            System.out.println(a/b);
            System.out.println("Hi!");
        } catch (ArithmeticException e){
            System.out.println("could not divide ==> " + e.getMessage());
        }
    }

    /* note: following code is not recommended because it needs deep math knowledge
    public static void divide(int a, int b){ //main method is static, static method needs everything static
        if(b==0){
            System.out.println("divisor cannot be 0");
        } else {
            System.out.println(a / b);
        }
    }
     */
}
