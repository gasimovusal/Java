package day32_maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashInterviewQuestions {

    /*
        How to count the number of occurrences of the words in a sentence
        For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
        Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
        get ride of punctuation
        split words into array
        */

    public static void main(String[] args) {

        String sentence = "Java is easy. Type codes to learn Java. To earn money learn Java.";
        sentence = sentence.replaceAll("\\p{Punct}", ""); // replace all Punctuations with nothing
        System.out.println(sentence);

        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words)); // [Java, is, easy, Type, codes, to, learn, Java, To, earn, money, learn, Java]

        HashMap<String, Integer> result = new HashMap<>();

        for(String w: words){

            Integer numOfOccurrences = result.get(w);

            if(numOfOccurrences == null){
                result.put(w, 1);
            }else{
                result.put(w, numOfOccurrences + 1);
            }

        }
        System.out.println(result);
    }
}
