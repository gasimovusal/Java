package day29_interface_manipulation.car;

public interface Vehicle {

    default void move(){
        System.out.println("All vehicles should move");
    }

    static void staticMove(){

        System.out.println("All vehicles should move batter");
    }


}
