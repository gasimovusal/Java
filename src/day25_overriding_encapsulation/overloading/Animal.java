package day25_overriding_encapsulation.overloading;

public class Animal {

    public void eat(){

        System.out.println("Animal eat");
    }
    public void drink(){

        System.out.println("Animals drink");
    }
    public Animal myMethod(){
        // in a method, public is access modifier, Animal is return type, myMethod is method name and method parenthesis()
        return new Animal(); // creating animal object and returning it
    }

    public Float yourMethod(){

        return 1.2F;
    }

    public void legs(){

        System.out.println("Animal has legs");
    }
}
