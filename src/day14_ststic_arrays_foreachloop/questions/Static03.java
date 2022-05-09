package day14_ststic_arrays_foreachloop.questions;

public class Static03 {
    static int counter = 0;
    int age = 0;

    public Static03() {
        counter++;
        age++;
    }

    public static void main(String[] args) {

        Static03 obj1 = new Static03(); //counter = 1; age =1
        Static03 obj2 = new Static03(); //counter = 2; age =1
        Static03 obj3 = new Static03(); //counter = 3; age =1

        System.out.println(obj1.counter); // 3
        System.out.println(obj2.counter); // 3
        System.out.println(obj3.counter); // 3

        System.out.print(" - ");

        System.out.println(obj1.age); // 1
        System.out.println(obj2.age); // 1
        System.out.println(obj3.age); // 1

        //output 333 - 111

    }
}
