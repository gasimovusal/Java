package day14ststicarraysforeachloop;

public class StaticBlock01 {

    static double pi;
    static double eNumber;

    //cyntext of static block:
    static{
        System.out.println("First static block");
        pi=3.14;
    }
    public StaticBlock01(){
        System.out.println("Constructor");   //static block will be executed before Constructor
    }
    static{
        System.out.println("Second static block");
        eNumber = 2.7;
    }

    public static void main(String[] args) {

        //if you click on run button in main method, "class loader" will be activated,
        // class loader will start to load StaticBlock01 class into the memory
        //inside the class you will have many codes
        //java will have an order to execute the codes

        System.out.println("main method");
        StaticBlock01 obj1 = new StaticBlock01();
        double r = 2;
        double are = pi*r*r;

        /*sometimes you will need some data just after class loader
        we use static block for this kind of scenarios
        when you use static block, it will be executed before main method, any other methods, constructors, it will be first code executed
         Note: static block is used to initialized static variables when we want them before everything before class
         */

    }
}
