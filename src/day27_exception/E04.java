package day27_exception;

import java.io.FileInputStream;
import java.io.IOException;

public class E04 {

    /*
    1) when you use throws in the method name line, it means you are telling java "if you need help, let me know"
    2) after throws keyword in the method name line, you can use multiple Exception Classes
    3) What are the differences between, "throws" and "throw" keywords
            a)"throws" can be used in the method name line, "throw" can be used in method body
            b)After "throws", you can use multiple Exception Class Names.
              After "throw", you can use "new" keyword and Constructor of the Exception Class
            c)"throws" keyword used to handle "Checked Exceptions", "throw" keyword is used to throw exception whenever and wherever we want
    4) What is the meaning of "final", "finally", and "finalize" keywords?
            final - if we use final with variable, final variable cannot be updated, you cannot update anything after final keyword
            finally - is block in try-catch
            finalize - java scan the memory constantly, if there is any object which is not used anymore, it deletes them, puts in java trashcan
     */

    public static void main(String[] args) throws IOException, ArithmeticException, NumberFormatException, ArrayIndexOutOfBoundsException {
        //after throws key-word, you can trow multiple exceptions

        FileInputStream fis = new FileInputStream("/src/day27_exception/File01.txt"); //go and find the file

        int k = 0;

        while ((k = fis.read()) != -1) {

            System.out.print((char) k);
        }

        System.out.println("===================");

        printAge(100);
    }

        //create a method which throws "IllegalArgumentException" for negative ages

        public static void printAge(int age){

            if(age>=0 & age<=100){
                System.out.println(age);
            } else{
                throw new IllegalArgumentException("Ages can be between 0 and 100 "); // after new keyword, we used constructor
            }
        }
}
