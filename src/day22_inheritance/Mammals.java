package day22_inheritance;

public class Mammals extends Animal{

    public void feedBbayWithMilk (){

        System.out.println("Mammals feed baby with milk...");
    }

    public Mammals(){

        System.out.println("Mammals constructor");
    }
    public void leg(){

        System.out.println("Animal has a leg");
    }
    public void tail(){
        System.out.println("Animal has a tail");
    }
}
