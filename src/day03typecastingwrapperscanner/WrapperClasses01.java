package day03typecastingwrapperscanner;

public class WrapperClasses01 {

    public static void main(String[] args) {

        //converting primitive to wrapper class - Autoboxing
        char c = 'd';
        Character wc = c;

        int i = 12;
        Integer wi = i;

        //converting wrapper class to primitive - Unboxing
        Short s = 23;
        short ps = s;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Short.MAX_VALUE + Long.MIN_VALUE);
    }
}
