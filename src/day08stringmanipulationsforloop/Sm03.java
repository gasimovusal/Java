package day08stringmanipulationsforloop;

public class Sm03 {

    public static void main(String[] args) {
         //how to remove spaces from the beginning and from the end in a string
        //.trim()

        String fullName = "   Vusal Gasimov     ";
        System.out.println(fullName);

        String trimmedName = fullName.trim();
        System.out.println(trimmedName);

        //how to understand if a string is empty or not

        int numOfChar = fullName.length();
        if(numOfChar==0){
            System.out.println("You did not enter your name");
        } else{
            System.out.println("You enter your name successfully");
        }

        //isEmpty() returns true if there is no character
        boolean isEmpty = fullName.isEmpty();
        if(isEmpty){
            System.out.println("You did not enter your name");
        }else {
            System.out.println("You enter your name successfully");
        }


        //isBlank() returns true if there is just space character or nothing
        String str = " ";
        boolean isBlank = str.isBlank();
        System.out.println(isBlank);




    }
}
