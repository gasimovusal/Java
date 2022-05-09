package day13_statickeyword_variabletypes.reviewquestions;

public class Q07 {


    public static String function(float i, int j){
        return "Good";
    }
    public static String function(double i, double j){ //double i=2.1F, double j=3.2
        return "Bad";
    }
    public static void main(String[] args){
        System.out.println(function(2.1F, 3.2));
    }

                //Prints Bad on the console

    public static String function2(float i, int j){
        return "Good";
    }
    public static String function2(double i, double j){ //==> double i=1.2 , double j=3
        return "Bad";
    }
    public static void main2(String[] args){
        System.out.println(function(1.2, 3));
    }
                //Prints Bad on the console


}
