package day27_exception;

public class E01 {

    /*
    1) you can use multiple catch block with try-block
    2) you can use multiple catch block, just one of them can be executed at the same time
    3) try-block cannot be used alone
     */

    public static void main(String[] args) {

        String s = "Hello!";
        getCharacterFromStringByIndex(s, 2); // method call
        getCharacterFromStringByIndex(s, 6); // method call

        divideTheLength(s, 1, 6, 3); // method call

    }

    public static void getCharacterFromStringByIndex(String str, int idx){

        try{

            System.out.println(str.charAt(idx));
        } catch (StringIndexOutOfBoundsException e){ // StringIndexOut... is data type, e is variable name

            System.err.println("index does not exists ==> " + e.getMessage());
        }

    }

    public static void divideTheLength(String str, int idx1, int idx2, int idx3){

        try{
            int firstLength = str.substring(idx1, idx2).length();
            int secondLength = str.substring(idx1, idx3).length();
            System.out.println(firstLength/secondLength);
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("issue occurred in character selection ==> " + e.getMessage());
        } catch (ArithmeticException e){

            System.out.println("issue occurred in division ==> " + e.getMessage());
        }

    }
}
