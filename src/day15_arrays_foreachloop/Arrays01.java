package day15_arrays_foreachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {

    public static void main(String[] args) {

//sort the array elements according to their length. ==> "Ali" - "Veli" - "Maria" - "Michael"
        String srr[] = {"Veli", "Michael", "Ali", "Maria"};

        Arrays.sort(srr, Comparator.comparingInt(String::length));
        //we are using comparingInt because we are comparing number of characters (int) to compare
        //Comparator is a class, it has many method in it to use in comparasing
        System.out.println(Arrays.toString(srr)); //output [Ali, Veli, Maria, Michael]

//sort the array elements in descending order according to their length. ==> Micheal, Maria, Veli, Ali
        String trr[] = {"Veli", "Michael", "Ali", "Maria"};

        Arrays.sort(trr, Comparator.comparingInt(String::length).reversed());
        System.out.println(Arrays.toString(trr)); // [Michael, Maria, Veli, Ali]

//sort the array elements in descending order according to their length.
//if some elements are in the same length, put them in alphabetical order ==> Michael, Maria, Veli, Ali

        String urr[]={"Veli", "Michael", "Ali", "Maria", "Can", "Tan", "Ayse"};

        Arrays.sort(urr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        //naturalOrder means alphabetical order in String, ascending order in numbers
        //if you use comparing operation inside comparing operation, we use then keyword
        System.out.println(Arrays.toString(urr)); // {Michael, Maria, Ayse, Veli, Ali, Can, Teb}

    }
}
