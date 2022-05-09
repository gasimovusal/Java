package day19_pass_byvalue_datetime_classes;

public class PassByValue {

    public static void main(String[] args) {

        // java is passing the value not variable
        /*
            1) when you use a variable inside a method, Java creates a copy of the variable and use the copy inside the method.
               Java wants to protect original value of the variable. This process is called "Pass by value" in Java.
            2) Java uses "Pass by Value" every time.
            3) the opposite of Pass by Value is "Pass by Reference". Java does use "Pass by References".
                because if you make any update on value, both value of original and copy will change. In "Pass by Value only copy will change
         */
        int shirt = 100;

        int veteranShirt = veteransDiscount(shirt); //puts shirt to veteransDiscount and shirt price changes
        System.out.println(veteranShirt); // 80

        int seniorShirt = seniorDiscount(shirt);
        System.out.println(seniorShirt); // 90

        int studentShirt = studentDiscount(shirt);
        System.out.println(studentShirt); // 95

        System.out.println(shirt); // 100 original value does not change

    }

    //main method is static, everything you used in main method must be static

    public static int veteransDiscount(int shirt){

        return shirt-20;
    }

    public static int seniorDiscount(int shirt){

        return shirt-10;
    }

    public static int studentDiscount(int shirt){

        return shirt-5;
    }


}
