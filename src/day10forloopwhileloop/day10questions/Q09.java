package day10forloopwhileloop.day10questions;

public class Q09 {

    public static void main(String[] args) {

        //What do you see on the console?

        String s = "Marra";

        for(int i = s.length()-1; i > -1; i--){ //i=4; 4>-1; i--

            char c = s.charAt(i); //

            if(s.indexOf(c)==s.lastIndexOf(c)){

                System.out.print(c);

            }

        }

        //answer is M


    }
}
