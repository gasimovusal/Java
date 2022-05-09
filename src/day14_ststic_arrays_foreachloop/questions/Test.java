package day14_ststic_arrays_foreachloop.questions;

import java.util.Scanner;

public class Test {

    String studentName; //instance variable , do not change for every object, changed only specific object
    String year = "2020"; //instance variable
    static int counter = 1000; //static variable; changes for every object
    String studentId; //instance variable

    public Test() { //constructor because no return type

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name");
        studentName = scan.next(); // next method only takes first word so it will be Ali and Veli
        setStudentId();
    }

    public static void main(String[] args) {

        Test student1 = new Test();
        System.out.println(student1.studentName + student1.studentId); //A Ali20201001

        Test student2 = new Test();
        System.out.println(student2.studentName + student2.studentId); //B Veli20201002
    }

    public void setStudentId() {

        counter++; // for Ali 1000+1 = 1001 ; for Veli 1001+1=1002
        this.studentId = year + "" + counter;

    }
}
