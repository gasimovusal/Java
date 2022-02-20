package day09forloopwhileloop;

public class ForLoop02 {

    public static void main(String[] args) {

        //***** IMPORTANT QUESTIONS PLEASE REVIEW


        //put * between 2 consecutive characters and to the end in string. example: J*a*v*a*
        //for(int i=starting value; i<last value; i+=1){}

        String s = "Java";

        for(int i=0; i<s.length(); i+=1){
            System.out.print(s.charAt(i) + "*"); //get the character by using index number
        }

        System.out.println(" ");

        //type code to print unique charactres in a string Hello==>Heo
        /*Hello ==> indexOf(H) = 0, lastIndexOf() indexOf()
                              H ==>     0      ==>     0
                              e ==>     1      ==>     1
                              l ==>     2      ==>     3
                              o ==>     4      ==>     4
         to be unique in a string means indexOf() and lastIndexOf() methods return same value
         the character should exist
         */

        String t = "Hello";
        for(int i=0; i<t.length(); i+=1){
            if(t.indexOf(t.charAt(i)) == t.lastIndexOf(t.charAt(i))){
            /*                  i=0                            i=0
                     t.charAt(0) is H               t.charAt(0) is H
           i.indexOf(t.charAt(i)) is o == i.indexOf(t.charAt(i)) is o

             */

                System.out.print(t.charAt(i));
            }
        }
        System.out.println(" ");
        //type code to print a string in reverse after removing spaces
        //"Vusal Gasimov" ==> "vomisaGlasuV"

        String u = "Vusal Gasimov";
        /*1. remove space ==> u.replace(" ". "")
          2. get the characters from end to beginning
         */
        String noSpace = u.replace(" ", "");
        for(int i=noSpace.length()-1; i>-1; i-=1){ //we are starting from last character and last character is noSpace.length()-1
            System.out.print(noSpace.charAt(i));
        }




    }
}
