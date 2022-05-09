package day26_exception;

public class E04 {

    public static void main(String[] args) {

        String str = "123";
        convertStringToInteger(str);

        String s = "123a";
        convertStringToInteger(s);
    }

    public static void convertStringToInteger(String str) {

        try {
            System.out.println(Integer.parseInt(str) + 1);
        } catch (NumberFormatException e){
            System.err.println("String could not converted to an int ==> " + e.getMessage());
        }
    }

    /* Integer.valueOf() gives you Integer Wrapper Class
        Integer.parseInt() gives you int primitive, will use just with digit character
     */
}
