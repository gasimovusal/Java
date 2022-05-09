package day28_abstraction.car;

public class CarRunner {

    public static void main(String[] args) {

     //reference        object
        Car car     =   new Toyota();
        //we are using inheritance, abstraction, polymorphism

        // when we create an abstract class, we cannot create and object from Abstract class,
        // but we can use abstract class as reference type

        car.make(); // toyota
        car.model(); // camry
        car.year(); // 2022

        Honda car2 = new Honda();

        car2.make();
        car2.model();


    }
}
