package day28_abstraction.animal;

public class AnimalRunner {

    public static void main(String[] args) {

        /*
        create 2 animals, one cat and one sheep
        make their sounds as necessary
        type their names
        call them from your objects
         */

        //reference type        object type
        Animal animal =     new Cat("meow", "Tom");
        Sheep animal2 =     new Sheep("meeee", "khan");

        animal.animalSounds();
        animal.animalName();

        animal2.animalName();
        animal2.animalSounds();
    }
}
