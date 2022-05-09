package day22_inheritance;

public class AnimalRunner {

    /*
    1) to make a class child of another class, we use "Extends" keyword
    2) we create parent-child relationship:
        a. to prevent repetition
        b. to make maintenance easy
        c. to make our classes atomic
    3) child classes can use the methods and variables from parent classes.
       parent classes cannot use anything from child classes
    4) child can have parents, grandparents, grand grandparents etc.
       a parent can have child, grandchild, grand grandchild etc.
    5) every class EXCEPT Object Class has parent class in java
        Object Class is a default class
        every class has default constructors
    6) java support "multi-level inheritance", "Hierarchical inheritance", and "Single Inheritance"
        Java does not support "multiple inheritance" because it makes child class confused
    7) when you create and object in Inheritance, all constructors in parent classes work from up to down
        in inheritance, when you create an object, all constructor in parent constructor work from top to down
        last sentence: !!! if you dont have animal construction you cannot use eat and drink, eat and drnink can be used in animal object, with
     */

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.leg();
        dog1.bark();
        dog1.eat();
        dog1.drink();
        dog1.feedBbayWithMilk();

        Cat cat1 = new Cat();
        cat1.meow();
        cat1.tail();
        cat1.eat();
        cat1.drink();
        cat1.feedBbayWithMilk();

        Bird bird1 = new Bird();
        bird1.tweeet();
        bird1.eat();
        bird1.drink();
        //bird1.feedBbayWithMilk() cannot be used because bird class is child of Animal class not Mammals class

        Animal animal1 = new Animal();
        //animal1. cannot use bark, meow or tweet

    }
}
