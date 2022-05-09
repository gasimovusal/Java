package day20_interview_questions;

public class Q06 {

    public static void main(String[] args) {

        String str = "M "; // M


        str = str.concat("E "); //M E

        String add = "S ";

        str = str.concat(add); // M E S

        str.replace("S", "T"); // you are not assigning to the string so it will not change it

        str = str.concat(add); // M E S S

        System.out.println(str);
    }
}
