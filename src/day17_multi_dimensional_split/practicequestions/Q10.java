package day17_multi_dimensional_split.practicequestions;

public class Q10 {

    public static void main(String[] args) {

        String s = "Java, I like Java?";

        String arr[] = s.split("a");  // [j, v, I like J, v, ?]

        System.out.println("The number of the character: " + (arr.length-1));
            //                                                         5-1



        //What is the output? ==> 4
    }
}
