package day24_object_manipulations;

import java.util.ArrayList;
import java.util.List;

public class MainRunner4 {

    /* ask user to type 3 names and 3 last names
    then concatenate the names with last names and add "@gmail.com"
    print them on the console
     */

    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        Person person1 = new Person("Vusal", "Gasimov");

        Person person2 = new Person("Firudin", "Gasimov");

        Person person3 = new Person("Cagri", "Bakar");

        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println(people.size());

        /* 1. way
        for(Person person: people){
            System.out.println(person.name);
            System.out.println(person.lastName);
        }
         */

        // 2. way
        for(int i=0; i< people.size(); i++){

            System.out.println(people.get(i).name);
            System.out.println(people.get(i).lastName);
        }

        generateEmails(people);
    }

    public static void generateEmails(List<Person> people){


//        System.out.println("email1: " + people.get(0).name + people.get(0).lastName + "@gmail.com");
//        System.out.println("email2: " + people.get(1).name + people.get(1).lastName + "@gmail.com");
//        System.out.println("email3: " + people.get(2).name + people.get(2).lastName + "@gmail.com");

        for(Person eachPerson: people){

            System.out.println(eachPerson.name+eachPerson.lastName+"@gmail.com");
        }
    }
}
