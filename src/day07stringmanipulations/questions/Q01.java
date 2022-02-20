package day07stringmanipulations.questions;

public class Q01 {
    public static void main(String[] args) {

        //which ones are true

        String a = "Hello World!";
        System.out.println(a.toUpperCase().charAt(0)==a.charAt(0));
        /* str.toUpperCase() will convert to HELLO WORLD!
            charAt(0) of HELLO WORLD is H
            charAt(0) of Hello World is H
            so H==H is true
         */

        String b = "Hello World!";
        System.out.println(b.contains("E")!=b.equalsIgnoreCase("HELLO WORLD!"));
        /* b.contains("E") is false because "E" does not exists
        b.equalsIgnoreCase("HELLO WORLD!") is true
        false!=true ==> is not equal to thats why this is true
         */

        String c = "Hello World!";
        System.out.println(c.length()>c.charAt(6));
        /* c.length() will give us 12 because there are 12 characters
        c.charAt(6) is W because W is 6 character
        12>W ==> 12>65 IS FALSE because W is 65 in Ascii table
         */

        String d = "Hello World!";
        System.out.println(d.charAt(2)==d.charAt(9));
        /* d.charAt(2) is l 2nd character
        d.charAt(9) is l because l is also 9th character
        l=l so its true
         */



    }
}
