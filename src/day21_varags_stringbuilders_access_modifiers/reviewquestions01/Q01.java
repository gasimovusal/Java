package day21_varags_stringbuilders_access_modifiers.reviewquestions01;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q01 {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();

        //If local date is 29th of June 2020, which ones are true?

        //A)
        System.out.println(date.minusDays(5));

        //Prints 2020-06-24 on the console ==> TRUE

        //B)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMM/yyyy");

        System.out.println(dtf.format(date));

        //Prints 29/Jun/2020 on the console ==> TRUE

        //C)
        System.out.println(date.plusMonths(2));

        //Prints 2020-08-29 on the console ==> TRUE

        //D)
        System.out.println(date);

        //Prints 2020-06-29 on the console ==> TRUE
    }
}
