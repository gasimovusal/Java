package day03typecastingwrapperscanner;

public class TypeCasting01 {

    public static void main(String[] args) {


    // byte < short < int < long < float < double
    //typecasting is converting between data types

    //converting small data type to large data type - Auto Widening
    byte b = 47;
    int i = b;

    //converting large data type to small data type - Explicit Narrowing
    double d = 1.2;
    short s = (short)d;

    //converting short 257 to byte
    short r = 258;
    byte y = (byte)r;
        System.out.println(y);

    }
}
