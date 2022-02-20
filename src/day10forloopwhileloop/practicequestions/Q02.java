package day10forloopwhileloop.practicequestions;

public class Q02 {

    public static void main(String[] args) {

        for(char i='f'; i>'a'; i--){ //i=f i=letter before e =d, i=letter before c =b
            System.out.print(i + " "); //f d b
            i--; //i-f means one letter before e, i= letter before d=c
        }

        //output will f d b
    }
}
