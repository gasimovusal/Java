package day22_inheritance;

public class Dog extends Mammals{
    //class name before the "extends" keyword is the child class
    //class name after the "extends" keyword is the parent class

    public void bark(){

        System.out.println("Dogs bark...");
    }

    public Dog(){

        System.out.println("Dog constructor");
    }

}
