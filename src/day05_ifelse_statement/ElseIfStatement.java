package day05_ifelse_statement;

import java.util.Scanner;

public class ElseIfStatement {
     public static void main(String[] args){

          Scanner scan = new Scanner(System.in);
          System.out.println("Please enter the month");
          String month = scan.next();

          if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January" ) || month.equalsIgnoreCase("February")){
               System.out.println("Winter");

          } else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April" ) || month.equalsIgnoreCase("May")) {
               System.out.println("Spring");

          } else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July" ) || month.equalsIgnoreCase("August")) {
               System.out.println();
          } else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October" ) || month.equalsIgnoreCase("November")){
               System.out.println("Fall");
          } else {
               System.out.println(month + " is not a month.");
          }



     }
}
