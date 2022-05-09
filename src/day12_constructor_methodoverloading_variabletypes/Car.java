package day12_constructor_methodoverloading_variabletypes;

public class Car {

    /*
    constructors are used to create object from a class
    java puts default constructors inside every class
    default constructors does not have any parameters inside the construct parenthesis
    constructor names must match with the class names

    constructors can not be typed inside main method
    if you create your own constructor, JAVA will delete default

    how to create a constructor?:
    1) type access modifier
    2) type the class name as constructor name
    3) open-close parenthesis ()
    4) press enter
    5) in a class, we can have multiple constructors
     */

    String make;
    String model;
    double price;
    double year;

    //This constructor is the same with default constructor, it is very simple
    public Car(){

    }

    //inside() you can type parameters
    //this means variable created inside the
    public Car(String make, String model, double price, double year){
        this.make = make; //putting data into reserve area
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.make = "Honda";
        c1.model = "Civic";
        c1.price = 10000;
        c1.year=2015;

        Car c2 = new Car();
        c2.make = "Audi";
        c2.make = "A5";
        c2.price = 45000;
        c2.year = 2022;

        Car c3 = new Car("BMW", "M5", 7000, 2019);

        Car c4 = new Car ("Mercedes", "CLS63AMG", 82000, 2022);

        Car c5 = new Car("Lamborghini", "Urus");
    }
    //access modifier;      return type;     method name
           public          String       run(){
        return "I started running";

        /* differences between method and constructors
         1) in method we must put have return type, but in constructor we don't have return type
         2) when you create a method, you can put any name
            constructors name must match with the class name you cannot use any name for the constructors
         */

    }

}
