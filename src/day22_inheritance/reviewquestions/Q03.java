package day22_inheritance.reviewquestions;

public class Q03 {

    public static void main(String[] args) {

        StringBuilder strBld = new StringBuilder("LearnJava");

//A)
        strBld.reverse();
        System.out.println(strBld);
        // Prints avaJnraeL on the console ==> TRUE

//B)
        strBld.substring(3);
        System.out.println(strBld);
        //Prints LearnJava on the console  ==> TRUE
        // substring method comes from String Class. The method coming from String Class does not update the string builder

//C)
        strBld.insert(0,"You");
        System.out.println(strBld);
        //Prints YouLearnJava on the console ==> TRUE

//D)
        strBld.delete(5, 9);
        System.out.println(strBld);
        //Prints Learn on the console ==> TRUE


    }
}
