package day22_inheritance.reviewquestions;

public class Q02 {

    public static void main(String[] args) {

        StringBuilder strBld = new StringBuilder("John ");

        strBld.append("Woo ").append("Leo").deleteCharAt(6);

        System.out.println(strBld); // John Wo Leo
    }
}
