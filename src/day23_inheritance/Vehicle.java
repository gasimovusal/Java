package day23_inheritance;

public class Vehicle {

    public Vehicle(){
        System.out.println("Vehicle constructor without parameter");
    }
    public Vehicle(String note) {
        this(); //by using this() you can do constructor call from inside the class
                //you cannot use more than 1 this() constructor call
        System.out.println("Vehicle constructor with String parameter");
    }
}
