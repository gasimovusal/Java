package day23_inheritance;

public class VehicleRunner {

    public static void main(String[] args) {

        Car car1 = new Car("Honda");

        Bus bus1 = new Bus(25);

        Bicycle bc1 = new Bicycle("Nike");

        //you can use parent's data type in the child claass
        //using parent's data type will be general, if you want to use specific data type use own class as data type (1:38 video)
    }
}
