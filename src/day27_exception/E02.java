package day27_exception;

public class E02 {

    /*
    NOTE: If exception happen visible on the console after running the code, the exception are called "Run Time Exception"
            Other name of "Run Time Exceptions" is called "Unchecked Exceptions" (Java does not check your mistake, your code)
            Following are "Run Time Exceptions"
    1) ArithmeticException
    2) ArrayIndexOutOfBoundException
    3) NullPointerException
    4) NumberFormatException
    5) StringIndexOutOfBoundException
    6) ClassCastException
     */

    public static void main(String[] args) {

        Object obj = 70; // Object class is parent of all classes

        convertObjectToString(obj);

        String s = "vusal";

        convertStringToObject(s);

    }

    public static void convertObjectToString( Object obj){

        try{
            String s = (String)obj;
            System.out.println(s);
        }catch (ClassCastException e){
            System.err.println("conversion is impossible ==> " + e.getMessage());
        }
    }

    public static void convertStringToObject (String str){

        try{
            Object o = (Object)str;
            System.out.println(o);
        }catch(ClassCastException e){

            System.out.println("Conversion is not possible ==> " + e.getMessage());
        }
    }


}
