package day17_multi_dimensional_split.practicequestions;

public class Q06 {

    public static void main(String args[]){

        String input = "Hello Welcome to TechPro Education";

        String[] result1 = input.split(" "); // output will be [Hello, Welcome, to , techpro, education]

        String[] result2 = input.split("X"); // there is no X so String will not split, so entire String will be just 1 element:

        System.out.println(result1.length + "-" + result2.length);
        //                              5    -      1

    }



//    What is the output?  5-1
}
