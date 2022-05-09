package day23_inheritance;

public class Motorized extends Vehicle{

    public Motorized(int capacity){
        super("Be careful");
        System.out.println("Motorized constructor with integer parameter");
    }

    //NOTE: we do not need to type super() because Java puts it automatically because in Paren clas, Vehicle, there is public Vehicle(){} constructor which has no parameter
}
