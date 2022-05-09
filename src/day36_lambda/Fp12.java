package day36_lambda;

import java.util.ArrayList;
import java.util.List;

public class Fp12 {

    public static void main(String[] args) {

        Courses courseTurkishDay = new Courses("Summer", "Turkish Day", 97, 128);
        Courses courseTurkishNight = new Courses("Winter", "Turkish Night", 98, 154);
        Courses courseEnglishDay = new Courses("Spring", "English Day", 95, 132);
        Courses courseEnglishNight = new Courses("Winter", "English Night", 93, 144);

        List<Courses> coursesList = new ArrayList<>();

        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(checkAverageGreaterThanNumber(coursesList, 90));

    }

    // Create a method to check if all average scores are greater than given number
    public static boolean checkAverageGreaterThanNumber(List<Courses> coursesList, int num){

        return coursesList.stream().allMatch(t -> t.getAverageScore() > num);
    }

}
