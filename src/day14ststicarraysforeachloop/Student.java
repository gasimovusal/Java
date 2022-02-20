package day14ststicarraysforeachloop;

public class Student {

    //if you dont have a MAIN METHOD, you can not run the code

    String name;
    int year = 2022;
    static int counter = 1000;
    String studentId;

    public String setStudentId(){

        counter++;
        studentId = year + "" + counter; // we put "" because
        return studentId;
        // if the return type of the method is different from void you have to use "return" key word inside the method
    }

}
