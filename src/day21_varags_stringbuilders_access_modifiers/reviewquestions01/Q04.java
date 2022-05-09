package day21_varags_stringbuilders_access_modifiers.reviewquestions01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q04 {

    public static void main(String[] args) {

        //upper case M is used for month
        //lower case m is used for minutes


        LocalDate date = LocalDate.now();

        //If current date is 1st of July 2020 then which one is false?

        // A
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        System.out.println(dtf.format(date.plusMonths(2)));

        //Output will be 01/September/2020

        //B None ==> teu non of them is false

        //C
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        System.out.println(dtf2.format(date));

        //Output will be 01/July/2020

        //D
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd:MMM:yy");

        System.out.println(dtf.format(date));

        //Output will be 01:Jul:20
    }
}
