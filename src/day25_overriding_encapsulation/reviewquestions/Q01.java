package day25_overriding_encapsulation.reviewquestions;

public class Q01 {

    public class Animal {

        Animal(){

            System.out.println("Animal Constructor");

        }
        public static void main(String[] args) {
        }
    }

    public class Mammal extends Animal {

        Mammal(){

            System.out.println("Mammal Constructor");

        }
        public static void main(String[] args) {
        }
    }

    public class Dog extends Mammal {

        Dog(){

            System.out.println("Dog Constructor");

        }
        public static void main(String[] args) {
//            Dog dog = new Dog();
        }

    }
}
