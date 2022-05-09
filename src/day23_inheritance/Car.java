package day23_inheritance;

public class Car extends Motorized{

    public Car(String make){
        super(16);
        //super means go to the parent, () means constructor
        //super() must be first statement in constructor body
        //you cannot use more than 1 super() constructor call
        System.out.println("Car constructor with String parameter");
    }
    public Car(int price){
        super(20);
        System.out.println("Car constructor with integer parameter");
    }
}
