package day35_lambda;

public class Utils {

    public static void printInSameLine (Object o){ // we are taking elements one by one

        System.out.print(o + " ");
    }
    //class name :: printInSameLine
    //Utils

    public static boolean checkIfEven ( int x){

        return x % 2 == 0;
    }
    // Utils :: checkIfEven

    public static boolean checkIfMoreThan8 (int x){

        return x > 8;
    }

    public static boolean checkToBeOdd ( int x){
        return x % 2 !=0;
    }

    public static int getSquare (int x){

        return x * x;
    }

    public static void printElementsWithStar (Object o){

        System.out.println(o + " *");
    }

    public static int getCube(int x){

        return  x*x*x;
    }

    public static double getHalfElement(int x){

        return x / 2.0;
    }
}


