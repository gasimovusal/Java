package day21_varags_stringbuilders_access_modifiers.reviewquestions01;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q02 {

    public static void main(String[] args) {

        LocalTime time = LocalTime.now();

        //If the current time is 09:34:02.960 PM, which ones are true? ==>

        //A)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println(dtf.format(time));

        //Prints 21:34 on the console

        //B)
        System.out.println(time.plusMinutes(11));

        //Prints 09:45:02.960 on the console

        //C
        System.out.println(time.minusHours(2));

        //Prints 07:34:02.960 on the console

        //D)
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm");

        System.out.println(dtf1.format(time));

        //Prints 09:34 on the console
    }
}
