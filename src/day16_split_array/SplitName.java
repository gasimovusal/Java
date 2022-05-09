package day16_split_array;

import java.util.Arrays;

public class SplitName {

    public static void main(String[] args) {

        String name = "Ali Can";
        String array[] = name.split(" ");
        System.out.println(array[1]);
        String OneName = array[1];

        //split method only works with String array

        //please split this name into a char array
        String name1 = "M o h a m m a d M u s t a f a";
        String [] namesChar = name1.split(" ");
        System.out.println(Arrays.toString(namesChar));

        String chars = " ";
        for(String each: namesChar){
            //System.out.println(each);
            chars +=each;
            //M, o, h, a
        }
        char[] charArray = chars.toCharArray();
        System.out.println(Arrays.toString(charArray));



    }
}
