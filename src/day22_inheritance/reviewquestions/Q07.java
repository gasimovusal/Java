package day22_inheritance.reviewquestions;

public class Q07 {

    public static void main(String[] args) {

        StringBuilder stb = new StringBuilder("Learn ");

        char[] ch = new char[] { 'J', 'A', 'V', 'A' };

        stb.append(ch);

        System.out.println(stb);
    }

    //NOTE: append(char ch) is used to append the string representation of the char argument to the given sequence.
    // The char argument is appended to the contents of this StringBuilder sequence.
}
