package day25_overriding_encapsulation.overloading;

public class Dog extends Mammal{

    @Override // its called Annotation, it checks the Overriding rules
              // if you do any mistakes in Overriding you will get Compile Time Error
    public void eat() {
        System.out.println("Dogs eat");
        //updating method body
    }

    public void bark(){

        System.out.println("Dogs bark");
    }

    @Override
    public Float yourMethod() { // in return type, you have to use parent-child relationship
        return 2.3F;
    }

    @Override
    public void legs() {
        System.out.println("Dogs have a legs");
    }
}
