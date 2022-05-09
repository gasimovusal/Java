package day28_abstraction.calculator;

public class CalculatorRunner {

    public static void main(String[] args) {

        Calculator calculator = new Profit();
        // we are using polymorphism, inheritance, abstraction

        int num1 = 20;
        int num2 = 10;

        System.out.println(calculator.addition(num1, num2));
        System.out.println(calculator.multiplication(num1, num2));


        Calculator calculator1 = new Loss();

        System.out.println(calculator1.addition(num1, num2));

        System.out.println(calculator1.division(num1, num2));
        System.out.println(calculator1.subtraction(num1, num2));


    }
}
