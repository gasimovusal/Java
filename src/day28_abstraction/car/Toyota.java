package day28_abstraction.car;

public class Toyota extends Car{

    String make = "Toyota";
    String model = "Camry";
    int year = 2022;

    @Override
    public void make() {

        System.out.println("this is " + make + " make");
    }

    @Override
    public void model() {

        System.out.println("this is " + model + " model");
    }

    @Override
    public void year() {

        System.out.println("this is " + year + " year of my car");
    }
}
