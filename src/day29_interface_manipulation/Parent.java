package day29_interface_manipulation;

public interface Parent {

    /*
    Interface looks like a class but IT IS NOT a class
    An interface can have just abstract methods. But abstract classes can have both abstract and concrete methods
    By default, variables declared in an interface are public, static and final
    Making variable as Private or Protected will trigger a compiler error
    You have to initialize the variable when you declare, otherwise you get Compile Time Error
    Methods must be abstract
    Concrete class that implements interface must implement all the methods of the interface
    Java programming language does not allow you to extend more than one class
    But you can implement more than one interfaces in you class
    Differences between implement and extends?????????? implements key word is like a multiple extends
    You cannot create an object from an interface
    If you need a method body (concrete method) in an interface, you must use default or static keyword

    ....

     */

    int num = 10;

    public void addd();
    //by default, the above method is abstract

    String add();
    //I need to override this method
    //by default, the above method is abstract

    //int num; will give you compile time error because we did not assign value


    //signature means order of parameters, number of parameters, types of parameters
}
