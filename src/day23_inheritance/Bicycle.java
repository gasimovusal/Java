package day23_inheritance;

public class Bicycle extends Vehicle{

    public Bicycle(String make){

        System.out.println("Bicycle constructor with parameter");
        //when you execute the code in runner class, public Vehicle(){} because this constructor has no parameter so it will be used first (video 45:00)
    }
}
