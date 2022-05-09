package day16_split_array;

import java.util.Arrays;

public class SplitArray {

    public static void main(String[] args) {


        String words = "I go to school";
        //we split method, to split the words or items of a String
        //when we use split method, we can use any char to split the given String

        String[] arrays = words.split(" ");

        System.out.println(Arrays.toString(arrays));

        String words2 = "I,go,to,school";
        String[] arrays2 = words2.split(",");
        System.out.println(Arrays.toString(arrays2));

        String sentence = "I have 2 cats and 2 dog ";
        String [] array3 = sentence.split(" ");
        System.out.println(Arrays.toString(array3));

        //split it from "and" and print on the console all elements from the array
        //I go to school and I talk to friends and I talk to teachers

        String newSentence = "I go to school and I talk to friends and I talk to teachers";
        String newArray [] = newSentence.split("and"); // you will get 3 elements in arrays
        System.out.println(Arrays.toString(newArray)); // [I go to school ,  I talk to friends ,  I talk to teachers]

    }
}
