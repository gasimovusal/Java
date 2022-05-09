package day14_ststic_arrays_foreachloop;

public class Student {

    //if you dont have a MAIN METHOD, you can not run the code

    String name;
    int year = 2022;
    static int counter = 1000;
    String studentId;

    public String setStudentId(){

        counter++;
        studentId = year + "" + counter;
        /* studentId is string but year and counter is integer
        you cannot put integer to string because addition of 2 int result will be int, not string
        if you put "", result of + "" + will be concatenation
         */
        return studentId;
        // if the return type of the method is not void, you have to use "return" key word inside the method
    }

}
