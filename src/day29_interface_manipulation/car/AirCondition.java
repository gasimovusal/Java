package day29_interface_manipulation.car;

public interface AirCondition extends Vehicle {

/*
interface is not a class, but it is an Interface
a class should be able to use multiple interface as parent
in an interface most methods are abstract
but we can still use some concrete methods that are static and default
we do not need to use abstract keyword for an interface (for interface name)
we use a variable in an interface, we need to assign a value
in abstract class, we can have constructors but we interface we cannot have a constructors

differences between interface constructors????? saat 12:20
    interface cannot have concrete methods other than default and static
    abstract class can have concrete and abstract methods

 */

    String MAKE = "Samsung";
    //when we use final variables, the name of the variables should be written in UPPERCASE letters

    //3 different way using abstract methods

    public abstract void electronicAc();

    public void climateAc();

    void bacteriaKiller();

    void run();

    public default int power(){

        System.out.println("Hybrid engines are increasing their powers");

        return 1000;
    }

    public static String model(){

        System.out.println("The best model ever");
        return "the best...";
    }
}
