package day22_inheritance.reviewquestions;

public class Q04 {

//A)
    public static void main(String[] args) {

        StringBuilder str = new StringBuilder(7); // you will have 7 boxes

        str.append("Java");

        System.out.println(str.capacity() + "," + str.length());

        //The output is 4,7 ==> FALSE it should be 7,4 because capacity is 7, length is 4


//C)
        StringBuilder str2 = new StringBuilder("LearnJava");

        str2.setCharAt(5, 'L'); //set means update

        System.out.println(str2);

    //The output is LearnLava ==> TRUE

//D)
        StringBuilder str3 = new StringBuilder("LearnJava");

        str3.deleteCharAt(3);

        System.out.println(str3.substring(2, 6)); // substring takes from character 2 to 5, 6 is exclusive

//        The output is anJa ==> TRUE
    }
}


