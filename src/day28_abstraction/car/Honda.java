package day28_abstraction.car;

public class Honda extends Car{

    String make = "Honda";
    String model = "Accord";
    int year = 2022;

    @Override
    public void make() {

        System.out.println("My car is " + make);
    }

    @Override
    public void model() {
        System.out.println("My car model " + model);
    }

    @Override
    public void year() {

        System.out.println("My car is " + year + " year");
    }

}
