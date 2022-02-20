package day07stringmanipulations;

public class Sm04 {

    public static void main(String[] args) {

        String str = "Vusal Gasimov";

        //.concat method
        String newStr = str.concat("!").concat("?"); //concatenating/joining !? sign with Vusal Gasimov
            // you can also use + sign but using concat is better because Java created concat method
        System.out.println(newStr);

        //.endsWith method ==> uses boolean
        boolean isLastLetter = str.endsWith("n");
        System.out.println(isLastLetter);

        //.startsWith() method ==>boolean
        boolean startsWith = str.startsWith("V");
        System.out.println(startsWith);

        //startsWith(prefic: , toffset: ) ==> java will skip the 6 characters and look for G
        boolean starts = str.startsWith("G", 6);
        System.out.println(starts);

         /* methods we have learned
                1. equals()
                2. equalsIgnoreCase()
                3. length() ==> number of characters in a word
                4. charAt ==> getting single character
                5. substring() with one index==>
                6. substring() with two indexs ==>
                7. indexOf()
                8. contains()
                9. toLowerCase()
                10. toUpperCase()
                11. concat()
                12. endsWith()
                13. startsWith(with 1 parameter)
                14. startsWith(with 2 parameters)

             */
    }
}
