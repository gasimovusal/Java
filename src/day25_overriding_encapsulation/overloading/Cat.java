package day25_overriding_encapsulation.overloading;

public class Cat extends Mammal{

    @Override
    public void feedBabyWithMilk() {
        System.out.println("Cats feed baby with milk");
    }

    @Override
    public void drink() {

        System.out.println("Cats drink");
    }

    public void meow(){

        System.out.println("Cats meow");
    }
}
