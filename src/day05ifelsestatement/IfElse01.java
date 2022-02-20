package day05ifelsestatement;

public class IfElse01 {

    public static void main(String[] args){

        boolean cashMoney = false;
        boolean debitCard = false;

        //Else condition used if both cases are not true
        if (cashMoney || debitCard){
            System.out.println("I can buy PC");
        } else {
            System.out.println("I can not but a PC");
        }



    }
}
