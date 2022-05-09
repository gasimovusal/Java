package day23_inheritance;

public class Bus extends Motorized{

    public Bus(int numOfPassangers){
        super(35);
        System.out.println("Bus constructor with integer parameter");
    }
}
