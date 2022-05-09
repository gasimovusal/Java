package day24_object_manipulations;

public class Person {

    public String name;
    public String lastName;
    private int id;
    private int age;
    private double salary;

    public Person(){

    }
    public Person(String name, String last){

        this.name = name; // initializing class variable
        this.lastName = last;
    }

    public static void main(String[] args) {

        Person person = new Person("Maha", "Wael");

        System.out.println(person.name);
        System.out.println(person.lastName);

        String name = "Kerem";
        name = name.replace("e", "a");
    }
}
