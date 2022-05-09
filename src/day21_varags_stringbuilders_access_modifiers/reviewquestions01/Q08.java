package day21_varags_stringbuilders_access_modifiers.reviewquestions01;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Q08 {

    public static void main(String[] args) {

        // if you use MM, your get number of month
        // if you use MMM, you get first 3 characters of month name
        // if you use MMMM, you get full name of the month
        // hh --> 12 hours system - am, pm
        // HH --> 24 hours system


        //a
        LocalTime time = LocalTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println(dtf.format(time.plusHours(1))); // ==> FALSE HH is 24 hours

        //b
        LocalDate date = LocalDate.now();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        System.out.println(dtf1.format(date));  // ==> TRUE

        //c

        LocalTime time2 = LocalTime.now();

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss");

        System.out.println(dtf2.format(time.minusHours(1)));  // ==> TRUE

        //d

        LocalDate date3 = LocalDate.now();

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-MMM-yy");

        System.out.println(dtf3.format(date));  // ==> TRUE
    }
}
