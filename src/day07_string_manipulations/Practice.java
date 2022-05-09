package day07_string_manipulations;

import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter you first name");
        String name = scan.nextLine();

        String join = name.concat("1").concat("2");
        System.out.println(join);






    }
}
