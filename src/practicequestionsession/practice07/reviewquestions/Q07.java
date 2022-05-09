package practicequestionsession.practice07.reviewquestions;

public class Q07 {

    public class Test {

        public static void main(String[] args) {

            try {

                int a = 0;

                System.out.println("Hi");

                int b = 20 / a;

                System.out.println("How are you?");

            } catch (ArithmeticException e) {

                System.out.println("Good");

            } finally {

                System.out.println("Bad");
            }
        }
    }
    // What is the output? Hi
    //                     Good
    //                     Bad
}
