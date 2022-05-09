package day27_exception;

/*
    NOTE: When you type your code, Java will give you red underlines from some Exceptions before running the code.
    That kind of exceptions is called "Compile Time Exceptions" (Checked Exception)
    1) FileNotFoundException: (specific exception) this exception is thrown is the path is wrong or file does not exist
    2) IOException: (general exception, put it least) This Exception handles all issue related with Input and Output

    NOTE: "FileNotFoundException" is child of "IOException"
    NOTE: If there is parent-child relationship between Exception Classes, Child Exception Class must come before Parent-Exception class in multiple catch-block usage
    NOTE: To execute a code under every condition, put the codes inside the "finally-block"

    NOTE: a) try-block cannot be used alone
          b) try-block can be used with single catch-block
          c) try-block can be used with multiple catch-block
          d) try-block can be used with just finally-block
          e) try-block can be used with single or multiple catch-block and finally-block
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {

    public static void main(String[] args) {

        goAndReadTheFile();
    }

    /*
    how do you read text file:
    I create FileInputStream object by using the path of the file
    then I use read method from FileInputStream class
    by help of the read method I can read the text, character by character
     */
    public static void goAndReadTheFile(){

        try {
            FileInputStream fis = new FileInputStream("src/day27_exception/File01.txt"); //go and find the file

            int k = 0;
                     //fil.read will return ascii value
            while( (k=fis.read()) != -1){ // by using fis object, I am accessing to the method inside FileInputStream
                //checking ascii value on the file, if ascii value is not equal to -1, loop will work, if ascii value is -1 (no more character left) it will break the loop

                System.out.print((char)k); //explicit type casting -- you are converting ascii value to char and printing it
            }

        }catch (FileNotFoundException e) {

            System.out.println("There is an issue about reaching out the file or existence of the file ==> " + e.getMessage());

        }catch (IOException e) { //java put IOException at last because IO is wider than FileNotFound ; general exception, put it least

            e.printStackTrace();
        } finally { //finally blocked is used if you want to do something under any condition
            System.out.println("connection with cloud was broken");
        }
    }

}
