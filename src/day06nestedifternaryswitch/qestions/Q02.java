package day06nestedifternaryswitch.qestions;

public class Q02 {

    public static void main(String[] args) {

        char ch='a';
        switch (ch){
            case 'a': //will execute because ch is a
            case 'A': //will not execute because ch is a
                System.out.println(ch);
                break; // will skip all other cases because first case is true
            case 'b':
            case 'B':
                System.out.println(ch);
                break;
            case 'c':
            case 'C':
                System.out.println(ch);
                break;
            case 'd':
            case 'D':
                System.out.println(ch);
        }

        //output is a
    }
}
