package day13_statickeyword_variabletypes;

public class Static01 {

    public static int sCounter = 0;
    /*to create a static valuable, use "static" keyword before return type
    static variable has another name: class variable because ....
    static things is attached to .. not objects
    why do we need static variable?
        a)Because it will save space, instead of creating variable for each object, we are making it for all the objects
        b) if we update static variable for one object, static variable will be updated for other objects
     */

    public int iCounter = 0; //==>instance variable
    //to create instance variable, do not use static keyword

    public Static01(){ //for every usage, we are increasing variables by 1
        sCounter++;
        iCounter++;
    }

    public static void main(String[] args) {

        /* common object are called static, exp: moon is for every human
        static will save memory because you don't need to create for every object
        we want to update for common things so every other objects can see it
        specific object is called "instance" variable, other name is object variable
         */

        Static01 obj1 = new Static01();
        Static01 obj2 = new Static01();
        Static01 obj3 = new Static01();
        //by typing 3 types, we are creating 3 objects

        System.out.println("Value of sCounter:" + Static01.sCounter);
        System.out.println("Value of iCounter:" + obj2.iCounter);

        int age = 13; //local variable
        /* if you create a variable inside a method it is called "local variable"
        normally java assigns default values to variables  but if it is "local variable" java does not assign any value
        before using it you have to assign a value otherwise it will complain
        local variables cannot be used outside the method
        you can only use local value only inside of method, you cannot use outside of method that was created
        note: static variables and instance variables can be used in entire class
        */

        System.out.println(age);

        add(3, 5); //
        //the real values used in method called arguments
    }

    public static int add(int a, int b){ //the variable like "int a" and "int b" are called parameters
        int c = 2; //this is local variable because it's inside the "add" method
        return c+a+b;
    }
}
