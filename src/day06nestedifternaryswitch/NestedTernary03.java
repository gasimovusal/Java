package day06nestedifternaryswitch;

public class NestedTernary03 {

    public static void main(String[] args){

        /* you have 2 integers;
        if both of the integers are positive do multiplication
        if one is negative the other is positive, return "I do not know how do multiply"
         */

        int a = 2;
        int b = -5;

        //if your ternary returns different data types for different scenarios, do not creat reserved are for the result, put it directly inside System.out.println()
        System.out.println(a>0 && b>0 ? a*b : "I do not know how do multiply");
    }
}
