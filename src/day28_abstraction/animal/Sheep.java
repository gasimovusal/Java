package day28_abstraction.animal;

public class Sheep extends Animal {

    String sound;
    String name;

    public Sheep (String s1, String n1){

        this.sound = s1; // initialize variables
        this.name = n1; // initialize variables
    }

    @Override
    public void animalSounds() {

        System.out.println("Animal sound is " + sound);
    }

    @Override
    public void animalName() {

        System.out.println("Animal name is " + name);
    }
}
