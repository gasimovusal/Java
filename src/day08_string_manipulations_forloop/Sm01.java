package day08_string_manipulations_forloop;

public class Sm01 {

    public static void main(String[] args) {

        //if your code only works with specific data, its called "HARD CODING". Hard coding is not acceptable.

        String str = "Vusal is 26 years old, I think he is 27";
        //remove all spcae characters from the String

        String noSpace = str.replace(" ", "");
        System.out.println(noSpace);

        //change digits to *
        String noDigits = str.replace("26", "**").replace("27", "**");
        System.out.println(noDigits);

        //without hard coding
        //use replaceAll() when you want to replace group of data. When replacing group data, replace will not help.

        /*regex means Regular Expressions.
            "[0-9]" means all the number, "[a-z] means all lower case letters, "[A-Za-z]" all upper cae and lower case
            "[^0-9]" different from numbers, "[^A-Za-z]" different from all upper and lower case
         */
        String noDigit = str.replaceAll("[0-9]", "*");
        System.out.println(noDigit);

        //change all letters to !
        String removeLetters = str.replaceAll("[A-Za-z]", "#");
        System.out.println(removeLetters);

        //change all characters different from letters to ? ==> changing everything else except letters
        String differentFromLetters = str.replaceAll("[^A-Za-z]", "?");
        System.out.println(differentFromLetters);

        //change all characters different from space to %
        String keepSpace = str.replaceAll("[^ ]", "%");
        System.out.println(keepSpace);




    }
}
