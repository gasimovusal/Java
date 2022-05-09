package day14_ststic_arrays_foreachloop;

public class StudentRunner {
    public static void main(String[] args) {
        //to access static class members, "class name" is enough to access
         //if you use class name you can only see static
        System.out.println(Student.counter);

        //to access non-static class members, you have to create an object
        Student std1 = new Student();
        System.out.println(std1.setStudentId());

        //std1.counter ==> will give an error because java does not want us use statuc value with THIS
        // if you want to print, java will print
        System.out.println(std1.counter);


    }
}
