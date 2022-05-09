package day08_string_manipulations_forloop;

public class Sm02 {

    public static void main(String[] args) {

        /* \\s means space character
            \\S means characters different from space character

            \\d means digits
            \\D means different from digits

            \\w means A-Z and a-z and 0-9 and _
            \\W different from A-Z and a-z and 0-9 and _

            \\p{Punct} means all punctuation marks
         */

        String str = "Vusal is 26 years old, I think he is 27";
        String differentFrom = str.replaceAll("\\S", "&");
        System.out.println(differentFrom);

        // how many characters are used in the String different from space
        int numOfCharDiffFromSpace = str.replaceAll("\\s", "").length();
        System.out.println(numOfCharDiffFromSpace);

        // how many digits are used in the String?
        int numOfDigits = str.replaceAll("\\D", "").length();
        System.out.println(numOfDigits);

        //how many letter are used in String?
        int numOfLetters = str.replaceAll("[^A-Za-z]", "").length();
        System.out.println(numOfLetters);

        //how many punctuation marks are used in String
        int numOfPunct = str.replaceAll("[\\p{Punct}]", "").length();
        System.out.println(numOfPunct);

        int totalNumOfChar = str.length();
        int numOfCharDiffFromPunct = str.replaceAll("\\p{Punct}", "").length();
        int numOfPunctMarks = totalNumOfChar - numOfCharDiffFromPunct;
        System.out.println(numOfPunctMarks);
    }
}
