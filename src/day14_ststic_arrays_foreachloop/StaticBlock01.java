package day14_ststic_arrays_foreachloop;

public class StaticBlock01 {

    static double pi; //static variable (aka creation)
    static double eNumber;

    //cyntex of static block: (aka initialization)
    static{
        System.out.println("First static block");
        pi=3.14;
    }
    //we do not put static variable inside static block.

    public StaticBlock01(){
        System.out.println("Constructor");   //static block will be executed before Constructor
    }
    static{
        System.out.println("Second static block");
        eNumber = 2.7;
    }
    //note: if you have multiple static blocks, execution order will be from top to bottom
    //we break static blocks in small parts, we do not enter all data in one static block.

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
         */

    }
}
