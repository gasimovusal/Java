package day25_overriding_encapsulation.reviewquestions;

public class Q03 {

    public class Animal {

        public int weight;

        public static void main(String[] args) {

        }

    }



    public class Mammal extends Animal {

        protected boolean feed = true;

        public static void main(String[] args) {



        }

    }



    public class Dog extends Mammal {

        public boolean bark = true;

        public static void main(String[] args) {

//            Mammal dog = new Dog();
//
//            System.out.println(dog.bark);

//            System.out.println(dog.feed);
//
//            System.out.println(dog.weight);

        }

    }


}
