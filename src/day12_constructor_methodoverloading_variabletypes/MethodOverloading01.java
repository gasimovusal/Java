package day12_constructor_methodoverloading_variabletypes;

public class MethodOverloading01 {
    /* 1) if you have multiple methods whose names are same, java at the parameters to select a specific method
            a) to select number of parameters are important
            b) to select data types of parameters are important

       2)If you have multiple methods with the same name in a class it is called "Method Overloading"
          How can you achieve method overloading?
            i)Create methods with the same name
            ii)Use the different parameters
                a)Change the number of parameters
                b)Change the data types of the parameters
                c)If the data types are different, you can change their places
     */

    public static void main(String[] args) {

        //add(3, 5) is called "Method Call" in java
        System.out.println(add(3, 5));

        System.out.println(add(7, 4));

        System.out.println(add(4, 2, 8));

        System.out.println(add(1.2, 2.3));

        System.out.println(add(2, 3.4));
    }

    //create and add method which adds 2 integers
    //if you use a method inside the main method use "static" keyword between the access modifier and the "return type"
    public static int add(int a, int b) {return a + b;} //user enter a=4, b=8 ;; int will be 8 after adding 3 and 5
         // passing 3 and 5 ==> 3+5=8


    //create and add method which adds 3 integers

    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double add(int a, double b){
        return a+b;
    }
}
