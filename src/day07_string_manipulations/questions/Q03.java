package day07_string_manipulations.questions;

public class Q03 {

    public static void main(String[] args) {

        //a)
        String a = "Java";
        System.out.println(a.replace("a", "A").replace('v', 'V'));



        String s = "Marra";

        for(int i = s.length()-1; i > -1; i--){

            char c = s.charAt(i);

            if(s.indexOf(c)==s.lastIndexOf(c)){

                System.out.print(c);

            }

        }

        String b = "Java";

        for(int i = s.length()-1; i >= 0; i--){

            System.out.print(b.charAt(i));

        }


    }

}
