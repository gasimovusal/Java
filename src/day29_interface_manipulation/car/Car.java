package day29_interface_manipulation.car;

public class Car implements AirCondition, HybridEngine{


    @Override
    public void electronicAc() {
        System.out.println("Car AC is electronic");
    }

    @Override
    public void climateAc() {
        System.out.println("Car AC is climate AC");

    }

    @Override
    public void bacteriaKiller() {
        System.out.println("Car AC kills 99% of bacteria");

    }

    @Override
    public void run() {
        System.out.println("Car AC runs perfectly");

    }

    @Override
    public void havingHybridEngine() {
        System.out.println("Car engine is hybrid");
    }
}
