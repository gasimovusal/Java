package day29_interface_manipulation.car;

public class RunnerClass {

    public static void main(String[] args) {

        HybridEngine hybridEngine = new Car();

        hybridEngine.havingHybridEngine();

        Car car = new Car();

        System.out.println(car.power());

        car.move();




    }
}
