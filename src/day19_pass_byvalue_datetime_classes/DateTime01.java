package day19_pass_byvalue_datetime_classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {


        Date date1 = new Date();
        date1.getTime();
        System.out.println(date1.getTime()); // 1646249361768 ==> Returns the number of milliseconds since January 1, 1970
        // get time constantly changes. You can use this method to create new ID since its changing every millisecond
        // when you insert something into database and if you want to save exact time, you can use this method : example record exact time in atm withdrew

        System.out.println(LocalDate.now()); // returns the current date using the system clock and default time-one, not null
        System.out.println(LocalDate.now(ZoneId.of("Asia/Baku"))); // returns current date in Baku, google zone id of baki in google

        // How to get future dates

        System.out.println(LocalDate.now().plusDays(200)); // type LocalDate.now.plusDays after 200 days
        System.out.println(LocalDate.now().plusMonths(25)); // type LocalDate.now.Months after 25 month

        //how to get past dates
        System.out.println(LocalDate.now().minusWeeks(7)); // type minus to go back on time

        System.out.println(LocalDate.now().plusYears(2).minusWeeks(5)); // go next 2 years and after go back 5 weeks

        System.out.println(LocalTime.now()); // will get current time from computer system

        System.out.print(LocalTime.now().getHour()); // get only hour
        System.out.println(LocalTime.now().getMinute()); // get only munite
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute()); // get hour and minute

        System.out.println(LocalTime.now().isAfter(LocalTime.of(20, 12, 35)));
        // if local time in computer after 20:12:35, it will get true, otherwise it will give false

        System.out.println(LocalTime.now().isBefore(LocalTime.of(20, 12, 35)));
        // if local time in computer before 20:12:35, it will get true, otherwise it will give false

        //compare 2 birthdays: Ali birthdays - 02/13/2005 ; Veli - 03/01/2007

        LocalDate.of(2005, 02, 13).isBefore(LocalDate.of(2007, 03, 01));

        System.out.println(LocalDate.now().getDayOfWeek()); // get the day of week from you local computer : Monday, Tuesday, .....
        System.out.println(LocalDate.now().getMonth()); // it will show January, February, ....

        System.out.println(LocalDateTime.now()); // prints date and time together and will

   //     System.out.println(Loc);// separate with T (stands for time)2022-03-02T17:17:08.776287





    }
}
