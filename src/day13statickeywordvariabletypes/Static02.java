package day13statickeywordvariabletypes;

public class Static02 {

    public static void main(String[] args) {

        Static01 obj4 = new Static01();
        System.out.println(Static01.sCounter); //output 1
        // if you don't use object, java wil not understand where to find object variable
        //to access static variable np need tp use object, just by using class name you can access to it
        //class name

        System.out.println(obj4.iCounter); //output 1
        //you cannot use class name instead of objects you will give java many options, java will not know which object to use
        //to access "instance variable" you java to use objects
        //by using class names it is impossible to access instance variables
    }
}
