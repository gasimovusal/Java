package day17_multi_dimensional_split.practicequestions;

public class Q09 {

    public static void main(String[] args) {

        String s = "Java, I like Java?";

        String arr[] = s.split(""); //[J, a, v, a, , I, , l, i, k, e,  , J, a, v, a, ?]
                        //  counting letter a:  1,    2,                          3,    4
        int counter = 0;

        for(int i=0; i<arr.length; i++) {  //   1,    2,                          3,    4

            if(arr[i].equals("a")) {

                counter++;

            }
        }
        System.out.println("The number of the character: " + counter);



        //What is the output? ==> "The number of the character: 4

    }
}
