package day25_overriding_encapsulation.overloading;

public class Mammal extends Animal{

    public void feedBabyWithMilk(){

        System.out.println("Mammal feed their baby with milk");
    }

    @Override
    public Animal myMethod() { //????????? dont touch method name
        return new Mammal(); // returning Mammals object, its acceptable by Animal
    }
}
