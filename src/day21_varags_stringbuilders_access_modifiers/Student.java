package day21_varags_stringbuilders_access_modifiers;

public class Student extends Parent{ // student class is child of parent class

    public String name = "Ali Can";

    Integer age = 12;

    private char initial = 'A';

    public static void main(String[] args) {
        Parent std1 = new Parent();
        std1.illness.toLowerCase();
        System.out.println(std1);
    }




    //protected

    /* Note 1: if you do not type any access modifier, it means the access modifier is "default"
       Note 2: "public" class member (variables and methods) are accessible from entire the project
       Note 3: "private" class member cannot be accessible from other classes and from other packages
               "private" class member can be accessible just from just the class itself
       Note 4: "default" (package private) class members cannot be accessible from other packages
       Note 5: "protected" class member can be accessible from all child classes in any packages
                "protected" class member cannot be accessible from other packages if are not child class
                while you are in same package, you don't have to be child to access "protected"
                if you are in different package you have to be child to access "protected"
       Note 6: class cannot be protected and cannot be private
               "protected and private access modifiers are just for class members not for classes
     */

    /*
    1) what is the differences between "public" and "default" (package private)
    answer: no restriction from public n entire project
            no restriction from default in entire porject

    2) what is difference between protected and default?
    answer: no restriction from protected in entire child classes
            no restriction for protected in the package
            no restriction for default in entire the package
    3) what is the difference be between public and projected
    answer: no restriction for public in entire project
    n


     */


}
