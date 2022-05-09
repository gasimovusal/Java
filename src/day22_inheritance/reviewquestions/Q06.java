package day22_inheritance.reviewquestions;

public class Q06 {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder("LearnJava");

        str.reverse();

        System.out.println(str);
    }

//    Which output is the same with the given code?

//A)
//        String str1 = "LearnJava";
//
//        String str2 = "";
//
//        for(int i = 0; i<=str2.length()-1; i++) {
//
//            str2 = str2 + str1.charAt(i);
//        }
//        System.out.println(str2); ==> FALSE

//B
//    public static void main(String[] args) {
//
//        String str3 = "LearnJava";
//
//        String str4 = "";
//
//        for(int i = str2.length()-1; i>=0; i++) { // you have to decrease not increase i
//
//            str4 = str4 + str3.charAt(i);
//        }
//        System.out.println(str4);
//    }

//C) ==> TRUE
//    public static void main(String[] args) {
//
//        String str5 = "LearnJava";
//
//        String str6 = "";
//
//        for(int i = str5.length()-1; i>=0; i--) {
//
//            str6 = str6 + str2.charAt(i);
//        }
//        System.out.println(str6);
//    }
}
