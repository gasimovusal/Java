package day14_ststic_arrays_foreachloop.questions;

public class Counter {
    int count=0;

    Counter(){ //you dont have return type so Counter is constructor,

        count+=2;
        System.out.println(count);
    }

    public static void main(String args[]){

        Counter c1=new Counter(); //2
        Counter c2=new Counter(); //2
        Counter c3=new Counter(); //2

    }
}
