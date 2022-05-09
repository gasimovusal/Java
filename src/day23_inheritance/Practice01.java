package day23_inheritance;

public class Practice01 {
    int a = 12;
    public void rest(){
        System.out.println("XXX");
    }
    public Practice01(){
        System.out.println("A");
    }
    public Practice01(int a){
        System.out.println("B");
    }
}

class Practice02 extends Practice01{
    int a = 13;
    public void rest(){
        System.out.println("YYY");
    }
    public Practice02(){
        super(12);
        System.out.println("C");
    }
    public Practice02(int i){
        super();
        System.out.println("E");
    }
}

class Practice03 extends Practice02{
    int a = 14;  //it you make any variable private, it cannot be inherited
                 // public, protected class member can be inherited without any issue
                 // default class members can be inherited just in the same package
    public void rest(){
        System.out.println("ZZZ");
    }
    public Practice03(String s){
        super(11);
        System.out.println("D");
    }
}

class Runner{
    public static void main(String[] args) {
        Practice03 obj1 = new Practice03("Woow!");
        System.out.println(obj1.a);//14 java select variables by looking at the data type of the object
        obj1.rest();//ZZZ ==> Java select methods by looking at the constructor at object, looks at Practice 03
        Practice02 obj2 = new Practice03("woow");
        System.out.println(obj2.a);//13 // if a class does not have an "a" java looks for "a" in parent classes. If any parent does not have "a", you will get Compile Time Error
        obj2.rest();//ZZZ
        Practice01 obj3 = new Practice03("woow");
        System.out.println(obj3.a);//12
        obj3.rest();//ZZZ
        //you can use parent's data type in the child class
        //using parent's data type will be general, if you want to use specific data type use own class as data type (1:38 video)

        /* NOTE:
        1) From top to down, wen cannot use "is a " structure
            from bottom to top we can use "is a " structure
        2) from top to down, we can use "has a" structure

        In inheritance, from child to parent, you must have "is a" relationship, from parent to child, you must have "has a" relationship
         */
    }
}

