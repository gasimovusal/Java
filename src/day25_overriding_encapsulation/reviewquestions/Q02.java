package day25_overriding_encapsulation.reviewquestions;

public class Q02 {

    public class Animal {

        public int weight = 12;

        protected boolean feed = true;

        public static void main(String[] args) {

        }

    }



    public class Mammal extends Animal {

        public int weight = 13;

        public boolean bark = false;

        public static void main(String[] args) {



        }

    }



    public class Dog extends Mammal {

        private boolean bark = true;

        public static void main(String[] args) {

            //Dog dog = new Dog();

//            System.out.println(dog.bark);
//
//            System.out.println(dog.feed);
//
//            System.out.println(dog.weight);

        }

    }
}
