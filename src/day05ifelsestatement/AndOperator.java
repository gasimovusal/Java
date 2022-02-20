package day05ifelsestatement;

public class AndOperator {

    public static void main (String[] args){

        //&& argument, both statement has tue be true
        //If I have a money], I can buy something and if I have a car, I can go to shopping

        boolean money = true;
        boolean car = false;

        if (money && car){
            System.out.println("I can go to shopping and buy something");
        } else{
            System.out.println("I cannot buy anything");
        }

    }
}
