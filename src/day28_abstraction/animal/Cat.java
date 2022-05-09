package day28_abstraction.animal;

public class Cat extends Animal{

    String sound; // class variables
    String name; // class variables

    public Cat (String s1, String n1){ // constructor

        this.name = n1; // initialize variables
        this.sound = s1; // initialize variables
    }

    @Override
    public void animalSounds() {

        System.out.println("Sound of animal is " + sound);
    }

    @Override
    public void animalName() {
        System.out.println("Name of the animal is " + name);

    }
}
