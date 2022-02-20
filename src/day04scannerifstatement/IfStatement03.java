package day04scannerifstatement;

import java.util.Scanner;

public class IfStatement03 {

    public static void main(String[] args){
        /* ask user to enter a day name then
        print "Weekday" for Monday, Tuesday, Wednesday, Thursday, Friday
        print "Weekend" for Saturday and Sunday
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a day name ... ");
        String dayName = scan.next();

        //To compare 2 Strings, do not equal == it returns wrong result mostly

        if(dayName.equals("Monday")) {
            System.out.println("Weekday");
        }
        if(dayName.equals("Tuesday")) {
            System.out.println("Weekday");
        }
        if(dayName.equals("Wednesday")) {
            System.out.println("Weekday");
        }
        if(dayName.equals("Thursday")) {
            System.out.println("Weekday");
        }
        if(dayName.equals("Friday")) {
            System.out.println("Weekday");
        }
        if(dayName.equals("Saturday")) {
            System.out.println("Weekend");
        }
        if(dayName.equals("Sunday")) {
            System.out.println("Weekend");
        }

        //Solve the previous task without repetition - OR Operator - sign is "||"
        if(dayName.equals("Monday") || dayName.equals("Tuesday") || dayName.equals("Wednesday") || dayName.equals("Thursday") || dayName.equals("Friday")) {
            System.out.println("Weekday");
        }
        if(dayName.equals("Saturday") || dayName.equals("Sunday")){
            System.out.println("Weekend");
        }

        //Java created another method to ignor Upper or lower cases when user enter the data like monday or mOnDaY
        //The method is equalsIgnoreCase()

        if(dayName.equalsIgnoreCase("Monday") || dayName.equalsIgnoreCase("Tuesday") || dayName.equalsIgnoreCase("Wednesday") || dayName.equalsIgnoreCase("Thursday") || dayName.equalsIgnoreCase("Friday")) {
            System.out.println("Weekday");
        }
        if(dayName.equalsIgnoreCase("Saturday") || dayName.equalsIgnoreCase("Sunday")){
            System.out.println("Weekend");
        }

        //Make the if statement paranthesis shorter, more professional

        boolean isWeekDay = dayName.equalsIgnoreCase("Monday") ||
                            dayName.equalsIgnoreCase("Tuesday") ||
                            dayName.equalsIgnoreCase("Wednesday") ||
                            dayName.equalsIgnoreCase("Thursday") ||
                            dayName.equalsIgnoreCase("Friday");
        if(isWeekDay){
            System.out.println("Weekday");
        }

        boolean isWeekEnd = dayName.equalsIgnoreCase("Saturday") ||
                dayName.equalsIgnoreCase("Sunday");

        if(isWeekEnd){
            System.out.println("Weekend");
        }
    }

}
