package practicequestionsession.practice07.reviewquestions;

public class Q11 {

        public static void main(String[] args) {

            String s1 = "";
            String s2 = null;

            try {

                s1 = s1 + "J";

                System.out.println(s2.length()); //

                s1 = s1 + "a";

            }catch(ArithmeticException e) {

                s1 = s1 + "v";

            }catch(NullPointerException e) {

                s1 = s1 + "u";

            }finally{

                s1 = s1 + "n";

            }
            s1 = s1 + "e";

            System.out.println(s1);
        }
    }

    //What is the output? June

