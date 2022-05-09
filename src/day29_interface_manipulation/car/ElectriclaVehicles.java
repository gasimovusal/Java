package day29_interface_manipulation.car;

public abstract class ElectriclaVehicles implements AirCondition{

    /*
    abstract class can have abstract methods and non-abstract methods so we can override and implement
    super class ir interface methods in abstract class
    but this cannot be achieved in Interface
     */


    @Override
    public void electronicAc() {
        System.out.println("Electrical vehicle AC");
    }

    @Override
    public void bacteriaKiller() {

        System.out.println("Electrical vehicle bacteria killers");
    }
}
