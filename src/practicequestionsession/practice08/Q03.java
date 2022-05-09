package practicequestionsession.practice08;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

public class Q03 {

     /*
  How to count the number of occurrences of the letters(alphabetical characters) in a sentence
  For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
                j=.., a=..,
                Make code case insensitive..
*/

    public static void main(String[] args) {

        //letters --> keys ; num of letters --> values

        String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";

        String letters [] = str.replaceAll("[^A -Za-z]", "").toLowerCase().split("");
        System.out.println(Arrays.toString(letters));

        HashMap<String, Integer> map = new HashMap<>();

        for(String w : letters){

            if(!map.containsKey(w)){

                map.put(w, 1);
            }else{

                map.put(w, map.get(w)+1);
            }
        }
        System.out.println(map);


    }
}
