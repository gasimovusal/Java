package day13_statickeyword_variabletypes;

public class Static02 {

    public static void main(String[] args) {

        Static01 obj4 = new Static01();
        System.out.println(Static01.sCounter); //output 1
        //we are using ram memory, when you execute the code, all the data from previous memory will be cleared
        //to access static variable no need to use object, just by using class name you can access to it
        //class name

        System.out.println(obj4.iCounter); //output 1
        //you cannot use class name instead of objects in instance variable you will give java many options, java will not know which object to use
        //if you don't use object name in "sout", java wil not understand where to find object variable
        //by using class names it is impossible to access instance variables
    }
}
