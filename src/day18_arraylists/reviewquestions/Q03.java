package day18_arraylists.reviewquestions;

import java.util.ArrayList;

public class Q03 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");          // [A, B, C, D]

        System.out.println(list.remove(2));
        // C will be removed ==> you will get C if you used removed method with index it will give you removed element

        System.out.println(list.remove("C"));
        // you are using removed element with C ==> You will get FALSE because your removed C before



    }
}
