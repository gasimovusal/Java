package day21_varags_stringbuilders_access_modifiers;

public class Varargs01 {
    //varargs ==> variable arguments
    //varargs are arrays
    // varargs is used to add multiple integer
    // varargs add(int.... name);

    public static void main(String[] args) {

        //add method will add 2 integers
        add(0); // 0
        add(5); // 5
        add(5, 10); // 15
        add(5, 10, 15); // 30

    }

    /*you can use any other parameters except varargs before varargs
    you cannot use any other parameters after varargs
    varargs must be last parameter every time.
    you can use just a single varargs in a method parenthesis
     */
    public static void add(int... a){

        int sum = 0;
        for(int w : a){

            sum = sum + w;
        }

        System.out.println(sum);
    }
}
