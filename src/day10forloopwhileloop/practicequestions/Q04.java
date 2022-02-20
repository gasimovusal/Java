package day10forloopwhileloop.practicequestions;

public class Q04 {

    public static void main(String[] args) {

        //note: ascii value of 'A' is 65

        for(int i=65; i<68; i++){
            System.out.print((char)i); //explicit type casting ==> when you type data type in front of data
                                       //(char)65=>A ; (char)66=>B ; (char)67=>C
        }

        //output will be ABC
    }
}
